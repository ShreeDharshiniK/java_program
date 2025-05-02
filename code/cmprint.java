import java.util.Scanner;
class cmprint{
    public static void main(String args[]){
        Scanner shree = new Scanner(System.in);
        int num1 = shree.nextInt();
        int num2 = shree.nextInt();
        if(num1==num2)
        {
            System.out.print("Both the numbers are equal");
        }
        else
        {
            System.out.print("The numbers are not equal");
        }
        
    }
}