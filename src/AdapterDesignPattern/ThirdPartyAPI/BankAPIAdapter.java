package AdapterDesignPattern.ThirdPartyAPI;

public interface BankAPIAdapter {

  int getBalance(String acc);

  int sendMoney(String iAcc, String oAcc);

}
