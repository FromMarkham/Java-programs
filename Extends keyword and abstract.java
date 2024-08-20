public class Main{
    public static void main(String[] args){
        System.out.println("a");
        
        letter f=new letter();
        f.saying();
        //letters n= new letters();
        keys k=new keys();
        k.saying();
    }
}

abstract class letters{
    void saying(){
        System.out.println("bbb");        
    }
}

abstract class alphabet{
    abstract void letter();
}

class letter extends letters{
    @Override 
    void saying(){
        System.out.println("abcdefghijklmnop");
    }
}

class keys extends letters{
    @Override
    void saying(){
        System.out.println("qwertyuiopasdfghjklzxcvbnm");
    }
}
