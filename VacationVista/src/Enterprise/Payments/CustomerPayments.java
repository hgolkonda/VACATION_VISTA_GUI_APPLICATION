/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.Payments;

/**
 *
 * @author anjana
 */
public class CustomerPayments {
    
    String customerId;
    String facilityUsed;
    Float checkoutprice;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFacilityUsed() {
        return facilityUsed;
    }

    public void setFacilityUsed(String facilityUsed) {
        this.facilityUsed = facilityUsed;
    }

    public Float getCheckoutprice() {
        return checkoutprice;
    }

    public void setCheckoutprice(Float checkoutprice) {
        this.checkoutprice = checkoutprice;
    }

    
}
