//package com.example.customer_application.service;
//
//import com.example.customer_application.Entity.Customer;
//import com.example.customer_application.Repository.CustomerRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Objects;
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class CustomerService {
//
//    private final CustomerRepository customerRepository;
//
//    public List<Customer> getAll() {
//        return customerRepository.findAll();
////        return ResponseEntity.ok().body("Customer List!!");
//    }
//
//    public Optional<Customer> getById(Long id) {
//        return customerRepository.findById(id);
////        return ResponseEntity.ok().body("Customer by ID is returned!");
//    }
//
//    public Customer addCustomer(Customer customer) {
//        return customerRepository.save(customer);
//    }
//
//
//
//    public ResponseEntity<String> deletedById(Long id) {
//         customerRepository.deleteById(id);
//        return ResponseEntity.ok().body("Customer deleted successfully!");
//
//    }
//
//    public Customer updateCustomer(Customer customer, Long id){
//        Customer c = customerRepository.findById(id).get();
//        if (Objects.nonNull(c.getFirstName())) {
//            c.setFirstName(
//                    customer.getFirstName());
//        }
//        if (Objects.nonNull(c.getLastName())) {
//            c.setLastName(
//                    customer.getLastName());
//        }
//        if (Objects.nonNull(c.getPhoneNumber())) {
//            c.setPhoneNumber(
//                    customer.getPhoneNumber());
//        }
//
//        return customerRepository.save(c);
//
//
//    }
//}
