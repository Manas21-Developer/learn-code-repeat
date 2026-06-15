package com.Learning.AccioJobLearning.Service;

import com.Learning.AccioJobLearning.Entity.Customer;
import com.Learning.AccioJobLearning.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo customerRepo;
    public  String addCustomer(Customer customer){
        customerRepo.save(customer); // this is return by hibernate
        return "Customer add successfully ";
    }
}
