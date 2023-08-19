package ObserverDesignPattern;

public class EmailSender implements OrderPlacedSubscribers {
  EmailSender(){
    Flipkart flipkart = Flipkart.createFlipkart();
    flipkart.registerSubscriber(this);
  }

  @Override
  public Action onOrderPlaced() {
    generateEmail();
    return null;
  }

  private void generateEmail() {
    System.out.println("Email is sent");
  }
}
