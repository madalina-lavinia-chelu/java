import java.util.HashMap;

public class BankDataBase {
    static HashMap<String, Account> dataBaseBank = new HashMap<>();

    public static HashMap<String, Account> getdataBaseAccounts(){
        Account account1 = new Account("Maria", "165343784", "3283", 54332.0F);
        Account account2 = new Account("Ioana", "324345435784", "7453", 4532.0F);
        Account account3 = new Account("Stelina", "1235343784", "7283", 134532.0F);
        Account account4 = new Account("Stefan", "135343784", "7793", 15442.0F);

        dataBaseBank.put(account1.getNumberAccount(), account1);
        dataBaseBank.put(account2.getNumberAccount(), account2);
        dataBaseBank.put(account3.getNumberAccount(), account3);
        dataBaseBank.put(account4.getNumberAccount(), account4);
        return dataBaseBank;
    }




}
