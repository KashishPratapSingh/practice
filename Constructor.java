class A{
    int a=0;
    int b=0;
    public A(){

    }
    public A(int a, int b){
        this.a=a;
        this.b=b;
    }
    public int sum(){
        return a+b;
    }
}
class B extends A{
    int a=0;
    int b=0;


    public B(int a, int b){
//        super(a,b);
        this.a=a;
        this.b=b;
    }

    @Override
    public int sum() {
        return a+b;
    }
}
public class Constructor {
    public static void main(String[] args) {
        A a=new B(23,40);
        System.out.print(a.sum());
    }
}
