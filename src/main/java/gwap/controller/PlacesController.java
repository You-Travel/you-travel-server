package gwap.controller;

import gwap.model.Place;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PlacesController {

    @GetMapping(value = "/places")
    public ResponseEntity<List<Place>> getPlaces() {

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

            return new ResponseEntity<>(places, HttpStatus.OK);
    }
}
