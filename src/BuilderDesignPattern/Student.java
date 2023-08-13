package BuilderDesignPattern;

public class Student {

  String name;
  int age;
  String batch;
  double id;
  String universityName;
  double psp;
  int gradYear;
  double phoneNumber;

  Student(Builder builder)
  {
    //validation
    if(builder.getGradYear()>2023){
      throw new IllegalArgumentException("Grad year can't be greater than 2023");
    }
    //validation ends

    this.gradYear=builder.getGradYear();
    this.name=builder.getName();
    this.age=builder.getAge();
  }



}
