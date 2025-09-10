package oop.ex;

/**
 * מייצגת מוצר לבוש עם גודל ספציפי.
 */
public class Clothing extends Product {
    private String size; // גודל המוצר

    public Clothing(String productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    /** מחזירה תיאור הכולל את שם המוצר, הגודל והמחיר */
    @Override
    public String getDescription() {
        return getName() + " (Clothing) - Size: " + size + ", Price: $" + price;
    }
}

