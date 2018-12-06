package sample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Locale;

public class ProcessFiles {

  /**
   * Paths for file
   */
  private Path p;
  private Path p2;
  private Path p3;

  public ProcessFiles(EmployeeInfo e, ArrayList<Product> pr) {
    p = Paths.get("/Users/luism");
    p2 = Paths.get("TestResults.txt");
    p3 = p.resolve(p2);
    CreateDirectory();
    try {
      WriteFile(e);
      WriteFile(pr);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

  }

  private void CreateDirectory() {
    if (Files.notExists(p)) {
      try {
        Files.createDirectories(p);
        System.out.println("Directory Created");
      } catch (IOException e) {
        System.out.println("Can't Create Directory");
      }
    }
  }

  /**
   * @param emp Employee Info
   * @throws IOException if file cant be written to
   */
  public void WriteFile(EmployeeInfo emp) throws IOException {

//    p2 = Paths.get(p.toUri() + "TestResults.txt");
//    Files.write(p2,emp.toString().getBytes());

    FileWriter writer = new FileWriter(p3.toString(), true);
    PrintWriter printWriter = new PrintWriter(writer);

    printWriter.println(emp.toString());

    printWriter.close();
  }

  /**
   * @param products array list of products
   * @throws IOException if file cant be written to
   */
  public void WriteFile(ArrayList<Product> products) throws IOException {
    //p2 = Paths.get(p.toUri() + "TestResults.txt");
    //Files.write(p2, products.toString().getBytes());

    //FileWriter  writer = new FileWriter(p3.toString(),true);
    File file = new File(p3.toString());
    Writer writer = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
    PrintWriter printWriter = new PrintWriter(writer);

    printWriter.println(products.toString());

    printWriter.close();
  }

}