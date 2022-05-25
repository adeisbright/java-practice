public class Humanoid extends Human implements IMusician{
    private String address ; 
    
    public Humanoid(String name , int age , GenderEnum gender ,  String address){
        super(name , age , gender) ; 
        this.address = address ; 
    }
    public Humanoid(String name , int age , double height ,GenderEnum gender ,  String address){
        super(name , age , height , gender) ; 
        this.address = address ; 
    }

    public String getAddress(){
        return this.address  ; 
    }
    public int getTimeToLive(){
        return Human.LIFESPAN - getAge() ; 
    }

    public void singSong(String title){
        System.out.println("Singing this"  +title);
    }
}
