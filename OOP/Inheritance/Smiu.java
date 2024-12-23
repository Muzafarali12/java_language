class University {
public static String name;
public static String address;
}

	class Se extends University{
		String dp;
	}

		class Ai extends University {
			int code;
			int fees;
		}

			class Bba extends Ai {
				int students;
			}

				public class Smiu {
				public static void main(String [] args){
Se s = new Se();
University.name="SMIU";
University.address="Karachi";
s.dp="Software-Engineering";

Ai a = new Ai();
a.code=20;
a.fees=50000;

Bba b = new Bba();
b.students=500;
b.code=33;
b.fees=60000;

System.out.println("SMIU S-E department. ");
System.out.println("University "+University.name);
System.out.println("Address "+University.address);
System.out.println("Department "+s.dp);

System.out.println();
System.out.println("SMI UNIVERSITY A-I department. ");
System.out.println("University "+University.name);
System.out.println("Address "+University.address);
System.out.println("d-p Code "+a.code);

System.out.println();
System.out.println("SMI UNIVERSITY Bba department. ");
System.out.println("University "+University.name);
System.out.println("Address "+University.address);
System.out.println("Students "+b.students);
System.out.println("d-p code "+b.code);
System.out.println("d-p Fees "+b.fees);
}
}
