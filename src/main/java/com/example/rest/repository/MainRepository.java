package com.example.rest.repository;

import com.example.rest.entity.Member;
import com.example.rest.entity.Product;

import java.util.List;

public interface MainRepository {

  List<Member> findAllMember();

  List<Product> findAllProduct();

  Product findProductDetail(Long id);
}
