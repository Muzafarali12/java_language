class MergeTwoSortedArrays {
public static void main(String [] args){
int[] first = {1,2,3,4,5,6,7,8,9};
int[] second = {10,11,12,13,14,15};
int[] third = new int[first.length+second.length];
for(int i=0; i<first.length; i++){
third[i] = first[i];
}
for(int i=0; i<second.length; i++){
third[first.length+i] = second[i];}
for(int i=0; i<third.length; i++){
System.out.println(third[i]);
}
}
}

