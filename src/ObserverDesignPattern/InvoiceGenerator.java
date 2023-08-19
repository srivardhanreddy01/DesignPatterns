package ObserverDesignPattern;

public class InvoiceGenerator implements OrderPlacedSubscribers {

  InvoiceGenerator(){
    Flipkart flipkart = Flipkart.createFlipkart();
    flipkart.registerSubscriber(this);
  }

  @Override
  public Action onOrderPlaced() {
    generateInvoice();
    return null;
  }

  private void generateInvoice() {
    System.out.println("Invoice is generated");
  }
}
