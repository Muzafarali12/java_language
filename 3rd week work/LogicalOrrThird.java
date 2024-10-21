class LogicalOrrThird {
public static void main(String [] args){
int num1 = 23;
int num2 = 23;
int num3 = 33;
int num4 = 33;
boolean result = (num1 != num3 || num2 == num1 || num1 > num3);
System.out.println("Result: "+result);
}
}