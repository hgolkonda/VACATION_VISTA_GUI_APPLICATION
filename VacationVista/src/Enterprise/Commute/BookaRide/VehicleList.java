/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.Commute.BookaRide;

import Enterprise.Commute.BookaRide.Vehicle;
import java.util.ArrayList;

/**
 *
 * @author Harshika
 */
public class VehicleList {
   private ArrayList<Vehicle> vehicleList;
   public VehicleList() {
       this.vehicleList = new ArrayList<>();
       System.out.println("hello");
   }
   
   
   
    public ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(ArrayList<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public Vehicle getVehicles(int index){
        Vehicle newVehicle = new Vehicle();
        newVehicle = vehicleList.get(index);
        return newVehicle;
    }
    
    public Vehicle addVehicleDetails(){
        Vehicle newVehicle = new Vehicle();
        vehicleList.add(newVehicle);
        
        return newVehicle;
    }
    
   
    public Vehicle getVehicleByName(String vehicleName) {
        
        Vehicle selectedVehicle = new Vehicle();
        for(Vehicle vehicle : vehicleList) {
            if(vehicle.getVehicleName().equals(vehicleName)) {
                selectedVehicle = vehicle;
                break;
            }
        }
        return selectedVehicle;
    }
    
    public void deleteVehicle(Vehicle vehicle){
        vehicleList.remove(vehicle);
    }
   
}
