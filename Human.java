public abstract class Human {
    static final int LIFESPAN = 120 ; 
    private String name ; 
    private int age ; 
    private float height ; 
    private GenderEnum gender ;

    /**
     * Constructs a human object
     * @param name
     * @param age
     * @param gender
     */
    Human(String name , int age , GenderEnum gender){
        this.name = name ; 
        this.age = age ;
        this.gender = gender ; 
    }

    Human(String name ,  int age , float height , GenderEnum gender){
        this.name = name ; 
        this.age = age ;
        this.height = height ; 
        this.gender = gender ; 
    }

    public int getAge(){
        return this.age ;
    }

    public GenderEnum getGender(){
        return this.gender ; 
    }

    public String getName(){
        return this.name ; 
    }

    public float getHeight(){
        return this.height ; 
    }
    public abstract int getTimeToLive();
}
