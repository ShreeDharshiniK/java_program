class Test {
int i,j,k;
Test() {
System.out.println("No param Constructor");
}
Test(int i, int j) {
this.i = i;
this.j = j;
}
Test(int i, int j, int k) {//constructor overloading
this.i = i;
this.j = j;
this.k = k;}
void print(){
System.out.println("i= " +i+ " j= "+j+" k= "+k);
}
void print(String s) { //method overloading
System.out.println(s);
System.out.println("i= " +i+ " j= "+j+" k= "+k);
}
}
class Exp2 {
public static void main(String args[]) {
Test t = new Test();
Test t1 = new Test(1, 2);
Test t2 = new Test(1, 2, 3);
t.print();
t1.print();
t1.print("method overloading");
}
}
/*No param Constructor
i= 0 j= 0 k= 0
i= 1 j= 2 k= 0
method overloading
i= 1 j= 2 k= 0
*/