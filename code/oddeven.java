import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner shree = new Scanner(System.in);
        int a = shree.nextInt();
        if(a%2==0)
        {
            System.out.print("Even");
        }
        else{
            System.out.print("ODD");
        }
    }
}