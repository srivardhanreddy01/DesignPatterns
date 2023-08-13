package SingeltonDesignPattern.DCL;

import javax.xml.crypto.Data;

public class DatabaseConnection {

  private static DatabaseConnection databaseConnection = null;
  private DatabaseConnection(){

  }

  public static DatabaseConnection getInstance(){
    if(databaseConnection == null ){
      synchronized (DatabaseConnection.class){
        System.out.println("I am inside");
        if(databaseConnection == null ){
          System.out.println("I am here first");
          databaseConnection = new DatabaseConnection();
          System.out.println("Object is created");
        }
      }
    }
    System.out.println("Object is  already created");
    return databaseConnection;
  }
}
