package DecoratorDesignPattern;

public class Paneer implements Pizza{

  private Pizza pizza;
  int quantity=1;

  Paneer(Pizza pizza){
    this.pizza=pizza;
  }

  Paneer(Pizza pizza, int quantity){
    this.pizza=pizza;
    this.quantity=quantity;
  }


  @Override
  public int getCost() {
    return pizza.getCost()+60*quantity;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription()+"Paneer";
  }
}
