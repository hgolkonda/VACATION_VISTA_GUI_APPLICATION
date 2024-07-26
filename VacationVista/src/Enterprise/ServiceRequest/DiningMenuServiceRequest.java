/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.ServiceRequest;

import Enterprise.DiningMenu.MenuSelection;
import java.util.ArrayList;

/**
 *
 * @author anjana
 */
public class DiningMenuServiceRequest {
    
    String customerId;
    ArrayList<MenuSelection> menuSelectionList;
    String status;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ArrayList<MenuSelection> getMenuSelectionList() {
        return menuSelectionList;
    }

    public void setMenuSelectionList(ArrayList<MenuSelection> menuSelectionList) {
        this.menuSelectionList = menuSelectionList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   
    
    @Override
    public String toString() {
        return customerId;
    }
    
}
