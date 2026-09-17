import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        //this is a program used to check the grade by inputing your grade
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the mark");
        int mark = s.nextInt();

        if (mark >= 90){
            System.out.print("You got A grade");
        }
        else if(mark >=80){
            System.out.print("Your got B grade");
        }
        else if(mark >=70){
            System.out.print("Your got c grade");
        }
        else if(mark >=60){
            System.out.print("Your got d grade");
        }
        else if(mark < 60){
            System.out.print("Fail !!!!!!");
        }
        else{
            System.out.print("Invalid input");
        }


    }
}
