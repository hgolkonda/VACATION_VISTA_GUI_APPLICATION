/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.Payments;

import java.util.ArrayList;

/**
 *
 * @author anjana
 */
public class CustomerPaymentsList {
    
    ArrayList<CustomerPayments> customerPaymentsList;

    public CustomerPaymentsList() {
        this.customerPaymentsList = new ArrayList<CustomerPayments>();
    }
    
    public ArrayList<CustomerPayments> getCustomerPaymentsList() {
        return customerPaymentsList;
    }

    public void setCustomerPaymentsList(ArrayList<CustomerPayments> customerTransactionList) {
        this.customerPaymentsList = customerTransactionList;
    }
    
    public void addCustomerPayment(CustomerPayments ct) {
        this.customerPaymentsList.add(ct);
    }
    
}
