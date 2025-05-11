class TestException {
public static void main(String args[]) {
try{
int a = 100/0;
System.out.println(a);
}
catch(Exception e) {
System.out.println("Arithmetic Exception");
System.out.println(e);
}
finally { // executed always
System.out.println("Exception handling...");
}
}}
/*
Arithmetic Exception
java.lang.ArithmeticException: / by zero
Exception handling...
PS C:\Users\SHREE DHARSHINI\OneDrive\文档\JavaLab> 
*/



