package com.Learning.AccioJobLearning.Controller;


import com.Learning.AccioJobLearning.Entity.Seller;
import com.Learning.AccioJobLearning.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/seller") // to provide common end point
public class SellerController {


    @Autowired
    SellerService sellerService;
    // add seller
    @PostMapping
    public ResponseEntity<String> addSeller(@RequestBody Seller seller){
        String response = sellerService.addSeller(seller);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    // get seller by id
    @GetMapping
    public ResponseEntity getSellerById(@RequestParam("id") int id) {
        Seller seller = sellerService.getSellerById(id);
        return new ResponseEntity(seller , HttpStatus.OK);
    }

    // get

    // Delete Seller by id
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteSellerById(@PathVariable int id){
        String seller = sellerService.deleteById(id);
        return new ResponseEntity<>(seller,HttpStatus.OK);
    }
}
