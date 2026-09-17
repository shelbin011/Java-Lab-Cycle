import java.util.Scanner;
public class co1_exam_question {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no");
        int n;
        int count = 0;
        int sum = 0;
        int[] divs = new int[15];
        n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j] % 2 != 0){
                count++;
            }
        }
        System.out.println(count);
        for(int k=0;k<arr.length;k++){
            if(arr[k] % 2 == 0){
                sum = arr[k]+sum;
            }
        }
        System.out.println(sum);
        for(int l=0;l<arr.length;l++){
            if(arr[l] % 5 == 0){
                for(int div = 0; div<divs.length;div++){
                    divs[div]=s.nextInt();
                }
            }
        }

    }
}
