package com.Learning.AccioJobLearning.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Seller {
    @Id
    private int sellerId;

    private int sellerName;

    @Column(nullable = false)
    private Integer mobNo;

    @Column(unique = true)
    private String mail;

    private String gstNo;

    private String address;

}
