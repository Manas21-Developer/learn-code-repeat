package com.Learning.AccioJobLearning.Controller;

import com.Learning.AccioJobLearning.Entity.Customer;
import com.Learning.AccioJobLearning.Entity.Seller;
import com.Learning.AccioJobLearning.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/customer") // it help to make this as a end point of each api we use here
public class CustomerController {


    @Autowired
    CustomerService customerService;
    // create customer post
    @PostMapping
    public ResponseEntity addCustomer(@RequestBody Customer customer)// request body is use take object as parametter
    {
        String response = customerService.addCustomer(customer);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }


    // get customer by id
    @GetMapping
    public ResponseEntity getCustomerById(@RequestParam("id") int id){
        Customer customer = customerService.getCustomerById(id);
        return new ResponseEntity(customer ,HttpStatus.OK);
    }

    // find all customer
    @GetMapping("All")
    public ResponseEntity getAllCustomer(){
        List<Customer> customer = customerService.gerAllCustomer();
        return new ResponseEntity(customer,HttpStatus.OK);
    }

    // Update Customer by age
    @PutMapping("updateAge/{id}/{newAge}")
    public ResponseEntity updateCustomerByAge(@PathVariable int id,
                                              @PathVariable int newAge){
        Customer customer= customerService.updateAge(id,newAge);
        return new ResponseEntity(customer , HttpStatus.OK);
    }

    // delete the customer delete
    @DeleteMapping("Delete/{id}")
    public ResponseEntity<String> deleteCustomerById(@PathVariable int id){
        String customer = customerService.deleteCustomerById(id);
        return new ResponseEntity(customer,HttpStatus.OK);
    }

}
