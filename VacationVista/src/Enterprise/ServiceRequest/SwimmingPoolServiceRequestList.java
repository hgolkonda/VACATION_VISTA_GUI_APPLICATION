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
public class SwimmingPoolServiceRequestList {
    
    private ArrayList<SwimmingPoolServiceRequest> swimmingPoolServiceRequestList;

    public SwimmingPoolServiceRequestList() {
        this.swimmingPoolServiceRequestList = new ArrayList<>();
    }
    
    public ArrayList<SwimmingPoolServiceRequest> getSwimmingPoolServiceRequestList() {
        return swimmingPoolServiceRequestList;
    }

    public void setSwimmingPoolServiceRequestList(ArrayList<SwimmingPoolServiceRequest> swimmingPoolServiceRequestList) {
        this.swimmingPoolServiceRequestList = swimmingPoolServiceRequestList;
    }
    
     public void updateSwimmingPoolServiceRequestList(SwimmingPoolServiceRequest poolSRequest, int index) {
        this.swimmingPoolServiceRequestList.set(index, poolSRequest);
    }
    
}
