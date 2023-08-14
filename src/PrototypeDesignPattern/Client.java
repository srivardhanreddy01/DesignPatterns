package PrototypeDesignPattern;

public class Client {

  private static void studentRegister(Registry registry) {
    Student student = new Student();
    student.setBatch("2023 summer batch");
    student.setAverageBatchPSP(87);
    registry.register("2023 summer batch", student);

    IntelligentStudent intelligentStudent = new IntelligentStudent();
    intelligentStudent.iq=95;
    intelligentStudent.setBatch("2023 summer Intelligent batch");
    intelligentStudent.setAverageBatchPSP(87);
    registry.register("2023 summer Intelligent batch", intelligentStudent);
  }

  public static void main(String[] args) {
    Registry registry = new Registry();
    studentRegister(registry);
    Student s = registry.get("2023 summer batch").clone();
    s.setName("Sri");
    s.setAge(23);
    Student i = registry.get("2023 summer Intelligent batch").clone();
    i.setAge(25);
    i.setName("Pulakanti");
    }



}
