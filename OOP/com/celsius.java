import java.util.Scanner;

public class celsius {

    public void fahrenheitToCelsius(){
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter your celsius value :");
        int c = input.nextInt();
        int f = ((c*9/5)+32);
        System.out.println(" fahrenheit : " + f);
    }

    public void celsiusToFahrenheit(){
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter your fahrenheit value :");
        int feh = input.nextInt();
        int cel = ((feh-32)*5/9);
        System.out.println(" Celsius "+cel);
    }

    public void collOtherMethod(){
        Scanner input = new Scanner(System.in);
        System.out.println("1- Celsius to Fahrenheit. ");
        System.out.println("2- fahrenheit to Celsius. ");
        System.out.println("");
        System.out.println("Enter number What you Perform.");
        int choice = input.nextInt();
        if(choice == 1){
        fahrenheitToCelsius();
        }
        else if(choice == 2) {
            celsiusToFahrenheit();
        }
        String Choice = input.next();
        if(Choice.equals("Y")){
            collOtherMethod();
        }
        else{
            System.out.println("Thank You!");
        }
    }


    public static void main(String[] args) {
        celsius celc = new celsius();
        celc.collOtherMethod();
    }
}
