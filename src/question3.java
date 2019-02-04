import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Integer[]number=new Integer[10];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("please enter the "+(i+1)+" number");
            number[i]=scanner.nextInt();
        }
        System.out.println("the number that you entered was ");
        for (int j=0;j<10;j++){
            System.out.println("number "+number[j]);
        }
        System.out.println("the reverese one is ");
        for (int j=10;j>0;j--){
            System.out.println("number "+number[j-1]);
        }
    }
}
