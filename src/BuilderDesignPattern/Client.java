package BuilderDesignPattern;

public class Client {

  public static void main(String args[]){
    Builder builder = new Builder();
    builder.setName("Sri");
    builder.setGradYear(2022);
    builder.setAge(25);
    Student student = new Student(builder);
  }
}
