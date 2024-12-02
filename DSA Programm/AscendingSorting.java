class AscendingSorting {
public static void main(String [] args){
int[] Array = {9,1,8,2,7,3,6,4,5};
for(int i=0; i<Array.length; i++){
for(int j=i+1; j<Array.length; j++){
if(Array[i] > Array[j]){
int lessNmber = Array[i];
Array[i] = Array[j];
Array[j] = lessNmber;
System.out.println("Sorting of Your A : "+lessNmber);
}
}
System.out.print(" "+Array[i]+" ");
}
}
}