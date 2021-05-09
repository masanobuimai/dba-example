package com.example.model;

public class City {
  private int id;
  private String name;
  private String country;
  private String airport;
  private String language;
  private String isoCode;

  public City(int city_id, String city_name, String country, String airport, String language, String country_iso_code) {
    this.id = city_id;
    this.name = city_name;
    this.country = country;
    this.airport = airport;
    this.language = language;
    this.isoCode = country_iso_code;
  }

  public int id() {
    return id;
  }

  public String name() {
    return name;
  }

  public String country() {
    return country;
  }

  public String airport() {
    return airport;
  }

  public String language() {
    return language;
  }

  public String isoCode() {
    return isoCode;
  }
}
