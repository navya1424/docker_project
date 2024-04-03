package com.example.customer_application.controller;

//import com.example.customer_application.Entity.Customer;
//import com.example.customer_application.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers-dev")
public class Customer_Controller {
    @GetMapping("/status")
    public String checkApiStatus() {
        return "The Spring Boot API is working!";
    }
//    private final CustomerService customerService;

//    public Customer_Controller(CustomerService customerService) {
//        this.customerService = customerService;
//    }
//    @GetMapping("/all")
//    public ResponseEntity<List<Customer>> getAllCustomers() {
//        List<Customer> customers = customerService.getAll();
//        return ResponseEntity.ok(customers);
//    }
//
//    @GetMapping("/get/{id}")
//    public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable Long id){
//        return ResponseEntity.ok(customerService.getById(id));
//    }
//
//    @PostMapping("/add")
//    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
//        return ResponseEntity.ok(customerService.addCustomer(customer));
//    }
//
//    @PutMapping("/put/{id}")
//    public ResponseEntity <Customer> updateCustomer(@RequestBody Customer customer, @PathVariable Long id) {
//        return ResponseEntity.ok(customerService.updateCustomer(customer,id));
//    }
}
