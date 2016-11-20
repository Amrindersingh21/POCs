package readBlobDataDB;

//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.InputStream;
 import java.sql.Connection;
 import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
//	pushing changes to git hib
  static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
  static String username = "poc";
  static String password = "welcome1";
  public static void main(String[] args) throws Exception {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn = DriverManager.getConnection(url, username, password);
   
    String sql = "SELECT id, text FROM sys.blob_test ";
    PreparedStatement stmt = conn.prepareStatement(sql);
    ResultSet resultSet = stmt.executeQuery();
    while (resultSet.next()) {
      String id = resultSet.getString(1);
      String text = resultSet.getString(2);
      System.out.println(id);
      System.out.println(text);
      System.out.println("git hub read 2 testing");
      
//      byte[] buffer = new byte[1];
//      InputStream is = resultSet.getBinaryStream(3);
//      while (is.read(buffer) > 0) {
//        fos.write(buffer);
      }
    conn.close();
//      fos.close();
    }
//    conn.close();
  }
