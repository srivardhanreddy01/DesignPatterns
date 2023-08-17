package AdapterDesignPattern.ThirdPartyAPI;

import AdapterDesignPattern.ThirdPartyAPI.ICICIBank.ICICBankAPI;

public class ICICIBankAPIAdapter implements BankAPIAdapter{

  ICICBankAPI icicBankAPI = new ICICBankAPI();
  @Override
  public int getBalance(String acc) {
    return (int) icicBankAPI.showBalance(acc);
  }

  @Override
  public int sendMoney(String iAcc, String oAcc) {
    return 0;
  }
}
