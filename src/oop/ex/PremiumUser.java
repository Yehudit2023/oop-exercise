package oop.ex;

import java.util.ArrayList;
import java.util.List;

/**
 * מייצגת משתמש פרימיום במערכת.
 * מקבלת הנחה על כל מוצר המתווסף לעגלה.
 */
public class PremiumUser implements User {
    private String username;          // שם המשתמש
    private String membershipLevel;   // רמת החברות
    private List<Product> cart;       // עגלת הקניות
    private double discountRate = 0.1; // 10% הנחה

    public PremiumUser(String username, String membershipLevel) {
        this.username = username;
        this.membershipLevel = membershipLevel;
        this.cart = new ArrayList<>();
    }

    @Override
    public String getUsername() {
        return username;
    }

    /** מוסיפה מוצר לעגלת הקניות עם הנחה */
    @Override
    public void addProductToCart(Product product) {
        double discountedPrice = product.getPrice() * (1 - discountRate);
        product.price = discountedPrice; // שינוי מחיר דינמי
        cart.add(product);
        System.out.println(product.getName() + " added to " + username + "'s cart with discount!");
    }

    /** מחזירה את תוכן עגלת הקניות */
    @Override
    public List<Product> getCartContents() {
        return cart;
    }
}
