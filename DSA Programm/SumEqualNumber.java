class SumEqualNumber {
public static void main(String [] args){ 
int[] Array = {12,4,1,6,3,2};
int Number = 11;
for(int i=0; i<Array.length; i++){
for(int j=i+1; j<Array.length; j++){
for(int k=j+1; k<Array.length; k++){
if((Array[i] + Array[j])+ Array[k] == Number){
System.out.println("first : "+Array[i]);
System.out.println("second : "+Array[j]);
System.out.println("third : "+Array[k]);
}
}
}
}
}
}