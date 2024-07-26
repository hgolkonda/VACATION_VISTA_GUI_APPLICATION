/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.ServiceRequest;

import Enterprise.RecreationEvents.SwimmingPool.SwimmingPool;
import java.util.Date;

/**
 *
 * @author anjana
 */
public class SwimmingPoolServiceRequest {
    
    String customerId;
    SwimmingPool poolDetails;
    int numberOfHours;
    Date bookingDate;
    String status;
   

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String userId) {
        this.customerId = userId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public SwimmingPool getSwimmingPoolDetails() {
        return poolDetails;
    }

    public void setPoolDetails(SwimmingPool poolDetails) {
        this.poolDetails = poolDetails;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
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
