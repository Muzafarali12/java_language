class linearSearching {
public static void main(String [] args){
int array[] = {22,33,44,55,20,66,77,88};
int num = 22;
int num2 = 33;
int num3 = 1;
boolean found = false;
for(int i=0; i<array.length;i++){
if(array[i] == num){
found = true;
continue;
}
if(array[i] == num2){
found = true;
continue;
}
if(array[i] == num3){
found = true;
break;
}
}
if(found){
System.out.println("The Number is finding "+num);
}
else{
System.out.println("The Number is not finding ");
}
}
}
}