import java.util.Scanner;
class demoMatrix {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Eneter number of rows and columns : ");
int r = s.nextInt();
int c = s.nextInt();
int [] [] matrix = new int [r] [c];

for(int i=0; i<r; i++){
for(int j=0; j<c; j++){
}
System.out.println();
}

for(int i=r; i>0; i--){
System.out.print("[ ");
for(int j=c; j>0; j--){
System.out.print(j+" ");
}
System.out.print("]");
System.out.println();
}
}
}