package gwap.model;

import java.util.List;

public class Place {

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
