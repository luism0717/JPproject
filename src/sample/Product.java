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

// Step 3
// Create an abstract type called Productthat will implement the Item interface.
public abstract class Product implements Item, Comparable<Product> {

  private int serialNumber;
  private String manufacturer;
  private Date manufacuredOn;
  private String name;
  private static int currentProductionNumber = 1;

  public Product(String n) {
    name = n;
    // Add an integer class variable called currentProductionNumber.
    // This will store the next number to be assigned to serialNumber.
    // Bug acknowledged for write to static field. It is tricky to correct.
    serialNumber = currentProductionNumber++;
    manufacuredOn = new Date();
    manufacturer = Item.manufacturer;
  }

  public void setProductionNumber(int p) {
    // Bug acknowledged for write to static field. It is tricky to correct.
    currentProductionNumber = p;
  }

  public void setName(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public Date getManufactureDate() {
    // Bug acknowledge may expose internal representation by returning manufacuredOn
    return manufacuredOn;
  }
  // Method to return sewrial number of object
  public int getSerialNumber(int s) {
    return serialNumber;
  }

  //Add a toString method that will return object fields
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