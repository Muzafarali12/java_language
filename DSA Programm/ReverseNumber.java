class ReverseNumber {
public static void main(String [] args){
int[] numbers = {123,234,456,121,232,565};

for(int i=0; i<numbers.length; i++){
int originalNumber = numbers[i]; 
int reversing = 0;

while(numbers[i] > 0){
int r = numbers[i]%10;
reversing  = reversing * 10 + r;
numbers[i] = numbers[i]/10;
}


if(originalNumber == reversing){
System.out.println("This is Palindrom Number = "+reversing);
}
else{
System.out.println("This Number is not a palindrom Number = "+originalNumber);
}
}
}
}