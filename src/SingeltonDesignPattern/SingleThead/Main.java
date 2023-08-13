package SingeltonDesignPattern.SingleThead;

public class Main {

  public static void main(String[] args) {

    DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
    DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
    DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();
    DatabaseConnection databaseConnection3 = DatabaseConnection.getInstance();
  }

}
