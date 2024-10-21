class LogicalEqualAnd {
public static void main(String [] args){
int num1 = 10;
int num2 = 12;
int num3 = 20;
int num4 = 10;
boolean result = (num1 == num2 && num2 != num2 && num3 > num4);
System.out.println("Result: "+result);
}
}