class trail
{
  public static void main(String[] args) {
    byte b1 = 20;
    //short s = (byte)b1;
    //int a = (byte)b1;

    short s = b1;
    int c = b1;

    int x = 20;
   // byte y=(int)x;
   byte y = (byte)x;

   System.out.println("Byte --> Short"+" "+b1+"-->"+s);
   System.out.println("Byte --> Int"+" "+b1+"-->"+c);
   System.out.println(y);
  }
}