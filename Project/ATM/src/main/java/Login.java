import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

@NoArgsConstructor
public class Login {

    private AtomicBoolean validareV1(HashMap <String, Account> dataBaseAccountsExtras, String name, String pin){

        AtomicBoolean valid = new AtomicBoolean(false);
        dataBaseAccountsExtras.forEach((k,v) ->{
            if(v.getName().equals(name) && v.getPin().equals(pin))
                valid.set(true);
        });
        return valid;
    }
    private boolean validareV2(HashMap <String, Account> dataBaseAccountsExtras, String name, String pin){

        return dataBaseAccountsExtras.values().stream()
                .anyMatch(account -> account.getName().equals(name) && account.getPin().equals(pin));
    }

    public Account validareUser(HashMap<String, Account> dataBaseAccountsExtras){
        Keypad keypad = new Keypad();
        boolean userValid = false;

        System.out.println("Bine ai venit!");
        System.out.println("Enter the credentials");

        while (true){
            String userName = keypad.readString();
            String userPin = keypad.readString();
            String numberAccount = keypad.readString();
            if(validareV1(dataBaseAccountsExtras, userName, userPin).get()) {
                System.out.println("admis");
                return dataBaseAccountsExtras.get(numberAccount);
            }
            else
            {
                System.out.println("respins, incearca alta date");
            }
        }
    }
}
