class Book {
String name;
int printing;
String writer;
int price;

public void perBookDiscount(int price){
int discount = price - (price * 10 /100);
System.out.println("If You Buy This Book. You have 10% discount : "+discount);
}

public static void main(String [] args){

Book Shah_Jo_Risalo = new Book();
Shah_Jo_Risalo.name = "Shah_Jo_Risalo";
Shah_Jo_Risalo.printing = 2;
Shah_Jo_Risalo.writer = "Shah Abdul latif";
Shah_Jo_Risalo.price = 1500;

Book Quran = new Book();
Quran.name = "Quran Pak";
Quran.printing = 1;
Quran.writer = "Allah know";
Quran.price = 0000;

Book JavaLanguage = new Book();
JavaLanguage.name = "Java Language Book";
JavaLanguage.printing = 3;
JavaLanguage.writer = "Johan-Smith";
JavaLanguage.price = 3000;

Book JavaScript = new Book();
JavaScript.name = "JavaScript-Book";
JavaScript.printing = 4;
JavaScript.writer = "Smith";
JavaScript.price = 2200;

Book WebDevelopment = new Book();
WebDevelopment.name = "Web Development Course Book";
WebDevelopment.printing = 1; 
WebDevelopment.writer = "Dev";
WebDevelopment.price = 3500;

System.out.println("<<<<< Books Staling >>>>>");
System.out.println("");
System.out.println("Name = "+Shah_Jo_Risalo.name);
System.out.println("Printing = "+Shah_Jo_Risalo.printing);
System.out.println("Writer = "+Shah_Jo_Risalo.writer);
System.out.println("Price = "+Shah_Jo_Risalo.price);
Shah_Jo_Risalo.perBookDiscount(Shah_Jo_Risalo.price);

System.out.println("N");
System.out.println("Name = "+Quran.name);
System.out.println("Printing = "+Quran.printing);
System.out.println("Writer = "+Quran.writer);
System.out.println("Price = "+Quran.price);
Quran.perBookDiscount(Quran.price);

System.out.println("");
System.out.println("Name = "+JavaLanguage.name);
System.out.println("Printing = "+JavaLanguage.printing);
System.out.println("Writer = "+JavaLanguage.writer);
System.out.println("Price = "+JavaLanguage.price);
JavaLanguage.perBookDiscount(JavaLanguage.price);

System.out.println("");
System.out.println("Name = "+JavaScript.name);
System.out.println("Printing = "+JavaScript.printing);
System.out.println("Writer = "+JavaScript.writer);
System.out.println("Price = "+JavaScript.price);
JavaScript.perBookDiscount(JavaScript.price);

System.out.println("");
System.out.println("Name = "+WebDevelopment.name);
System.out.println("Printing = "+WebDevelopment.printing);
System.out.println("Writer = "+WebDevelopment.writer);
System.out.println("Price = "+WebDevelopment.price);
WebDevelopment.perBookDiscount(WebDevelopment.price);

}
}