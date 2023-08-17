package AdapterDesignPattern.ThirdPartyAPI;

public class Client {

  public static void main(String[] args) {
    PhonePe phonePe = new PhonePe();
    System.out.println(phonePe.getBalance("123456"));
  }



}
