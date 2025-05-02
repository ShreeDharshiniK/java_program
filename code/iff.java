import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner shree = new Scanner(System.in);
        String RCB = shree.nextLine();
        
        if(RCB.equals("win"))
        {
            System.out.print("cup is ours");
        }
        else{
            System.out.print("cup illa");
        } 
    }
}