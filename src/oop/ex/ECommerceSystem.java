package oop.ex;

public class ECommerceSystem {
    public static void main(String[] args) {
        // 1. יצירת מוצרים
        Product computer = new Electronics("E001", "Laptop", 1200.00, 24); // מחשב נייד עם 24 חודשים אחריות
        Product tshirt = new Clothing("C001", "T-Shirt", 29.99, "M");     // חולצת T עם גודל M

        // 2. יצירת משתמשים
        User regularUser = new RegularUser("Ari");
        User premiumUser = new PremiumUser("David", "Gold");

        // 3. הוספת מוצרים לעגלות
        regularUser.addProductToCart(computer);
        regularUser.addProductToCart(tshirt);

        premiumUser.addProductToCart(computer);
        premiumUser.addProductToCart(tshirt);

        // 4. הצגת תוכן העגלות
        System.out.println("\n--- עגלת משתמש רגיל ---");
        for (Product p : regularUser.getCartContents()) {
            System.out.println(p.getDescription());
        }

        System.out.println("\n--- עגלת משתמש פרימיום ---");
        for (Product p : premiumUser.getCartContents()) {
            System.out.println(p.getDescription());
        }
    }
}

