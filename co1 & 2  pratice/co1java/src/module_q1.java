import java.util.Scanner;

public class module_q1 {
    public static void main(String[] args){
        int unitsConsumed;
        double previousDueAmount;
        int total;
        int balance;
        int newtot;
        int nortot;
        int finaltot;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the units");
        unitsConsumed = s.nextInt();
        System.out.println("Enter the due amount");
        previousDueAmount = s.nextInt();

        if(unitsConsumed<100){
            total = unitsConsumed*3;
            System.out.println(total);
        } else{
            balance = unitsConsumed - 100;
            newtot = balance*5;
            nortot = 100*3;
            finaltot = newtot+ nortot;
            System.out.print(finaltot);
        }

        if(unitsConsumed > 300 && previousDueAmount > 0 ){
            System.out.print("the user is a high consumer and delay payer");
        }
    }
}
