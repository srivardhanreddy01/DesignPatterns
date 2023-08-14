package PrototypeDesignPattern;

public class IntelligentStudent extends Student{

  int iq;

  public IntelligentStudent(IntelligentStudent intelligentStudent) {
    super(intelligentStudent);
    this.iq=intelligentStudent.iq;

  }

  public IntelligentStudent() {

  }

  public IntelligentStudent clone(){
    IntelligentStudent intelligentStudent = new IntelligentStudent(this);
    return intelligentStudent;
  }

}
