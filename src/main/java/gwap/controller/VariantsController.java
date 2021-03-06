package gwap.controller;

import gwap.dataSource.DataSource;
import gwap.model.Variant;
import gwap.service.VariantsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class VariantsController {
    private final VariantsService variantsService = new VariantsService();

    @GetMapping(value = "/variants")
    public ResponseEntity<List<Variant>> getFitVariants(
            @RequestParam(name = "budget") Integer budget,
            @RequestParam(name = "countPeople") Integer countPeople) {

        findFitVariants(countPeople, budget);

        final List<Variant> variants = variantsService.getVariants();
        return variants != null &&  !variants.isEmpty()
                ? new ResponseEntity<>(variants, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    private void findFitVariants(Integer countPeople, Integer budget) {
         addFitVariantByAirplane(countPeople, budget);
         addFitVariantByAuto(countPeople, budget);
         findFitVariantByTrain(countPeople, budget);
    }

    private void addFitVariantByAirplane(Integer countPeople, Integer budget) {
            Variant variant = DataSource.getAirplanes();
            if  (variant.getPrice() * countPeople <= 0.25 * budget) {
                variantsService.addVariant(variant);
            }
    }

    private void addFitVariantByAuto(Integer countPeople, Integer budget) {
        int price = 5000 * (int) Math.ceil(countPeople / 5.);
        if  (price <= 0.25 * budget) {
            variantsService.addVariant(new Variant(
                    "http://www.naprokat.ru/api/method_name?”params”&access_token=\"access_token\"",
                    price, 1195, "auto", "-"));
        }
    }

    private void findFitVariantByTrain(Integer countPeople, Integer budget) {
        try {
            List<Variant> trains = DataSource.getTraines();
            for (Variant train : trains) {
                if  (train.getPrice() <= 0.25 * budget) {
                    variantsService.addVariant(train);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
