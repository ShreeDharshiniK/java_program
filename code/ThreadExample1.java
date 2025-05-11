public class ThreadExample1 extends Thread{
    public void run()
    {
        int a=10;
        int b=12;
        int result=a+b;
        System.out.println("Thread stsrted running...");
        System.out.println("Sum of two numbers is: "+ result);
    }
public static void main( String args[])
{
    ThreadExample1 t1=new ThreadExample1();
    t1.start();
}
}