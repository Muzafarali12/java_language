import java.util.Scanner;
class Table {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.print("which table you want: ");
int number = s.nextInt();
for(int i=1; i<=10; i++){
System.out.println(i+"*"+number+"="+(number*i));
}
}
}