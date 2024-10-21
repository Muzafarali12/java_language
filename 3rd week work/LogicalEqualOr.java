class LogicalEqualOr {
public static void main(String [] args){
int num1 = 22;
int num2 = 30;
int num3 = 40;
int num4 = 50;
boolean result = (num2 < num3 || num2 < num1 || num1 == num2);
System.out.println("Result: "+result);}
}