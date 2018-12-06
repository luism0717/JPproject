package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ViewFileInfo {

  public static void main(String[] args) {

    try {
      InputStream inputStream = new FileInputStream(
          "/Users/luism/TestResults.txt");
      Reader fr = new InputStreamReader(inputStream, "UTF-8");
      int i;
      while ((i = fr.read()) != -1) {
        System.out.print((char) i);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      System.out.println("Cant read");
    }

  }

}