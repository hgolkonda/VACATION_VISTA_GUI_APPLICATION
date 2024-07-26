/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.Customer;

import java.util.ArrayList;
import Enterprise.Customer.Customer;

/**
 *
 * @author Harshika
 */
public class CustomerList {
    private ArrayList<Customer> customerList;
    
    public CustomerList() {
        this.customerList = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomer() {
        return customerList;
    }

    public void setCustomer(ArrayList<Customer> customer) {
        this.customerList = customer;
    }

 
    
    public Customer addPersons(){
        Customer person = new Customer();
        customerList.add(person);
        return person;
    }
    
    public Customer getCustomerById(String customerId) {
        
        Customer selectedCustomer = new Customer();
        for(Customer customer : customerList) {
            if(customer.getCustomerId().equals(customerId)) {
                selectedCustomer = customer;
                break;
            }
        }
        return selectedCustomer;
    }
    
    public ArrayList<Customer> getUsersByRole(String customerRole) {
        
        ArrayList<Customer> selectedCustomer = new ArrayList<Customer>();
        for(Customer customer : customerList) {
            if(customer.getRoleType().equals(customerRole)) {
                selectedCustomer.add(customer);
            }
        }
        return selectedCustomer;
    }
    
    public void updateCustomer (Customer customer) {
        Customer newCustomer = new Customer();
        
        int position = 0;
        for (int iter = 0; iter < customerList.size(); iter++) {
            if((customerList.get(iter).getCustomerId()).equals(customer.getCustomerId())) {
                position = iter;
                break;
            }
        }
        
        newCustomer.setCustomerId(customer.getCustomerId());
        newCustomer.setFirstName(customer.getFirstName());
        newCustomer.setLastName(customer.getLastName());
        newCustomer.setCustomerName(customer.getCustomerName());
        newCustomer.setPassword(customer.getPassword());
        newCustomer.setRoleType(customer.getRoleType());
        newCustomer.setAddress(customer.getAddress());
        newCustomer.setPhoneNumber(customer.getPhoneNumber());
        newCustomer.setEmailId(customer.getEmailId());
        newCustomer.setAge(customer.getAge());
        
        customerList.set(position, newCustomer);
    }
}
