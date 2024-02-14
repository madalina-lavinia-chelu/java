import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Scanner;

@NoArgsConstructor
public class ATM_Meniu {
    static HashMap <String, Account> dataBaseAccountsExtras = BankDataBase.getdataBaseAccounts();
    Keypad keypad = new Keypad();
    Login login = new Login();


    public void running() {

        Account accountLogin = login.validareUser(dataBaseAccountsExtras);


        boolean flag = true;

        while (flag){
            Screen.Meniu();
            int numberOperation = keypad.readInt();
            switch (numberOperation){
                case 1:
                    Screen.ViewBalanceScreen();
                    System.out.println(accountLogin.getBalance());
                    break;

                case 2:
                    Float amount = keypad.readFloat();
                    Withdraw.CashWithdrawal(accountLogin, amount);
                    break;
                case 3:
                    break;
                case 4:
                    flag = false;
                    break;
                default:

                    throw new IllegalStateException("Unexpected value: " + numberOperation +  ". Login again");
            }
        }


    }
}
