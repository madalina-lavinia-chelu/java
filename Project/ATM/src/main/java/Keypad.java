import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class Keypad {
    Scanner sc = new Scanner(System.in);
    public int readInt(){
        return sc.nextInt();
    }

    public String readString(){
        return sc.nextLine();
    }

    public Float readFloat(){
        return sc.nextFloat();
    }
}
