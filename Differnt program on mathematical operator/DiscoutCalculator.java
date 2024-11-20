import java.util.Scanner;
class DiscoutCalculator {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Tell me amount = ");
int amount = s.nextInt();
System.out.println(amount+" This is total amount of customer");
System.out.println("The discount is for LabourP");
System.out.println("The discount is for jobP ");
System.out.println("The discount is for fokalP");
System.out.println("Eneter Occupation: ");
String occupation = s.next();
System.out.println("Occupation of customer is: "+occupation);

// labour persion ke leye
if(amount >= 8000 && occupation.equals("LabourP")){
System.out.println("This is customer Total prize "+amount+" And customer is: "+occupation);
int discount = amount - (amount * 7 / 100);
System.out.println("According to customer detail: "+discount);
}

//job person ke leye discount
else if(amount >= 8000 && occupation.equals("jobP")){
System.out.println("This is customer Total prize"+amount+"And customer is: "+occupation);
int discount = amount - (amount * 6 / 100);
System.out.println("According to customer detail: "+discount);
}

// fokal person ke leye discount
else if(amount >= 8000 && occupation.equals("fokalP")){
System.out.println("This is customer Total prize"+amount+"And customer is: "+occupation);
int discount = amount - (amount * 8 / 100);
System.out.println("According to customer detail: "+discount);
}
else{
System.out.println("According to customer details customer is not eligible for any type of discount ");
}
s.close();
}
}