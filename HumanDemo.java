
public class HumanDemo {
    public static void main(String ...args){
        GenderEnum gender = GenderEnum.MALE ; 
        System.out.println(gender.comment());
        Humanoid human = new Humanoid(
            "Adeleke" ,
            28,1.78 ,
            gender ,  
            "Azu odita"
        ) ; 
        human.getAddress() ; 
        human.getTimeToLive();
        human.recordLabel() ; 
    }
}
