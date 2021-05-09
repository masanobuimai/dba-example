package com.example.controller;

import com.example.model.City;
import com.example.repository.CityRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BarController {
  @Autowired @Lazy
  CityRepository repository;

  @RequestMapping(value = "city", method = RequestMethod.GET)
  public List<City> getCountry() {
    return repository.selectAll();
  }
}
