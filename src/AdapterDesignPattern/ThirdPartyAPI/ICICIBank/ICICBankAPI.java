package AdapterDesignPattern.ThirdPartyAPI.ICICIBank;

public class ICICBankAPI {

  public double showBalance(String account){
    return 111.56;
  }

  public String Send(String inAcc, String outAcc){
    return "Successful from ICICI bank";
  }
}
