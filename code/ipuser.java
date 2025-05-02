import java.util.Scanner;
class hello{
    public static void main(String args[]){
        Scanner shree = new Scanner(System.in);
        String name = shree.nextLine();
        double score = shree.nextDouble();
        shree.nextLine(); //if a string comes after int ,we shd use this line
        String department = shree.nextLine();
        System.out.println("My name is "+name);
        System.out.println("My score is "+score/10+"/10");
        System.out.print("My department is "+department);
    }
}