import lombok.NoArgsConstructor;

import java.util.HashMap;

@NoArgsConstructor
public class ATM_Meniu {
    static HashMap <String, Account> dataBaseAccountsExtras = BankDataBase.getdataBaseAccounts();
    Keypad keypad = new Keypad();
    Login login = new Login();


    public void running() {

        System.out.println(login.validareUser(dataBaseAccountsExtras));


    }
}
