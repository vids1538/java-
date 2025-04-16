class A
{
 int x;
 public static int y;
 void fun1()
 {
  y=22;
 }
 void fun2(){
 System.out.println(y);
 }
 void fun3(){
 y=45;
 }
}

class StaticMember
{
  public static void main(String [] args)
   {
     A a1=new A();
     A a2=new A();
     a1.fun1();   //fun1 chalega or isme y=22 assign ho jayega 
     a2.fun3();   //a2 ka fun3 chalega jsime y=45 ho jayega jo y ko overwrite kr dega qki y static member hai jo memory k heap area me bna hai or ek baar hi banta hai and class or instance dono refer kar sakte hai 
     a1.fun2();	   // then a1 ka fun2 chalega jisme y=45 print hoga qki overwrite k wjh se 45 ho chuka tha 
   }
   
}