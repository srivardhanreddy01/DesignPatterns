package DecoratorDesignPattern;

public class Tomato implements Pizza{

  private Pizza pizza;
  int quantity=1;

  Tomato(Pizza pizza){
    this.pizza=pizza;
  }

  Tomato(Pizza pizza, int quantity){
    this.pizza=pizza;
    this.quantity=quantity;
  }
  @Override
  public int getCost() {
    return pizza.getCost()+30*quantity;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription()+"Tomato";
  }
}
