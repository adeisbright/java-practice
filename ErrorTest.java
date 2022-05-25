public class ErrorTest {
    void divide(double a , double b) {
        try{
            if (b == 0){
                throw new ArithmeticException("Divide by zero") ; 
            }else if (b == 1){
                throw new CustomError("My custom Error") ; 
            }
            var result = a/b ; 
            System.out.println("The result is : " + result);
        }catch(Throwable e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }finally{
            System.out.println("Done that shit") ; 
        }
    }
}
