package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {

  List<OrderCancelledSubscribers> orderCancelledSubscribers = new ArrayList();

  List<OrderPlacedSubscribers> orderPlacedSubscribers = new ArrayList();
  private static Flipkart flipkart=null;
  private Flipkart(){

  }

  public static Flipkart createFlipkart(){
    if(flipkart==null){
      flipkart= new Flipkart();
    }
    return flipkart;
  }

  public void registerSubscriber(OrderPlacedSubscribers subscriber){
  orderPlacedSubscribers.add(subscriber);
  }

  public void cancelSubscriber(OrderCancelledSubscribers subscriber){
    orderCancelledSubscribers.remove(subscriber);
  }

  public void onOrder(){
    for (OrderPlacedSubscribers orderPlacedSubscriber : orderPlacedSubscribers) {
      orderPlacedSubscriber.onOrderPlaced();
    }

  }

}
