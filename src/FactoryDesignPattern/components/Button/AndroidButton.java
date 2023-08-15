package FactoryDesignPattern.components.Button;

public class AndroidButton implements Button{

  @Override
  public void changeSize() {
    System.out.println("Android button is created");
  }
}
