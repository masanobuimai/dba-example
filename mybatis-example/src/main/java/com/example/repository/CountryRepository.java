package com.example.repository;

import com.example.model.Country;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CountryRepository {
  @Select("""
    select * from countries
    """)List<Country> selectAll();
}
