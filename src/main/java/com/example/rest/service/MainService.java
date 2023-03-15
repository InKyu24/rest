package com.example.rest.service;

import com.example.rest.entity.Member;
import com.example.rest.entity.Product;
import com.example.rest.repository.MainRepository;

import java.util.List;

public class MainService {
  private final MainRepository mainRepository;

  public MainService(MainRepository mainRepository) {
    this.mainRepository = mainRepository;
  }

  public List<Member> getMemberList() {
    List<Member> all = mainRepository.findAllMember();
    return all;
  }

  public List<Product> getProductList() {
    List<Product> all = mainRepository.findAllProduct();
    return all;
  }

  public Product getProductDetail(Long id) {
    Product product= mainRepository.findProductDetail(id);
    return product;
  }
}
