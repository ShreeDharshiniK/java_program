import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner shree = new Scanner(System.in);
        int a = shree.nextInt();
        if(a%3==0&&a%5==0)
        {
            System.out.print("Divisible by both 3 and 5");
        }
        else{
            System.out.print("Not divisible by both 3 and 5");
        }
    }
}