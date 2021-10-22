package gwap.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VariantsService {
    private static final List<Variant> VARIANTS = new ArrayList<>();

    public static List<Variant> getVariants() {
        VARIANTS.add(new Variant(1, 1, 1, ""));
        return VARIANTS;
    }

    public void addVariant(Variant variant) {
        VARIANTS.add(variant);
    }



}
