package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

import java.io.IOException;

@ActiveProfiles("snake")
@JsonTest
public class BeerDtoSnakeTest extends BaseTest {

    @Test
    public void testSnake() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String string = objectMapper.writeValueAsString(beerDto);

        System.out.println(string);
    }

    @Test void testDeserializationSnake() throws IOException {
        BeerDto beerDto = objectMapper.readValue("{\"beerId\":\"e8648e44-46c1-4a96-b981-f46a8b38d791\",\"beer_name\":\"BeerName\",\"beer_style\":\"Ale\",\"upc\":123123123123,\"price\":12.99,\"last_updated_date\":\"2020-05-22T13:19:35.91888+02:00\"}", BeerDto.class);

        System.out.println(beerDto);
    }
}
