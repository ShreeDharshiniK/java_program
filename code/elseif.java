import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner shree = new Scanner(System.in);
        int score = shree.nextInt();
        if(score>35&&score<60)
        {
            System.out.print("Video game");
        }
        else if(score>60&&score<90)//else if used cause only one condition shd be printed either vdogame or iphn or macbkpro
        {
            System.out.print("Iphone");
        }
        else if(score>90)
        {
            System.out.print("MacBook pro");
        }
    }
}