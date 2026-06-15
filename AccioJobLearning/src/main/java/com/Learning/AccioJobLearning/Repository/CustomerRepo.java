package com.Learning.AccioJobLearning.Repository;

import com.Learning.AccioJobLearning.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
