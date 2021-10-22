package gwap.model;

public class Variant {
    Integer id;
    Integer price;
    Integer time;
    String category;

    public Variant(Integer id, Integer price, Integer time, String category) {
        this.id = id;
        this.price = price;
        this.time = time;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getTime() {
        return time;
    }

    public String getCategory() {
        return category;
    }
}
