package josehomenhuck.clickbus.web;

import josehomenhuck.clickbus.api.PlaceResponse;
import josehomenhuck.clickbus.domain.Place;

public class PlaceMapper {
  public static PlaceResponse toResponse(Place place) {
    return new PlaceResponse(place.name(), place.slug(), place.state(), 
                              place.createdAt(), place.updatedAt());
  }
}
