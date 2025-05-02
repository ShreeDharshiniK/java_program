import java.util.Scanner;
class hello{
    public static void main(String args[]){
        Scanner shree = new Scanner(System.in);
        int a = shree.nextInt();
        int b = shree.nextInt();
        int c = shree.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        System.out.print(d/e);
    }
}