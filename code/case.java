import java.util.Scanner;
class str{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String ans = "";  
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(Character.isUpperCase(c)){
                ans=ans+Character.toLowerCase(c);
            }
            else {
                ans=ans+Character.toUpperCase(c);
            }
        }
        System.out.print(ans);
        
    }
}