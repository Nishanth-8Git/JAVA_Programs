class  DivisonByZero extends Exception{
    public DivisonByZero(String message){
        super(message);
    }    
}

public class DivisonByZeroException {
    public static void main(String args[]){
        int dividend = 10;
        int divisor = 0;

        try{ 
            if(divisor == 0){
                throw new DivisonByZero("Can't Divide by Zero!");
            }
            int result = dividend/divisor;
            System.out.println("Result:"+result);
        }
        catch(DivisonByZero e){
            System.out.println("Division by zero caught:"+e.getMessage());
        }
        finally{
            System.out.println("Finally Block executed.");
        }
    }
}

