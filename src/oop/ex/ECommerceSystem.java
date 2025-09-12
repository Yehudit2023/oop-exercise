package oop.ex;

import java.util.ArrayList;
import java.util.List;

public class ECommerceSystem {
    public static void main(String[] args) {
        // 1. יצירת מוצרים
        Product computer = new Electronics("E001", "Laptop", 1200.00, 24);
        Product tshirt = new Clothing("C001", "T-Shirt", 29.99, "M");
        Product camera = new Electronics("1221", "Camera", 2000, 5);

        // 2. יצירת משתמשים
        User regularUser = new RegularUser("Ari");
        PremiumUser premiumUser = new PremiumUser("David", "Gold");


        // 3. הוספת מוצרים לעגלות
        regularUser.addProductToCart(computer);
        regularUser.addProductToCart(tshirt);
        regularUser.addProductToCart(camera);

        premiumUser.addProductToCart(computer);
        premiumUser.addProductToCart(tshirt);
        premiumUser.addProductToCart(camera);


        // 4. הצגת תוכן העגלות
        System.out.println("\n--- עגלת משתמש רגיל ---");
        for (Product p : regularUser.getCartContents()) {
            System.out.println(p.getDescription());
        }

        System.out.println("\n--- עגלת משתמש פרימיום ---");
        for (Product p : premiumUser.getCartContents()) {
            double discounted = premiumUser.getDiscountedPrice(p);
            System.out.println(p.getName() + " | " + p.getDescription() + " | מחיר לאחר הנחה: " + discounted);
        }

        // 5. יצירת רשימת משתמשים והדפסת העגלות שלהם


        List<User> usersList = new ArrayList<>();
        usersList.add(regularUser);
        usersList.add(premiumUser);
        printAllUsersCarts(usersList);
    }
    // פונקציה שמדפיסה את כל המשתמשים ואת העגלות שלהם
    public static void printAllUsersCarts(List<User> users) {
        for (User user : users) {
            System.out.println("User: " + user.getUsername());
            List<Product> cart = user.getCartContents();
            if (cart.isEmpty()) {
                System.out.println("  Cart is empty.");
            } else {
                System.out.println("  Cart contents:");
                for (Product product : cart) {
                    double priceToShow = product.getPrice();
                    if (user instanceof PremiumUser) {
                        priceToShow = ((PremiumUser) user).getDiscountedPrice(product);
                    }
                    System.out.println("    - " + product.getName() + " | " + product.getDescription() + " | discountPrice: " + priceToShow);
                }
            }
            System.out.println();
        }
    }

    /**public static void print(List<User> usersList) {
     for (User user : usersList) {
     System.out.println("user:" + user.getUsername());
     List<Product> cart = user.getCartContents();
     if (cart.isEmpty()) {
     System.out.println("העגלה ריקה");
     } else
     System.out.println(" Cart Content:");

     for (Product p : cart) {
     System.out.println(p.getDescription());
     }
     System.out.println();
     }
     }**/


}



