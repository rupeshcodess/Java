class Base
{
public int calc(int x,int y)
 {
  System.out.printIn("Base");
  return(x+y);
 }
}
class Derived extends Base
{
  public int calc(intx,inty)
 {
   System.out.printIn("Derived");
  return(x-y);
 }
}
class Test3
{
 public static void main(String args[])
{
/*
 Derived dobj=new Derived()
 int result=dobj.cal(10,20);
 System.out.printIn(result);
*/
 
 Derived sobj=new Derived();
 Int result=sobj.calc(10,20);
 System.out.printIn(result);
 } 
}





