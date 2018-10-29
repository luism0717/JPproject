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

// All items will have a pre-set type.
// Currently there are 4 types.
// Create an enum called ItemType.
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