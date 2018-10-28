/*
 *
 *
 * Luis Mendez
 * Product.java
 * 9/29/2018
 *
 *
 */


package sample;

import java.util.Date;


public abstract class Product implements Item, Comparable<Product> {

  private int serialNumber;
  private String manufacturer;
  private Date manufacuredOn;
  private String name;
  private static int currentProductionNumber = 1;

  public Product(String n) {
    name = n;
    serialNumber = currentProductionNumber++;
    manufacuredOn = new Date();
    manufacturer = Item.manufacturer;
  }

  public void setProductionNumber(int p) {

    currentProductionNumber = p;
  }

  public void setName(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public Date getManufactureDate() {
    return manufacuredOn;
  }

  public int getSerialNumber(int s) {
    return serialNumber;
  }


  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date : " + manufacuredOn + "\n"
        + "Name : " + name;
  }


  public int compareTo(Product p) {
    return this.getName().compareTo(p.getName());
  }

}