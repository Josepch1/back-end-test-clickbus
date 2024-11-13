package josehomenhuck.clickbus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import josehomenhuck.clickbus.api.PlaceRequest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ClickbusApplicationTests {
	@Autowired
	WebTestClient webTestClient;

	@Test
	public void testCreatePlaceSuccess() {
		var name = "Place Name";
		var state = "Place State";
		var slug = "place-name";

		webTestClient
			.post()
			.uri("/places")
			.bodyValue(
				new PlaceRequest(name, state)
			)
			.exchange()
			.expectStatus().isCreated()
			.expectBody()
			.jsonPath("name").isEqualTo(name)
			.jsonPath("state").isEqualTo(state)
			.jsonPath("slug").isEqualTo(slug)
			.jsonPath("createdAt").isNotEmpty()
			.jsonPath("updatedAt").isNotEmpty();
	}

	@Test
	public void testCreatePlaceFailure() {
		var name = "";
		var state = "";

		webTestClient
			.post()
			.uri("/places")
			.bodyValue(
				new PlaceRequest(name, state)
			)
			.exchange()
			.expectStatus().isBadRequest();
	}
}
