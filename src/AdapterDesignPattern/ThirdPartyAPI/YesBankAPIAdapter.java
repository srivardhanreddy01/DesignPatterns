package AdapterDesignPattern.ThirdPartyAPI;

public class YesBankAPIAdapter  implements BankAPIAdapter {
  @Override
  public int getBalance(String acc) {
    return 0;
  }

  @Override
  public int sendMoney(String iAcc, String oAcc) {
    return 0;
  }
}
