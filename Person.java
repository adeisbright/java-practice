

public class Person {
    static final int PERSON_LIFESPAN = 100; //Class Variable 
    private String name ;  //Instance variable 
    private double networth ;
    public int age ; 

    
    //This is how to create a constructor  
    Person(int age , String name , double networth){
        this.name = name ;
        this.age = age ; 
        this.networth = networth ; 
    }

    public String describe(){
        return this.name + " is " + this.age + " years old and has "  + this.networth ; 
    }

    public void getToLive(){
        System.out.println(Person.PERSON_LIFESPAN - this.age);
    } 

    // How do you handle null or undfine in java , how do you pass in n arguments
    public String greetPerson(boolean say){
        
        if (say == true){
            return "Hello " + this.name ; 
        }
        return "No greeting" ; 
    }
}
