class Father {
int x,y,z;
void sum(int a,int b ) {
z=a+b;
System.out.println("sum :"+z);
}
}
class Child extends Father {int sub(int a,int b){
x=a; y=b; return x-y ;


}
public static void main (String [] args ){
Child co=new Child();
co.sum(15,5);

System.out.println("sub : "+co.sub(15,5));
}
}