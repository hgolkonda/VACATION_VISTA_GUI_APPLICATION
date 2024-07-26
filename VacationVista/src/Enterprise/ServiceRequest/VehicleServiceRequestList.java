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
public class VehicleServiceRequestList {
    
    ArrayList<VehicleServiceRequest> vehicleServiceRequestList;

    public VehicleServiceRequestList() {
        this.vehicleServiceRequestList = new ArrayList<VehicleServiceRequest>();
    }

    public ArrayList<VehicleServiceRequest> getVehicleServiceRequestList() {
        return vehicleServiceRequestList;
    }

    public void setVehicleServiceRequestList(ArrayList<VehicleServiceRequest> vehicleServiceRequestList) {
        this.vehicleServiceRequestList = vehicleServiceRequestList;
    }
    
    
     public void updateVehicleServiceRequestList(VehicleServiceRequest vehicleSRequest, int index) {
        this.vehicleServiceRequestList.set(index, vehicleSRequest);
    }
    
}
