import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        String[]name=new String[3];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("PleaSE enter the "+(i+1)+" Name");
            name[i]=scanner.nextLine();
        }
        System.out.println("the name that you entered was ..");
        for(int j=0;j<3;j++){
            System.out.println("name "+name[j]);
        }
    }
}
