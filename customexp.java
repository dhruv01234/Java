class vote extends Exception{
    public vote(String s){
        super(s);
    }
}

public class customexp {
    
    public static void main(String[] args) throws vote{
        throw new vote("my exception");
    }
}
