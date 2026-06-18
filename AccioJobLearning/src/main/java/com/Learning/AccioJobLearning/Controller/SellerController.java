package com.Learning.AccioJobLearning.Controller;


import com.Learning.AccioJobLearning.Entity.Seller;
import com.Learning.AccioJobLearning.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/seller")
public class SellerController {


    @Autowired
    SellerService sellerService;
    // add seller
    @PostMapping
    public ResponseEntity<String> addSeller(@RequestBody Seller seller){
        String response = sellerService.addSeller(seller);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }
}
