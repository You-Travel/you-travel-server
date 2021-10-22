import java.util.ArrayList;
import java.util.List;

public class VariantsService {
    private static final List<Variant> VARIANTS = new ArrayList<>();

    public static List<Variant> getClientRepositoryMap() {
        return VARIANTS;
    }

    public void addVariant(Variant variant) {
        VARIANTS.add(variant);
    }



}
