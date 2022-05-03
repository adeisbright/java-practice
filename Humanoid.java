public class Humanoid extends Human{
    private String address ; 
    Humanoid(String name , int age , float height , GenderEnum gender , String address){
        super(name , age , height , gender) ; 
        this.address = address ; 
    }

    public String getAddress(){
        return this.address ; 
    }
    public int getTimeToLive(){
        return LIFESPAN - getAge() ; 
    }
}
