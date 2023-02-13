import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args){

        int number ;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        number = input.nextInt();

        int tempNumber = number, a = 1;


        while(a > 0){
            for(int i = 1; i <= number; i++){ // bu döngü ile satır oluşturduk.
                for(int k= 0; k <= (i-1); k++){
                    System.out.print(" ");
                }
                for(int j= 0; j <= 2*tempNumber-2; j++){
                    System.out.print("*");
                }
                System.out.println("");
                tempNumber--;
            }
            a--;
        }
    }
    
}
