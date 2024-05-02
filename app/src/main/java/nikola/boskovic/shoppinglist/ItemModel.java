package nikola.boskovic.shoppinglist;

import android.graphics.drawable.Drawable;

public class ItemModel {
    private Drawable image;
    private String name;
    private String price;


    public ItemModel(Drawable image, String name, String price) {
        this.image = image;
        this.name = name;
        this.price = price;
    }

    public Drawable getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
