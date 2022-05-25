public class CustomError extends Exception {
    private String message ;
    CustomError(String message){
        this.message = message ; 
    }

    @Override
    public String toString() {
        return this.message ; 
    }
}
