import java.util.Scanner;
class MathWorld {
                                       // Method for Even Odd Number
public void checkEvenOdd() {
Scanner sc = new Scanner(System.in);
System.out.print("Eneter a number that you want for Check Even or odd  : ");
int num = sc.nextInt();
if(num%2 == 0){
System.out.println("The Number is Even number : "+num);
}
else{
System.out.println("The Number is odd number : "+num);
}
}

					// Method For Generating Table
public void generatingTable() {

Scanner sc = new Scanner(System.in);
System.out.print("Eneter a number that you want for generate a table : ");
int num = sc.nextInt();
for(int i=0; i<=10; i++){
System.out.println(num+" * "+" "+i+" = "+(i*num));
}
}
					// For calculate Factorial
public void factorialCalculation(){
Scanner sc = new Scanner(System.in);
System.out.print("Eneter a number that you want for calculate factorial : ");
int num = sc.nextInt();
int factorial = 1;
for(int i=num; i>0; i--){
factorial *= i;
}
System.out.println("The factoraial of your number is : "+factorial);
}

					// Method for Reverse a Number
public void reversingaNumber(){
Scanner sc = new Scanner(System.in);
System.out.print("Eneter a number that you want reverse : ");
int num = sc.nextInt();
int reverse = 0;
while(num > 0){
int r = num%10;
reverse = reverse * 10 + r;
num = num/10;
}
System.out.println(reverse);
}
					// Method for Print All Factors
public void printFactors(){
Scanner sc = new Scanner(System.in);
System.out.print("Eneter a number that you want to find factors : ");
int num = sc.nextInt();
for(int i=num; i>0; i--){
if(num%i == 0){
System.out.println("This is prime factor "+i);
}
}
}
					// Method For Draw a diamond
public void generateDiamond(){
Scanner sc = new Scanner(System.in);
System.out.print("how much your diagram drag on lines give number of lines : ");
int num = sc.nextInt();
for(int i=1; i<=num; i++){
for(int j=num; j>=i; j--){
System.out.print(" ");
}
for(int k=1; k<=i; k++){
System.out.print(" *");
}
System.out.println();
}
}
					//Method for Amstrong number check
public void amstrongNumberCheck(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number for check is number is amstrong Yes or No : ");
int num = sc.nextInt();
int reverse = 0;
int n = 0;
int originalNum = num;
int result = 0;

int temp = num;
while(temp>0){
temp /= 10;
n++;
}
temp = num;
while(temp>0){
int digit = temp%10;

int power = 1;
for(int i = 0; i<n; i++){
power *= digit;
}

result += power;
temp /= 10;
}
if (result == originalNum) {
System.out.println(originalNum + " is an Armstrong number.");
} else { 
System.out.println(originalNum + " is not an Armstrong number.");
}
}
					// Method for Perfect number
public void perfectnumber(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number for check is number is perfect Yes or No : ");
int num = sc.nextInt();
int factor = 0;
for(int i=1; i<num; i++){
if(num%i == 0){
System.out.println(i);
factor += i;
}
}
if(factor == num){
System.out.println("The number is perfect Number"+num);
}
else{
System.out.println("The number is Not a perfect Number"+num);
}
}

					// Method for find Square 
public void findSquare(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number for check is number is perfect Yes or No : ");
int num = sc.nextInt();
System.out.println("Suare of your number is : "+(num * num));
}

					// Method for Palindrom Number




public void palindromNumber(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number for check is number is palindrom  Yes or No : ");
int num = sc.nextInt();
int number = num;
int reverse = 0;
int r;
while(num>0){
r = num%10;
reverse = reverse * 10 + r;
num  = num/10;
}
System.out.println(reverse);
if(reverse == number){
System.out.println("The number is palindrom number : "+number);
}
else{
System.out.println("The number is Not a palindrom number : "+number);
}
}


					// Method For Coll Other Method
public void collOtherMethod(){
checkEvenOdd();
generatingTable();
factorialCalculation();
reversingaNumber();
printFactors();
generateDiamond();
amstrongNumberCheck();
perfectnumber();
findSquare();
palindromNumber();
}
					// Main Method
public static void main(String [] args){
MathWorld mathWorld  = new MathWorld();
mathWorld.collOtherMethod();
}
}