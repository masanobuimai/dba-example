package com.example.repository;


import com.example.model.Country;

import java.util.List;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.springframework.stereotype.Repository;

@Repository
public class CountryRepository {

  private CountryDao dao;

  public CountryRepository(Jdbi jdbi) {
    this.dao = jdbi.onDemand(CountryDao.class);
  }

   public List<Country> selectAll() {
    return dao.selectAll();
  }

  @RegisterBeanMapper(Country.class)
  public interface CountryDao {
    @SqlQuery("select * from countries")
    List<Country> selectAll();
  }
}