package josehomenhuck.clickbus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

import josehomenhuck.clickbus.domain.PlaceRepository;
import josehomenhuck.clickbus.domain.PlaceService;

@Configuration
@EnableR2dbcAuditing
public class PlaceConfig {
  
  @Bean
  PlaceService placeService(PlaceRepository placeRepository) {
    return new PlaceService(placeRepository);
  }
}