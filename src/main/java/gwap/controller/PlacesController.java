package gwap.controller;

import gwap.model.Variant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class PlacesController {

    @GetMapping(value = "/places")
    public List<Place> getPlaces() {

        List<Place> places = Arrays.asList(
                new Place("Baran-Rapan", 4, "₽₽₽₽", Arrays.asList("русская"), null),
                new Place("Пицца Фишт", 5, "₽₽", Arrays.asList("пицца", "итальянская"), null),
                new Place("Хмели & Сунели", 2, "₽₽", Arrays.asList("грузинская"), null),
                new Place("Ред-Буфет", 1, "₽₽₽", Arrays.asList("кафе", "фастфуд"), null),
                new Place("Мамино", 4, "₽₽", Arrays.asList("бар", "европейская"), null),
                new Place("KFC", 5, "₽₽₽₽₽", Arrays.asList("фастфуд"), null),
                new Place("Своя компания", 4, "₽₽", Arrays.asList("грузинская"), null),
                new Place("Хмели & Сунели", 5, "₽₽₽", Arrays.asList("грузинская"), null)
        );

        return places;
    }

    class Place {

        String name = null;
        int rate = 0;
        String price = null;
        List<String> tags = null;
        String pic = null;

        public Place(String name, int rate, String price, List<String> tags, String pic) {
            this.name = name;
            this.rate = rate;
            this.price = price;
            this.tags = tags;
            this.pic = pic;
        }

    }

}
