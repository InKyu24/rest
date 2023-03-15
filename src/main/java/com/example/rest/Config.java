package com.example.rest;

import com.example.rest.repository.MainRepository;
import com.example.rest.repository.MainRepositoryImpl;
import com.example.rest.service.MainService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class Config {
  private final EntityManager em;

  public Config(EntityManager em) {
    this.em = em;
  }

  @Bean
  public MainService mainService() {
    return new MainService(mainRepository());
  }

  @Bean
  public MainRepository mainRepository() {
    return new MainRepositoryImpl(em);
  }
}
