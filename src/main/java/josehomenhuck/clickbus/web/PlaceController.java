package josehomenhuck.clickbus.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import josehomenhuck.clickbus.api.PlaceRequest;
import josehomenhuck.clickbus.api.PlaceResponse;
import josehomenhuck.clickbus.domain.PlaceService;
import reactor.core.publisher.Mono;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("places")
public class PlaceController {
  private PlaceService placeService;

  public PlaceController(PlaceService placeService) {
    this.placeService = placeService;
  }

  @PostMapping
  public ResponseEntity<Mono<PlaceResponse>> create(@Valid @RequestBody PlaceRequest request) {
    return ResponseEntity.status(HttpStatus.CREATED)
                          .body(placeService.create(request)
                                            .map(PlaceMapper::toResponse));
  }

}
