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
public class LaundryServiceRequestList {
    
    ArrayList<LaundryServiceRequest> laundryServiceRequestList;

    public LaundryServiceRequestList() {
        this.laundryServiceRequestList = new ArrayList<LaundryServiceRequest>();
    }
    
    public ArrayList<LaundryServiceRequest> getLaundryServiceRequestList() {
        return laundryServiceRequestList;
    }

    public void setLaundryServiceRequestList(ArrayList<LaundryServiceRequest> laundryServiceRequestList) {
        this.laundryServiceRequestList = laundryServiceRequestList;
    }
    
    public void updateLaundryServiceRequestList(LaundryServiceRequest laundrySRequest, int index) {
        this.laundryServiceRequestList.set(index, laundrySRequest);
    }
    
}
