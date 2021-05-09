package com.example.repository;

import com.example.model.City;
import com.example.model.Country;

import java.util.List;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.springframework.stereotype.Repository;

@Repository
public class CityRepository {

  private Jdbi jdbi;

  public CityRepository(Jdbi jdbi) {
    this.jdbi = jdbi;
    jdbi.registerRowMapper(City.class,
      (rs, ctx) -> new City(rs.getInt("city_id"),
        rs.getString("city_name"),
        rs.getString("country"),
        rs.getString("airport"),
        rs.getString("language"),
        rs.getString("country_iso_code")
        ));
  }

  public List<City> selectAll() {
    return jdbi.withHandle(h -> h.createQuery("""
      select * from cities
      """)
      .mapTo(City.class).list());
  }

}