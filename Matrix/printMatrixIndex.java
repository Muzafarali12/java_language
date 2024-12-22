import java.util.Scanner; 
class printMatrixIndex {
public static void main (String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Eneter number of rows and columns");
int r = s.nextInt();
int c = s.nextInt();
int [] [] matrix = new int [r] [c];
for(int i=0; i<r; i++){
for(int j=0; j<c; j++){
System.out.print(i+""+j+""+" ");
}
System.out.println();
System.out.println();
}
}
}