package BuilderDesignPattern;

public class Client {

  public static void main(String args[]){
    Student student = Student.getBuilder().setName("Sri").setGradYear(2022).setAge(25).build();
  }
}
