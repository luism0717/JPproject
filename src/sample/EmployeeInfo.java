package sample;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

//The program is required to create an audit trail on its tests of the production line so thatit
// records which employee ran the test.  To accomplish this you will need to create a class named
// EmployeeInfo that will allow the user to input their full name and then create a user id of their
// first initial and surname.

public class EmployeeInfo {

  private StringBuilder name;
  private String code;
  private String deptId;
  private Pattern p;
  private Scanner in;

  public EmployeeInfo() {
    in = new Scanner(System.in);
    setName();
    setDeptId();
    in.close();
  }

  public StringBuilder getName() {
    return this.name;
  }

  public String getCode() {
    return this.code;
  }

  private void setName() {
    this.name = new StringBuilder(inputName());
  }

  private void createEmployeeCode(StringBuilder name) {
    int index = name.indexOf(" ");
    String lastName = name.substring((index + 1), name.length());
    this.code = name.charAt(0) + lastName;
  }

  private String inputName() {
    System.out.print("Please enter your first and last name: ");
    StringBuilder input = new StringBuilder(in.nextLine());
    if (checkName(input)) {
      createEmployeeCode(input);
    } else {
      this.code = "guest";
    }
    return input.toString();
  }

  private boolean checkName(StringBuilder name) {
    return name.toString().contains(" ");
  }

  public String getDeptId() {
    System.out.print("Please enter the department ID: ");
    String input = in.nextLine();
    if (validId(input)) {
      return input;
    } else {
      return "None01";
    }
  }

  private void setDeptId() {
    this.deptId = getDeptId();
  }

  private String getId() {

    return this.deptId;

  }

  private boolean validId(String id) {
    p = Pattern.compile("[A-Z][a-z][a-z][a-z]\\d\\d");
    Matcher m = p.matcher(id);
    return m.matches();
  }

  @Override
  public String toString() {
    return "Employee Code : " + code + "\nDepartment Number : " + deptId;
  }
}