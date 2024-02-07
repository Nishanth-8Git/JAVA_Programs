///////////////////////////Declaring Multiple Classes to test functions. ~Completed Successfully.~/////////////

/***ctrl+alt (+shift[for caps] => ṭēśṭīṇg) */

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
     int random_three(){   //earlier was static random int three

        System.out.println(a);
        System.out.println(a+"\n\n\n"); //protected member(s) can be accessed by the subclass(es).
        return a;

    }
}
/////////////////////////////////////////////~Test Completed Successfully.~/////////////////////////


/////////////////////////////////Testing abstract classes in java with some huge method enforcements//////////////
abstract class actual{

    ///Making the sub-classes to implement these inside them (forcefully using abstract classes.)
   abstract int must_method1();
   abstract double must_method2();
   abstract void must_method3();
   abstract char must_method4();

}

class trial1 extends actual{

    int must_method1(){

        int ret;
        ret =1;
        return ret;

    }

    double must_method2(){

        double retu;
        retu=1.33;
        return retu;

    }

    void must_method3(){

        String test = "This";
        System.out.println(test);

    }

    char must_method4(){

        char test;
        test = 'X';
        return test;

    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////


public class insane_msg_passing{
    public static void main(String args[]){
        scenario   A = new scenario();
        scenario2 B = new scenario2();
        sub1         s = new sub1();
        trial1        D = new trial1();

        //testing through methods:

        A.random_one();
        B.random_two();
        final int var  = s.random_three();
        System.out.println("The "+var+" value  has been finalized.");
        System.out.println(D.must_method2());
        D.must_method3();
    }
}