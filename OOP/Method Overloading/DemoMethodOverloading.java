class DemoMethodOverloading {

public int subtract(int a, int b){
System.out.println("Int waro Method s : "+(a-b));
return a-b;
}

public double subtract(long c, double d){
System.out.println("Float waro Method  d :  "+(c-d));
return c-d;
}

public float subtract(float e, int f){
System.out.println("Float waro Method : "+(e-f));
return e-f;
}

public long subtract(int g, long h){
System.out.println("Long waro Method : "+(g-h));
return g-h;
}

public static void main(String []args){
DemoMethodOverloading obj = new DemoMethodOverloading();
obj.subtract(7.3,3);
obj.subtract(22.0L,3.50L);
double num1 = (22.5);

obj.subtract(-522.5F,23);
obj.subtract(3111,222);


}
}