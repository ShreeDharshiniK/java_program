import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner shree = new Scanner(System.in);
        int marks = shree.nextInt();
        if(marks>34)
        {
            System.out.print("pass");
        }
        else
        {
            System.out.print("Fail");
        }
    }
}