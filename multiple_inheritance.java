class Parent1
{
    void fun()
    {
        System.out.println("Parent1");
    }
}
  
// Second Parent Class
class Parent2
{
    void fun()
    {
        System.out.println("Parent2");
    }
}
class multiple_inheritance extends Parent1, Parent2
{
   public static void main(String args[])
   {
       Test t = new Test();
       t.fun();
   }
}