///////////////////////////Declaring Multiple Classes to test functions. ~Completed Successfully.~/////////////
class scenario{
    int a=10;
    int b=10;
    int c=10;
    double spl = (int) 3.1467790 + 8.8846 ; //testing the conversion!
    void random_one(){
        System.out.println(spl+"\n");
    }
} 

class scenario2{
    //purposely declaring to see the "scope" of the variable(s).
    int a=10;
    int b=10;
    int c=10;
    void random_two(){
        System.out.println(c+"\n\n");
    }
    
}
/////////////////////////////////////////////~Test Completed Successfully.~/////////////////////////


////////////////////////////////This is a class inheritance test area ~Completed Successfullly.~/////
class sup1{
    protected static int a=100;
} 

class sub1 extends sup1{
    static void random_three(){
        System.out.println(a);
        System.out.println(a+"\n\n\n"); //protected member(s) can be accessed by the subclass(es).
    }
}
/////////////////////////////////////////////~Test Completed Successfully.~/////////////////////////


////////////////////////////////////////////////////////////////////////////////////////////////////
abstract class actual{

}
///////////////////////////////////////////////////////////////////////////////////////////////////


public class insane_msg_passing{
    public static void main(String args[]){
        scenario A = new scenario();
        scenario2 B = new scenario2();
        sub1     s = new sub1();

        //testing through methods:

        A.random_one();
        B.random_two();
        sub1.random_three();
    }
}