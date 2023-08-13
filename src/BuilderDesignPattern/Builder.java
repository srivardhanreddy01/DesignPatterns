//package BuilderDesignPattern;
//
//public class Builder {
//
//  private String name;
//  private int age;
//  private String batch;
//  private double id;
//  private String universityName;
//  private double psp;
//  private int gradYear;
//  private double phoneNumber;
//
//
//  public String getName() {
//    return name;
//  }
//
//  public int getAge() {
//    return age;
//  }
//
//  public String getBatch() {
//    return batch;
//  }
//
//  public double getId() {
//    return id;
//  }
//
//  public String getUniversityName() {
//    return universityName;
//  }
//
//  public double getPsp() {
//    return psp;
//  }
//
//  public int getGradYear() {
//    return gradYear;
//  }
//
//  public double getPhoneNumber() {
//    return phoneNumber;
//  }
//
//  public Builder setName(String name) {
//    this.name = name;
//    return this;
//  }
//
//  public Builder setAge(int age) {
//    this.age = age;
//    return this;
//  }
//
//  public void setBatch(String batch) {
//    this.batch = batch;
//  }
//
//  public void setId(double id) {
//    this.id = id;
//  }
//
//  public void setUniversityName(String universityName) {
//    this.universityName = universityName;
//  }
//
//  public void setPsp(double psp) {
//    this.psp = psp;
//
//  }
//
//  public Builder setGradYear(int gradYear) {
//    this.gradYear = gradYear;
//    return this;
//  }
//
//  public void setPhoneNumber(double phoneNumber) {
//    this.phoneNumber = phoneNumber;
//  }
//
//  Student build(){
//    //validation
//    if(getGradYear()>2023){
//      throw new IllegalArgumentException("Grad year can't be greater than 2023");
//    }
//    //validation ends
//
//    return new Student(this);
//  }
//}
