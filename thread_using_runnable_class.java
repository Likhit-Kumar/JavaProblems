
class IntThread implements Runnable
{
Thread t;
IntThread()
{
t = new Thread ( this, "Test thread");
System.out.println ("Child thread :" + t);
t.start();
}
public void run()
{
try {
for (int i= 5; i>0; i--)
{
System.out.println ("Main thread :" + i);
Thread.sleep (500);
}
} catch (InterruptedException e) { }
System.out.println ( "Main thread exiting");
}
}
public class thread_using_runnable_class
{
    public static void main(String args[]){
        IntThread obj = new IntThread();
    }
}