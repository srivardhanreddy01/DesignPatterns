package SingeltonDesignPattern.EagerLoading;

public class DatabaseConnection {

  static DatabaseConnection databaseConnection = new DatabaseConnection();

  private DatabaseConnection(){
    System.out.println("Object is created");
  }

  public static DatabaseConnection getInstance(){
    System.out.println("I am inside now");
    System.out.println("Object is already created");
    return databaseConnection;
  }
}
