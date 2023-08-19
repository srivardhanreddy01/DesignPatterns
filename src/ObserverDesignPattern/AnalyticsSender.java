package ObserverDesignPattern;

public class AnalyticsSender implements OrderPlacedSubscribers {

  AnalyticsSender(){
    Flipkart flipkart = Flipkart.createFlipkart();
    flipkart.registerSubscriber(this);
  }

  @Override
  public Action onOrderPlaced() {
    generateAnalytics();
    return null;
  }

  private void generateAnalytics() {
    System.out.println("Analytics are generated");
  }

}
