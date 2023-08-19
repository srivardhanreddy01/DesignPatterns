package ObserverDesignPattern;

public class Client {

  public static void main(String[] args) {

    Flipkart flipkart=Flipkart.createFlipkart();

    EmailSender emailSender = new EmailSender();
    AnalyticsSender analyticsSender = new AnalyticsSender();
    InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

    flipkart.onOrder();
  }
}
