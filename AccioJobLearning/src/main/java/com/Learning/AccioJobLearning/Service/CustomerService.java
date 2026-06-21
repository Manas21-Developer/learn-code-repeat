package com.Learning.AccioJobLearning.Service;

import com.Learning.AccioJobLearning.Entity.Customer;
import com.Learning.AccioJobLearning.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo customerRepo;
    public  String addCustomer(Customer customer){
        customerRepo.save(customer); // this is return by hibernate
        return "Customer add successfully ";
    }

    public Customer getCustomerById(int id) {
        Optional<Customer> customerOptional = customerRepo.findById(id); // the benefit of the optional is there are any id is invaild so we can throw and error or give id if that is possible
        if(customerOptional.isEmpty()){
            throw new RuntimeException("Invalid Customer id");
        }
        return customerOptional.get();
    }

    public Customer updateCustomerById(int id) {
        Optional<Customer> customerOptional = customerRepo.findById(id);
        if(customerOptional.isEmpty()){
            throw new RuntimeException("Invalid id ");
        }
        return customerOptional.get();
    }

    public String deleteCustomerById(int id) {
        Optional<Customer> optionalCustomer = customerRepo.findById(id);
        if (optionalCustomer.isEmpty()){
            throw new RuntimeException("Customer not found of this id :- " +id);
        }
        customerRepo.deleteById(id);
        return "Customer delete Successfully ";
    }

    public List<Customer> gerAllCustomer() {
        return customerRepo.findAll();
    }
}
