import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner shree = new Scanner(System.in);
        int s1 = shree.nextInt();
        int s2 = shree.nextInt();
        int s3 = shree.nextInt();
        int s4 = shree.nextInt();
        int s5 = shree.nextInt();
        int add = s1+s2+s3+s4+s5;
        int avg =add/5;
        if(avg<35)
        {
            System.out.print("Additional class is required");
        }
        else
        {
            System.out.print("You are good to go");
        }
    }
}