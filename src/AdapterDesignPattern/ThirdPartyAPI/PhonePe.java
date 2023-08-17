package AdapterDesignPattern.ThirdPartyAPI;

public class PhonePe {

  BankAPIAdapter bankAPIAdapter = new ICICIBankAPIAdapter();
  public int getBalance(String AccountNumber){
    return bankAPIAdapter.getBalance(AccountNumber);

  }

  public void sendMoney(String fromAcc, String toAcc){

  }
}
