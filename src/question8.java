public class question8 {
    public static void main(String[] args) {
        String[]letter={"w","t","y","h","k"};
        for(int i=0;i<letter.length;i++){
            if(letter[i]=="t"){
                letter[i]="hello";
            }
        }
        for(int j=0;j<letter.length;j++){
            System.out.println(letter[j]);
        }
    }
}
