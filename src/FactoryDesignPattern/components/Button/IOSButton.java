package FactoryDesignPattern.components.Button;

public class IOSButton implements Button{
  @Override
  public void changeSize() {
    System.out.println("IOS button is created");
  }
}
