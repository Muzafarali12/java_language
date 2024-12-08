class reverse {
public static void main(String [] args){
int num = 321;
int r;
int reversed = 0;
while (num > 0){
r = num%10;
reversed = reversed  * 10 + r;
// System.out.print(r);
num = num/10;
}
System.out.print("Reversing of Number is = "+reversed);
}
}