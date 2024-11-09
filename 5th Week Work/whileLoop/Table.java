import java.util.Scanner;
class Table {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.print("which table you want: ");
int number = s.nextInt();
int i=1;
while(i<=10){
System.out.println(i+"*"+number+"="+(number*i));
i++;
}
}
}