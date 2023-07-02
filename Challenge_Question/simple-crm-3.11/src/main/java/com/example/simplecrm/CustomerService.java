package com.example.simplecrm;

import java.util.ArrayList;

public interface CustomerService {
    Customer createCustomer(Customer customer);

    Customer getCustomer(String id);

    ArrayList<Customer> getAllCustomers();

    Customer updateCustomer(String id, Customer customer);

    void deleteCustomer(String id);

}

// What happened here is that we are defining an Interface type, Cus
// When Spring Boot encounters a CustomerService type dependency in the
// CustomerController, it looks for a bean that implements the CustomerService
// Interface
// Since CustomerServiceImpl implements CustomerService, it will inject an
// instance of CustomerServiceImpl into CustomerService dependency of
// CustomerController
//EnhancedCustomerServiceImpl implements CustomerService
//