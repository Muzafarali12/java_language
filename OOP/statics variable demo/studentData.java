class studentData {
String name;
int id;
static String uni;

public static void main(String [] args){

studentData habib = new studentData();
habib.name = "Habibullah";
habib.id = 22;
studentData.uni= "SMIU";

studentData shahzad = new studentData();
shahzad.name = "Shahzad - Ali";
shahzad.id = 23;

studentData ali = new studentData();
ali.name = "Ali";
ali.id = 23;

studentData sarmad = new studentData();
sarmad.name = "Sarmmad";
sarmad.id = 20;

studentData nitesh = new studentData();
nitesh.name = "Nitesh kumar";
nitesh.id = 12;

System.out.println("");
System.out.println("This is List of SMIU students");
System.out.println("");
System.out.println(habib.name);
System.out.println(habib.id);
System.out.println(uni);

System.out.println("");
System.out.println(shahzad.name);
System.out.println(shahzad.id);
System.out.println(uni);

System.out.println("");
System.out.println(ali.name);
System.out.println(ali.id);
System.out.println(uni);

System.out.println("");
System.out.println(sarmad.name);
System.out.println(sarmad.id);
System.out.println(uni);

System.out.println("");
System.out.println(nitesh.name);
System.out.println(nitesh.id);
System.out.println(uni);
}
}
