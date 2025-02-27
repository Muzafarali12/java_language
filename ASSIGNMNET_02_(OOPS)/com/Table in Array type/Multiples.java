import java.util.Scanner;
public class Multiples{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        //System.out.print("Enter Number of Rows = ");
        //int r = s.nextInt();
        //System.out.print("Enter Number of Columns = ");
        //int c = s.nextInt();
        int [] [] matrix = new int [2] [10];
        System.out.print("Enter a number for generate its table = ");
        int n = s.nextInt();
        for(int i=1; i<=2; i++){
            for(int j=1; j<=10; j++) {
                System.out.print(n*j +" ");

            }

            System.out.println();

        }

    }
}
