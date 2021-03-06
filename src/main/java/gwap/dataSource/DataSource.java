package gwap.dataSource;

import com.google.gson.Gson;
import gwap.model.Variant;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static Variant getAirplanes()  {
        final Content postResult;
        try {
            postResult = Request.Get("https://api.travelpayouts.com/aviasales/v3/prices_for_dates?origin=MOW&destination=DXB&currency=usd&departure_at=2022-03-01&return_at=2022-03-10&sorting=price&direct=true&limit=1&token=7c053b6e5ccb3fae3e68ffbd14025d7b")
                    .execute().returnContent();

            String jnString = postResult.asString().replace("{\"success\":true,\"data\":[", "");
            jnString = jnString.replace("],\"currency\":\"usd\"}", "");

            Gson gson = new Gson();
            Variant fitVariant = gson.fromJson(jnString, Variant.class);
            fitVariant.setTime(140);
            fitVariant.setCategory("airplane");
            fitVariant.setPrice(fitVariant.getPrice() * 15);
            return fitVariant;


        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Variant> getTraines() throws IOException{
        List<Variant> variants = new ArrayList<>();
        variants.add(new Variant("", 3154, 2520, "bus", ""));
        variants.add(new Variant("", 3100, 5000, "train-plachcart", ""));
        variants.add(new Variant("", 3100, 7000, "train-cupe", ""));
        return variants;
    }

    /*public static List<Variant> getAuto() throws IOException{
        Content result = Request
                .Post("https://hotels4.p.rapidapi.com/locations/search?query=new%20york&locale=en_US")
                .execute().returnContent();
        return null;
    }*/

}
