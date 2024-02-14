public class Withdraw {

    public static void CashWithdrawal(Account account, float amount){
        if(account.getBalance() - amount >= 0.0) {
            account.setBalance(account.getBalance() - amount);
        }
        else
        {
            System.out.println("Unexpected value");
        }



    }

}
