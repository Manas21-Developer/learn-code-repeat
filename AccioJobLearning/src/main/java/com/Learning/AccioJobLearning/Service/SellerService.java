package com.Learning.AccioJobLearning.Service;

import com.Learning.AccioJobLearning.Entity.Seller;
import com.Learning.AccioJobLearning.Repository.SellerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class SellerService {

    @Autowired
    SellerRepo  sellerRepo;
    public String addSeller(Seller seller) {
        sellerRepo.save(seller);
        return "seller add successfully";
    }

    public Seller getSellerById(int id) {
        Optional<Seller> sellerOptional = sellerRepo.findById(id); // optional help to remove run time error
        if(sellerOptional.isEmpty()) {
            throw new RuntimeException("Invalid id seller not found");
        }
        return sellerOptional.get();
    }

    public String deleteById(int id) {
        Optional<Seller> sellerOptional = sellerRepo.findById(id);
        if(sellerOptional.isEmpty()){
            throw new RuntimeException("Seller not found id is invalid :- " + id);
        }
        sellerRepo.deleteById(id);
        return "Seller delete successfully";
    }
}
