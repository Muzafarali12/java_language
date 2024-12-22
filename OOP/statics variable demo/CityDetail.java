class CityDetail {
int house;
String fName;
String caste;
String motherName;
String dougterName;
String sonName;
int children;
static String city;

public static void main(String [] args){

CityDetail H1 = new CityDetail();
H1.caste = "Shaikh";
H1.fName = "M.Rohan";
H1.motherName = "Samena";
H1.dougterName = "Hiba";
H1.sonName = "M.Asif";
H1.children = 2;
H1.city = "Khairpur";

CityDetail H2 = new CityDetail();
H2.caste = "Khuwaja";
H2.fName = "Raja";
H2.motherName = "Zarena";
H2.dougterName = "Naila";
H2.sonName = "M.Ali";
H2.children = 2;

CityDetail H3 = new CityDetail();
H3.caste = "Dewan";
H3.fName = "Ritik";
H3.motherName = "Kum Kum";
H3.dougterName = "Shardha";
H3.sonName = "Subhash";
H3.children = 2;

CityDetail H4 = new CityDetail();
H4.caste = "Shar";
H4.fName = "Roshan";
H4.motherName = "Zarena";
H4.dougterName = "Samena";
H4.sonName = "Sohail";
H4.children = 2;

System.out.println("This is the information of One city of Sukkhur");

System.out.println("");
System.out.println("Caste of Family : "+H1.caste);
System.out.println("House Owner and Father Name : "+H1.fName);
System.out.println("House Owner wife"+H1.motherName);
System.out.println("Doughter Name : "+H1.dougterName);
System.out.println("Sons Name : "+H1.sonName);
System.out.println("Counting of children : "+H1.children);
System.out.println("City  : "+city);

System.out.println("");
System.out.println("Caste of Family : "+H2.caste);
System.out.println("House Owner and Father Name : "+H2.fName);
System.out.println("House Owner wife"+H2.motherName);
System.out.println("Doughter Name : "+H2.dougterName);
System.out.println("Sons Name : "+H2.sonName);
System.out.println("Counting of children :"+H2.children);
System.out.println("City  : "+city);

System.out.println("");
System.out.println("Caste of Family : "+H3.caste);
System.out.println("House Owner and Father Name : "+H3.fName);
System.out.println("House Owner wife"+H3.motherName);
System.out.println("Doughter Name : "+H3.dougterName);
System.out.println("Sons Name : "+H3.sonName);
System.out.println("Counting of children :"+H3.children);
System.out.println("City  : "+city);

System.out.println("");
System.out.println("Caste of Family : "+H4.caste);
System.out.println("House Owner and Father Name : "+H4.fName);
System.out.println("House Owner wife"+H4.motherName);
System.out.println("Doughter Name : "+H4.dougterName);
System.out.println("Sons Name : "+H4.sonName);
System.out.println("Counting of children :"+H4.children);
System.out.println("City  : "+city);
}
} 