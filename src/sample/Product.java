/*
 *
 * Luis Mendez
 * Product.java
 * 9/29/2018
 *
 */


package sample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

/*Create an abstract type called Product that will
implement the Item interface. Product will implement
the basic functionality that all items on a production
line should have. */
abstract class Product implements Item {

  //fields
  int serialNumber;
  String manufacturer;
  Date manufacuredOn;
  String name;
  /*Add an integer class variable called currentProductionNumber.
  This will store the next number to be assigned to serialNumber. */
  int currentProductionNumber;

  /*Add a constructor that will take in the name of the product and set
  this to the field variable name. You will also assign a serial number
  from the currentProductionNumber. The currentProductionNumber should
  be incremented in readiness for the next instance. Set manufacturedOn
  as the current date and time.*/
  Product(String manufacturer) {
    this.serialNumber = serialNumber;
    this.manufacturer = manufacturer;
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    dateFormat.format(this.manufacuredOn);
    this.manufacuredOn = Calendar.getInstance().getTime();
    this.name = name;
    currentProductionNumber = serialNumber + 1;
  }

  //A method setProductionNumber that would have one integer parameter
  @Override
  public void setProductionNumber(int pno) {
    currentProductionNumber = pno;
  }

  //A method setName that would have one String parameter
  @Override
  public void setName(String name) {
    this.name = name;
  }

  //A method getName that would return a String
  @Override
  public String getName() {
    return this.name;
  }

  //A method getManufactureDate that would return a Date
  @Override
  public Date getManufactureDate() {
    return this.manufacuredOn;
  }

  //A method getSerialNumber that would return an int
  @Override
  public int getSerialNumber() {
    return this.serialNumber;
  }

  //Add a toString method that will return the following:
  @Override
  public String toString() {
    return "\nManufacturer: " + manufacturer + "\n Serial Number :" + serialNumber + "\n Date:"
        + manufacuredOn + "\n Name: " + name;
  }
}