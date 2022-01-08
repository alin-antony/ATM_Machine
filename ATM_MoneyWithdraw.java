import java.util.Scanner;
public class ATM_MoneyWithdraw {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
int ACC_Balance=0,withdraw,deposit;
while (true){
    System.out.println("\n choose 1 for account_Balance");
    System.out.println("\n choose 2 for deposit ");
    System.out.println("\n choose 3 for Withdraw");
    System.out.println("\n choose 4 for exit");
    System.out.println("the choice is yours:");
    int choice=sc.nextInt();
    switch (choice){
        case 1:

                System.out.println(ACC_Balance);
                if (ACC_Balance==0) {
                    System.out.println("have to deposit amount");
                }

                break;
        case 2:

                System.out.println("enter the amount to be deposit:");
                deposit = sc.nextInt();
                ACC_Balance=deposit;
                System.out.println("Now your account balance is:"+ACC_Balance);

                break;
        case 3:
            System.out.println("Enter the amount to be withdraw:");
                withdraw = sc.nextInt();
                if (withdraw>=ACC_Balance) {
                    System.out.println("insufficient ammount!!!");
                }
else {
                    ACC_Balance = ACC_Balance - withdraw;
                    System.out.println("Now your account balance after withdraw:" + ACC_Balance);
                }
                    break;
case 4:
    System.exit(0);
    break;
    }
}
    }
}