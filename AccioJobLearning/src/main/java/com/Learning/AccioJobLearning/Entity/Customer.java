package com.Learning.AccioJobLearning.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer_details")
public class Customer {
    @Id
    private int customerId;
    @Column(name ="full_name")
    private String name;
    private int age;
    @Column(nullable = false)
    private Long mobNo;// with out wrapper class nullable fucntion is not working properly
    @Column(unique = true)
    private String email;
}
