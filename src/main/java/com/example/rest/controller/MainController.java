package com.example.rest.controller;

import com.example.rest.entity.Member;
import com.example.rest.entity.Product;
import com.example.rest.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

  MainService mainService;

  @Autowired
  public MainController(MainService mainService) {
    this.mainService = mainService;
  }

  @GetMapping("/")
  public String index() {
    return "{\"name\": \"최인규\"," + "\"userId\": \"484342\"}";
  }

  @GetMapping("/member")
  public List<Member> member() {
    List<Member> memberList = mainService.getMemberList();
    return memberList;
  }

  @GetMapping("/product")
  public List<Product> product() {
    List<Product> productList = mainService.getProductList();
    return productList;
  }

  @GetMapping("/product/{id}")
  public Product productDetail(@PathVariable Long id) {
    Product productDetail = mainService.getProductDetail(id);
    return productDetail;
  }
}
