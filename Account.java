import java.util.*;
public class Account {
    int accno = 10;
    String name = "bala";
    String pwd = "128";
    int amnt = 0;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account acc = new Account();
        System.out.println("enter your user name:\t");
        String usr = scan.next();
        System.out.println("\nenter your password:\t");
        String pass = scan.next();
        int chance=0;

        if (usr.equals(acc.name) && pass.equals(acc.pwd)) {
            int ch;
            do {
                System.out.println("\nhello! welcome to your bank account");
                System.out.println("your account number:"+acc.accno+"\nyour name:"+acc.name+"\n");
                System.out.println("MAINMENU:\n1.balance\n2.deposit\n3.withdraw\n4.exit\n");
                System.out.println("enter your choice:");
                ch=scan.nextInt();
                switch (ch){
                    case 1:
                        System.out.println("your account balance is:"+acc.amnt);
                        break;
                    case 2:
                        System.out.println("enter the amount to be deposited:\n");
                        int deposit=scan.nextInt();
                        acc.amnt=acc.amnt+deposit;
                        //amnt=amnt+deposit;
                        break;
                    case 3:
                        System.out.println("enter amount to be withdrawn:\n");
                        int withdwaw=scan.nextInt();
                        if(acc.amnt-withdwaw>=500){
                            acc.amnt=acc.amnt-withdwaw;
                        }else{
                            System.out.println("minimum account balance criteria failed!\n");
                        }
                        break;
                    case 4:
                        System.out.println("goodbye!\n");
                }
            }while (ch!=4);
        }else {
            chance=chance+1;
            System.out.println("wrong credintials!try again");
        }
    }
}