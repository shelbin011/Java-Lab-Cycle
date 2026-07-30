import java.util.Scanner;

public class password {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the access code :");
        String code = s.nextLine();

        boolean hasCap = false;
        boolean hasLow = false;
        boolean hasDig = false;
        for(int i = 0; i < code.length();i++){
            char ch = code.charAt(i);
            if(Character.isUpperCase(ch)){
                hasCap = true;
            }
            else if(Character.isLowerCase(ch)){
                hasLow = true;
            }
            else if(Character.isDigit(ch)){
                hasDig = true;
            }
        }
        if(code.length()>=8 && hasCap && hasDig && hasLow){
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid");
        }


    }
}
