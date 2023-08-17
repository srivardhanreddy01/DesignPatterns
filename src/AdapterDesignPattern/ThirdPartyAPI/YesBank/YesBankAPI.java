package AdapterDesignPattern.ThirdPartyAPI.YesBank;

public class YesBankAPI {

  public double showBalance(String account){
    return 112.56;
  }

  public String Send(String inAcc, String outAcc){
    return "Successful from YES bank";
  }

}
