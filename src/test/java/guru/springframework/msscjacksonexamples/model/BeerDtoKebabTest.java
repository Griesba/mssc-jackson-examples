package guru.springframework.msscjacksonexamples.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

import java.io.IOException;

@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BaseTest {


    @Test
    public void testSerializationKebab() throws IOException {
        String beerDtoStr = objectMapper.writeValueAsString(getDto());
        System.out.println(beerDtoStr);

        BeerDto beerDto = objectMapper.readValue(
                "{\"beer-name\":\"BeerName\",\"beer-style\":\"Ale\",\"upc\":123123123123,\"price\":\"12.99\"," +
                        "\"last-updated-date\":\"2020-05-22T14:19:16.29866+02:00\"," +
                        "\"local-date\":\"20200522\"}",
                BeerDto.class);

        System.out.println(beerDto);
    }

}
