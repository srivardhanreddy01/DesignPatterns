package SingeltonDesignPattern.SingleThead;

public class DatabaseConnection {

  static DatabaseConnection databaseConnection= null;
  private DatabaseConnection(){
  }

  public static DatabaseConnection getInstance(){
//    DatabaseConnection databaseConnection = new DatabaseConnection();
    if(databaseConnection==null) {
      databaseConnection = new DatabaseConnection();
      System.out.println("Object is created");
    }
    System.out.println("Object is already created");
    return databaseConnection;
  }
}
