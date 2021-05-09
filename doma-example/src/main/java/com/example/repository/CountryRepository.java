package com.example.repository;

import com.example.model.Country;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@Dao
@ConfigAutowireable
public interface CountryRepository {
  @Select List<Country> selectAll();
}
