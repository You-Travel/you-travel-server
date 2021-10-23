package gwap.controller;

import gwap.dataSource.DataSource;
import gwap.model.Variant;
import gwap.model.VariantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class VariantsController {
    private final VariantsService variantsService;


    @Autowired
    public VariantsController(VariantsService variantsService) {
        this.variantsService = variantsService;
    }

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
         findFitVariantsByAirplane(countPeople, budget);
        // findFitVariantsByAuto(countPeople, budget);
    }

    private void findFitVariantsByAirplane(Integer countPeople, Integer budget) {
            variantsService.addVariant(DataSource.getAirplanes());
            //check for the validity of options (if (price * 4 <= budget) {add to variants})
    }

    private void findFitVariantsByTrain(Integer countPeople, Integer budget) {
        try {
            DataSource.getTraines();
            //check for the validity of options (if (price * 4 <= budget) {add to variants})
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void findFitVariantsByAuto(Integer countPeople, Integer budget) {
        try {
            DataSource.getTraines();
            //check for the validity of options (if (price * 4 <= budget) {add to variants})
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
