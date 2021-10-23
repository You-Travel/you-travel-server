package gwap.model;


import com.google.gson.annotations.SerializedName;

public class Variant {
    @SerializedName("link")
    String link = "";
    @SerializedName("price")
    Integer price = 0;
    Integer time = 140;
    String category = "airplane";
    @SerializedName("departure_at")
    String data = "";

    public Variant(String link, Integer price, Integer time, String category, String data) {

        this.link = link;
        this.price = price;
        this.time = time;
        this.category = category;
        this.data = data;
    }

    public String getLink() {
        return link;
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

    public String getData() {
        return data;
    }
}
