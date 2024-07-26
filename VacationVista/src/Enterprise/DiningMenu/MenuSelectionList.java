/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.DiningMenu;

import java.util.ArrayList;

/**
 *
 * @author anjana
 */
public class MenuSelectionList {
    private ArrayList<MenuSelection> menuItemsList;
    
    public MenuSelectionList() {
        this.menuItemsList = new ArrayList<>();
    }

    public ArrayList<MenuSelection> getmenuItemsList() {
        return menuItemsList;
    }

    public void setFbItemDirectoryList(ArrayList<MenuSelection> fbItemDirectoryList) {
        this.menuItemsList = fbItemDirectoryList;
    }
    
    public void addNewMenuData(MenuSelection fb) {
        this.menuItemsList.add(fb);
    }
    
    public void deleteMenuData(MenuSelection fb) {
        this.menuItemsList.remove(fb);
    }
    
    public void updateExistingMenuData(MenuSelection fb, int index) {
        this.menuItemsList.set(index, fb);
    }
    
    public MenuSelection getItemByName(String itemName) {

        MenuSelection selectedItem = new MenuSelection();
        for (MenuSelection item : menuItemsList) {
            if (item.getMenuName().equals(itemName)) {
                selectedItem = item;
                break;
            }
        }
        return selectedItem;
    }
}
