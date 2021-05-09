package com.example.model;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@Entity(immutable = true)
@Table(name = "countries")
public class Country {
  @Id
  @Column(name = "country_iso_code")
  final public String isoCode;
  @Column(name = "country")
  final public String name;
  final public String region;

  public Country(String isoCode, String name, String region) {
    this.isoCode = isoCode;
    this.name = name;
    this.region = region;
  }
}
