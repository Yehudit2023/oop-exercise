package oop.ex;

/**
 * מחלקה אבסטרקטית המייצגת מוצר כללי במערכת המסחר.
 * מכילה תכונות משותפות לכל סוגי המוצרים: מזהה, שם ומחיר.
 * מחלקות יורשות (כגון Electronics, Clothing) מיישמות את המתודה getDescription().
 */
public abstract class Product {
    private String productId; // מזהה ייחודי של המוצר
    private String name;      // שם המוצר
    protected double price;   // מחיר המוצר (נגיש לתת-מחלקות)

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    /** מחזירה את מזהה המוצר */
    public String getProductId() {
        return productId;
    }

    /** מחזירה את שם המוצר */
    public String getName() {
        return name;
    }

    /** מחזירה את מחיר המוצר */
    public double getPrice() {
        return price;
    }

    /** מתודה אבסטרקטית המוחזרת תיאור המוצר, מימוש על ידי מחלקות יורשות */
    public abstract String getDescription();
}
