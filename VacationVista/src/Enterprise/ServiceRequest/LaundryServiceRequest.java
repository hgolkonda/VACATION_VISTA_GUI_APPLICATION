/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.ServiceRequest;

import Enterprise.Maintenance.Laundry.LaundryService;

/**
 *
 * @author anjana
 */
public class LaundryServiceRequest {
    
    String customerId;
    LaundryService laundryDetails;
    int numberOfClothes;
    String status;

    public int getNumberOfClothes() {
        return numberOfClothes;
    }

    public void setNumberOfClothes(int numberOfClothes) {
        this.numberOfClothes = numberOfClothes;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


    public LaundryService getLaundryDetails() {
        return laundryDetails;
    }

    public void setLaundryDetails(LaundryService laundryDetails) {
        this.laundryDetails = laundryDetails;
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
