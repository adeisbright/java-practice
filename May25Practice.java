public class May25Practice {

    static double checkDivisor(double a , double b){
        try{
            if(b == 0){
                throw new ArithmeticException("Divisor is zero") ; 
            }
            double result = a/b ; 
            return result ;
        }catch(Throwable e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public void echo(double params){
        System.out.println("The value is "  +  params);
    }

    public static void main(String ...args){

        May25Practice practice = new May25Practice() ; 
       

        double divide = May25Practice.checkDivisor(16, 0) ;
        
        practice.echo(divide);
        
        System.out.println("Today is May 25,2022");
    }
}
