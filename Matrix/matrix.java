import java.util.Scanner; 
class matrix {
public static void main (String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Eneter number of rows and columns : ");
int r = s.nextInt();
int c = s.nextInt();
int [] [] matrix = new int [r] [c];
for(int i=1; i<=r; i++){
for(int j=1; j<=c; j++){
System.out.print(j+ "  ");
}
System.out.println();
System.out.println();
}
}
}