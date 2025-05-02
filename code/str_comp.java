
class comp{
    public static void main(String args[])
    {
        String f1 = new String("apple");
        String f2 = new String("apple");

        String a1 = "orange";
        String a2 = "orange";

        System.out.print(f1==f2);//while comparing 2 strings, it compares the reference or address of the strings
        System.out.print(f1.equals(f2));//to compare the content inside the string use System.out.print(f1.equals(f2));
        System.out.print(a1==a2);
    }
}
