/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.ServiceRequest;

import java.util.ArrayList;

/**
 *
 * @author anjana
 */
public class DiningRoomServiceRequestList {
    
    ArrayList<DiningMenuServiceRequest> diningRoomServiceRequestList;
    
    public DiningRoomServiceRequestList() {
        this.diningRoomServiceRequestList = new ArrayList<DiningMenuServiceRequest>();
    }
    
    public ArrayList<DiningMenuServiceRequest> getDiningRoomServiceRequestList() {
        return diningRoomServiceRequestList;
    }

    public void setFoodBevWorkRequestList(ArrayList<DiningMenuServiceRequest> diningRoomServiceRequestList) {
        this.diningRoomServiceRequestList = diningRoomServiceRequestList;
    }
    
    public void updateFoodBevWorkRequest(DiningMenuServiceRequest fbr, int index) {
        this.diningRoomServiceRequestList.set(index, fbr);
    }
    
}
