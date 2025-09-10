package oop.ex;

import java.util.List;


/**
 * ממשק המייצג משתמש במערכת המסחר.
 * מגדיר פעולות בסיסיות: קבלת שם משתמש, הוספת מוצר לעגלה, וקבלת תוכן העגלה.
 */
public interface User {
    String getUsername();
    void addProductToCart(Product product);
    List<Product> getCartContents();
}
