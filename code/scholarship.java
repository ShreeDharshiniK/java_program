import java.util.Scanner;
class hello{
    public static void main(String args[]){
        Scanner shree = new Scanner(System.in);
        int income = shree.nextInt();
        if(income>7000)
        {
            System.out.print("Scholarship is available");
        }
        else{
            System.out.print("Scholarship is not available");
        }
    }
}