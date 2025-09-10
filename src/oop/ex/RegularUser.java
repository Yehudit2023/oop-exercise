package oop.ex;

import java.util.ArrayList;
import java.util.List;

/**
 * מייצגת משתמש רגיל במערכת.
 * יכול להוסיף מוצרים לעגלת הקניות ללא הנחות.
 */
public class RegularUser implements User {
    private String username;       // שם המשתמש
    private List<Product> cart;    // עגלת הקניות של המשתמש

    public RegularUser(String username) {
        this.username = username;
        this.cart = new ArrayList<>();
    }

    @Override
    public String getUsername() {
        return username;
    }

    /** מוסיפה מוצר לעגלת הקניות */
    @Override
    public void addProductToCart(Product product) {
        cart.add(product);
        System.out.println(product.getName() + " added to " + username + "'s cart.");
    }


    /** מחזירה את תוכן עגלת הקניות */
    @Override
    public List<Product> getCartContents() {
        return cart;
    }
}

