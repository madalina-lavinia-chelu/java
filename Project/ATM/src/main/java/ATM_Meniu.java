import lombok.NoArgsConstructor;

import java.util.HashMap;

@NoArgsConstructor
public class ATM_Meniu {
    static HashMap <String, Account> dataBaseAccountsExtras = BankDataBase.getdataBaseAccounts();
    Keypad keypad = new Keypad();

    public void running() {


    }
}
