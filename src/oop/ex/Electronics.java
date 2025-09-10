package oop.ex;

/**
 * מייצגת מוצר אלקטרוני עם תקופת אחריות.
 */
public class Electronics extends Product {
    private int warrantyPeriod; // תקופת אחריות בחודשים

    public Electronics(String productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    /** מחזירה תיאור הכולל את שם המוצר, תקופת האחריות והמחיר */
    @Override
    public String getDescription() {
        return getName() + " (Electronics) - Warranty: "
                + warrantyPeriod + " months, Price: $" + price;
    }
}

