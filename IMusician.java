public abstract interface IMusician {
    abstract void singSong(String title) ; 

    default String recordLabel(){
        return "Bigjara Records" ; 
    }
}