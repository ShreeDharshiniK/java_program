import java.io.*;
class Test{
    String name;
    int id;
    Test(String name,int id){
        this.name=name;
        this.id=id;
    }
    public boolean equals(Object obj){
        if(this==obj)
        return true;
        if(obj==null||this.getClass()!=obj.getClass())
        return false;
        Test t=(Test)obj;
        return (t.name==this.name&&t.id==this.id);
    }
    public int hashCode(){
        return this.id;
    }}
    class TestHashcode{
        public static void main(String args[]){
            Test t1=new Test("aa",2);
            Test t2=new Test("aa",2);
            if(t1.hashCode()==t2.hashCode()){
                System.out.println("Hashcode equal");
            if(t1.equals(t2)){
                System.out.println("both are equal");
            }else{
            System.out.println("both are not equal");
            }}
            else
            System.out.println("both obj are not equal");
        }
    }
