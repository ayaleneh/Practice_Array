import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        int sum=0;
        Integer[]number=new Integer[10];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("please enter the "+(i+1)+" number");
            number[i]=scanner.nextInt();
            sum=sum+number[i];
        }
        System.out.println("the average of the number is "+(sum/10));
    }
}
