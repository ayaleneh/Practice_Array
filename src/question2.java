public class question2 {
    public static void main(String[] args) {
        int sum=0;
        Integer[]number=new Integer[10];
        for(int i=0;i<10;i++){
            number[i]=i+1;
            sum=sum+number[i];
        }
        System.out.println("Sum: "+sum);
    }
}
