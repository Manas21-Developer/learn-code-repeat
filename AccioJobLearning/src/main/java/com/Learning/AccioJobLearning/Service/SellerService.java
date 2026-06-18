package com.Learning.AccioJobLearning.Service;

import com.Learning.AccioJobLearning.Entity.Seller;
import com.Learning.AccioJobLearning.Repository.SellerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class SellerService {

    @Autowired
    SellerRepo  sellerRepo;
    public String addSeller(Seller seller) {
        sellerRepo.save(seller);
        return "seller add successfully";
    }
}
