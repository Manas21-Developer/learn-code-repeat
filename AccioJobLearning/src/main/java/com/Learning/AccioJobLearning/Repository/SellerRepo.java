package com.Learning.AccioJobLearning.Repository;

import com.Learning.AccioJobLearning.Entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepo  extends JpaRepository<Seller,Integer> {
}
