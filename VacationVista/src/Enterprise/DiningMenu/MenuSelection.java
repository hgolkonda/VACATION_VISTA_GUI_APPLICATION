/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.DiningMenu;

/**
 *
 * @author anjana
 */
public class MenuSelection {
    String menuItemId;
    String menucategory;
    String menuName;
    Double menuprice;

    public String getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(String menuItemId) {
        this.menuItemId = menuItemId;
    }

    public String getMenucategory() {
        return menucategory;
    }

    public void setMenucategory(String menucategory) {
        this.menucategory = menucategory;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Double getMenuprice() {
        return menuprice;
    }

    public void setMenuprice(Double menuprice) {
        this.menuprice = menuprice;
    }


    
    @Override
    public String toString() {
        return menuItemId;
    }
}
