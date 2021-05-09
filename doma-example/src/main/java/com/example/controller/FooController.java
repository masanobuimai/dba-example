package com.example.controller;

import com.example.model.Country;
import com.example.repository.CountryRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {
  final CountryRepository repository;

  public FooController(CountryRepository repository) {
    this.repository = repository;
  }

  @RequestMapping(value = "country", method = RequestMethod.GET)
  public List<Country> getCountry() {
    return repository.selectAll();
  }
}
