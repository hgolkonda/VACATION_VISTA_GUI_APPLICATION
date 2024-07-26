/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.Commute.BookaRide;

/**
 *
 * @author Harshika
 */
public class Vehicle {
    String vehicleId;
    String vehicleNumber;
    String vehicleName;
    String vehiclecategory;
    Integer vehicleseater;
    Float vehicleprice;

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehiclecategory() {
        return vehiclecategory;
    }

    public void setVehiclecategory(String vehiclecategory) {
        this.vehiclecategory = vehiclecategory;
    }

    public Integer getVehicleseater() {
        return vehicleseater;
    }

    public void setVehicleseater(Integer vehicleseater) {
        this.vehicleseater = vehicleseater;
    }

    public Float getVehicleprice() {
        return vehicleprice;
    }

    public void setVehicleprice(Float vehicleprice) {
        this.vehicleprice = vehicleprice;
    }

    
     @Override
    public String toString(){
        return vehicleNumber;
    }
}
