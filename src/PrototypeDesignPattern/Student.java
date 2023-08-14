package PrototypeDesignPattern;

public class Student {


  String name;
  int age;
  String batch;
  double averageBatchPSP;

  public Student() {
  }

  public Student(Student student){
    this.name=student.name;
    this.age=student.age;
    this.averageBatchPSP=student.averageBatchPSP;
    this.batch=student.batch;

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getBatch() {
    return batch;
  }

  public void setBatch(String batch) {
    this.batch = batch;
  }

  public double getAverageBatchPSP() {
    return averageBatchPSP;
  }

  public void setAverageBatchPSP(double averageBatchPSP) {
    this.averageBatchPSP = averageBatchPSP;
  }

  public Student clone(){
    System.out.println("Object is created");
    return new Student(this);
  }
}
