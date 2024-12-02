class EqualArrayChecking {
public static void main(String [] args){
int[] first = {1,2,3,4,5,6};
int[] second = {1,2,3,4,5,5};

boolean arraysAreEqual = true;
for (int i = 0; i < first.length; i++) {

if (first[i] != second[i]) {
arraysAreEqual = false;
break; 
}
}
if (arraysAreEqual) {
System.out.println("Arrays are equal in size and content.");
}
else {
System.out.println("Arrays are not equal in content.");
}
}
}
