package com.example.rest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Product {
  @Id
  @Column(name = "product_id")
  private Long id;

  private String prodname;

  private int price;
}
