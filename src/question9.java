public class question9 {
    public static void main(String[] args) {
        Integer[]number1={1,7,6,5,9};
        Integer[]number2={2,7,6,3,4};
        for(int i=0;i<number1.length;i++){
            if(number1[i]==number2[i]){
                System.out.println("("+number1[i]+","+number2[i]+")");
            }
        }
    }
}
