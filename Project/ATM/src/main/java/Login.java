import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

@NoArgsConstructor
public class Login {

    private AtomicBoolean validare(HashMap <String, Account> dataBaseAccountsExtras, String name, String pin){

        AtomicBoolean valid = new AtomicBoolean(false);
        dataBaseAccountsExtras.forEach((k,v) ->{
            if(v.getName().equals(name) && v.getPin().equals(pin))
                valid.set(true);
        });
        return valid;
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
            if(validare(dataBaseAccountsExtras, userName, userPin).get()) {
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
