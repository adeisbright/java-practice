/**
 * Learn how to use Enums in Java
 * 
 */
public enum GenderEnum {
    FEMALE(1,"F") ,
    MALE(2 , "M") , 
    UNDEFINED(3 , "U"){
        @Override 
        public String comment(){
            return "to be declared later: " + getRepr() + " ," + getDescr() ; 
        }
    };

    private final int repr ; 
    private final String descr ; 
    GenderEnum(int repr , String descr){
        this.repr = repr ; 
        this.descr = descr ; 
    }

    public int getRepr(){
        return this.repr ; 
    }

    public String getDescr(){
        return this.descr ; 
    }

    public String comment(){
        return repr + " : " + descr ; 
    }
}
