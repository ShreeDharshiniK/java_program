import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner shree = new Scanner(System.in);
        String traff = shree.nextLine();
        if(traff.equals("red"))
        {
            System.out.print("Stop");
        }
        else if(traff.equals("yellow"))
        {
            System.out.print("Get Ready");
        }
        else if(traff.equals("green"))
        {
            System.out.print("Go");
        }
    }
}