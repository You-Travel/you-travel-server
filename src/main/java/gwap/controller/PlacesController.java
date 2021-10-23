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
                new Place("Baran-Rapan", 4, "₽₽₽₽", Arrays.asList("русская"), "1.jpg"),
                new Place("Пицца Фишт", 5, "₽₽", Arrays.asList("пицца", "итальянская"), "3.jpg"),
                new Place("Хмели & Сунели", 2, "₽₽", Arrays.asList("грузинская"), "2.jpg"),
                new Place("Ред-Буфет", 1, "₽₽₽", Arrays.asList("кафе", "фастфуд"), "4.jpg"),
                new Place("Мамино", 4, "₽₽", Arrays.asList("бар", "европейская"), "5.jpg"),
                new Place("KFC", 5, "₽₽₽₽₽", Arrays.asList("фастфуд"), "6.jpg"),
                new Place("Своя компания", 4, "₽₽", Arrays.asList("грузинская"), "7.jpg"),
                new Place("Хмели & Сунели", 5, "₽₽₽", Arrays.asList("грузинская"), "8.jpg")
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
