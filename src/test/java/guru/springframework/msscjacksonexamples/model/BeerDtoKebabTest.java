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
                "{\"beerId\":\"d2e691cd-5cbb-458f-8ac2-6f1b796284a1\",\"beer-name\":\"BeerName\",\"beer-style\":\"Ale\",\"upc\":123123123123,\"price\":12.99,\"created-date\":\"2020-05-22T13:37:29.5464511+02:00\",\"last-updated-date\":\"2020-05-22T13:37:29.5474271+02:00\"}",
                BeerDto.class);

        System.out.println(beerDto);
    }

}
