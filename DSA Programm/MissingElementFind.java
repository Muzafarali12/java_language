class MissingElementFind {
public static void main(String [] args){
int[] number1 = {1,2,3,4,5,6,7};
int[] number2 = {1,2,3,4,5,7};
int sum1 = 0;
int sum2 = 0;
for(int i=0; i<number1.length; i++){
sum1 += number1[i];

}
for(int i=0; i<number2.length; i++){
sum2 += number2[i];
}
if(sum1 == sum2){
System.out.print("No any Missing element");
}
else{
int r = sum1-sum2;
System.out.println("Number are Missing : "+r);
}
}
}
