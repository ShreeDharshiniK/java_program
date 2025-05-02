import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner shree = new Scanner(System.in);
        int score = shree.nextInt();
        if(score<50)
        {
            System.out.print("You need to improve");
        }
        else if(score>49 && score<71)
        {
            System.out.print("Good job");
        }
        else if(score>70)
        {
            System.out.print("Excellent Performance");
        }
    }
}