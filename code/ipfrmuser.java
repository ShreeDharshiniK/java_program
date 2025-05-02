
import java.util.Scanner;
class hello{
    public static void main(String args[]){
        Scanner shree = new Scanner(System.in);
        String name = shree.nextLine();
        int age = shree.nextInt();
        shree.nextLine(); //if a string comes after int ,we shd use this line
        String address = shree.nextLine();
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        System.out.print("My address is "+address);
    }
}