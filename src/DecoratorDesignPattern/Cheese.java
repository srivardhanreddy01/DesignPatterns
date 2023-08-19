package DecoratorDesignPattern;

public class Cheese implements Pizza{

  private Pizza pizza;
  int quantity=1;

  Cheese(Pizza pizza){
    this.pizza=pizza;
  }

  Cheese(Pizza pizza, int quantity){
    this.pizza=pizza;
    this.quantity=quantity;
  }


  @Override
  public int getCost() {
    return pizza.getCost()+80*quantity;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription()+"Cheese";
  }
}
