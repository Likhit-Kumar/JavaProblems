interface PI1
{
    default void show()
    {
        System.out.println("Default PI1");
    }
}
  
interface PI2
{
    default void show()
    {
        System.out.println("Default PI2");
    }
}
  
class multiple_inheritance2 implements PI1, PI2
{
    public void show()
    {
        PI1.super.show();
        PI2.super.show();
    }
  
    public static void main(String args[])
    {
        multiple_inheritance2 d = new multiple_inheritance2();
        d.show();
    }
}
