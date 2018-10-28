/*
 *
 *
 * Luis Mendez
 * ItemType.java
 * 9/29/2018
 *
 *
 */


package sample;

public enum ItemType {

  //store the following information
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  public final String code;

  ItemType(String code) {
    this.code = code;
  }

  private String getCode() {
    return code;
  }
}