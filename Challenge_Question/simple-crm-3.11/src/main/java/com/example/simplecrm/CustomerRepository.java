package com.example.simplecrm;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository //like component but created a bean to classify as repository
//Only repository can access the data store.
//This means arraylist will move over to Repository
public class CustomerRepository {
    private ArrayList<Customer> customers = new ArrayList<>();  //create an arrary to store customer to arraylist

// Create
public Customer createCustomer(Customer customer) {
    customers.add(customer);
    return customer;
  }

  // Get One
  public Customer getCustomer(int index) {
    return customers.get(index);
  }

  // Get All
  public ArrayList<Customer> getAllCustomers() {
    return customers;
  }

  // Update
  public Customer updateCustomer(int index, Customer customer) {
    Customer customerToUpdate = customers.get(index);
    customerToUpdate.setFirstName(customer.getFirstName());
    customerToUpdate.setLastName(customer.getLastName());
    customerToUpdate.setEmail(customer.getEmail());
    customerToUpdate.setContactNo(customer.getContactNo());
    customerToUpdate.setJobTitle(customer.getJobTitle());
    customerToUpdate.setYearOfBirth(customer.getYearOfBirth());
    return customerToUpdate;
  }

  // Delete
  public void deleteCustomer(int index) {
    customers.remove(index);
  }

}
