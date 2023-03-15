package com.example.rest.repository;

import com.example.rest.entity.Member;
import com.example.rest.entity.Product;

import javax.persistence.EntityManager;
import java.util.List;

public class MainRepositoryImpl implements MainRepository {
  private final EntityManager em;

  public MainRepositoryImpl(EntityManager em) {
    this.em = em;
  }

  @Override
  public List<Member> findAllMember() {
    List<Member> members = em.createQuery("select m from Member m", Member.class)
        .getResultList();
    return members;
  }

  @Override
  public List<Product> findAllProduct() {
    List<Product> products = em.createQuery("select p from Product p", Product.class)
        .getResultList();
    return products;
  }

  @Override
  public Product findProductDetail(Long id) {
    Product product = em.find(Product.class, id);
    return product;
  }
}
