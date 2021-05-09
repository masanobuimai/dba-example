package com.example.model;


public class Country {
  private String country_iso_code;
  private String country;
  private String region;

  public String getCountry_iso_code() {
    return country_iso_code;
  }

  public void setCountry_iso_code(String country_iso_code) {
    this.country_iso_code = country_iso_code;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }
}
