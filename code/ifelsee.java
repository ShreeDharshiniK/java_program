import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner shree = new Scanner(System.in);
        String meghna = shree.nextLine();
        if(meghna.equals("dead"))
        {
            System.out.print("Surya meets priya");
        }
        else{
            System.out.print("Surya weds neghna");
        }
    }
}