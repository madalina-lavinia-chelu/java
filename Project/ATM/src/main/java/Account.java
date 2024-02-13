import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Account {
    private String name;
    private String numberAccount;
    private String pin;
    private Float balance;




}
