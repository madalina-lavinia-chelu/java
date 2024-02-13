import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Transaction {
    private double balance = 0;
    private double withdrawal = 0;
    private double deposit = 0;
}
