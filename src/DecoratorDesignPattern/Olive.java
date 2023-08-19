package DecoratorDesignPattern;

public class Olive implements Pizza{

  private Pizza pizza;
  int quantity=1;

  Olive(Pizza pizza){
    this.pizza=pizza;
  }

  Olive(Pizza pizza, int quantity){
    this.pizza=pizza;
    this.quantity=quantity;
  }

  @Override
  public int getCost() {
    return pizza.getCost()+20*quantity;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription()+"Olive";
  }
}
