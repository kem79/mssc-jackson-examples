package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class BeerDtoTest extends BaseTest{

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserializeDto() throws IOException {
        String jsonString = "{\"beerId\":\"bebd2c0e-703c-4dbc-bf05-dc3297d75b47\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123344534534,\"price\":12.99,\"createdDate\":\"2021-03-05T09:04:53+0800\",\"lastUpdatedDate\":\"2021-03-02T09:13:15.5913845+08:00\"}";

        BeerDto dto = objectMapper.readValue(jsonString, BeerDto.class);

        System.out.println(dto);
    }

}