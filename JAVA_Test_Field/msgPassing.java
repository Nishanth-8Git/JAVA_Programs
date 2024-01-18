 class scenario{
     int a=10;
     int b=10;
     int c=10;

     void main(){
        System.out.println(a+b+c);
    } 
}

public class msgPassing{
    public static void main(String args[]){
        scenario A = new scenario();
        A.main();
    }
}
