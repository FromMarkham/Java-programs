class HelloWorld {
    public static void main(String[] args) {
        System.out.println("jjj");

        
        sequencetwo sequenceTwo=new sequencetwo("1,8,27,256,625,1296");
        System.out.println(sequenceTwo.pthree);
        
        sequence Sequence=new sequence();
        Sequence.printsequence(); //private attributes
        //can only be accessed via methods 
        
        sequencefour sequenceFour=new sequencefour("1,64","1024,4096"); 
        System.out.println(sequenceFour.pfour+" "+sequenceFour.pfive);
        
        sequencefive sequenceFive=new sequencefive();
        
        sequenceFive.printsequence();
        
        sequencesix sequenceSix=new sequencesix("729,4096","15625");
        System.out.println(sequenceSix.pseven+" "+sequenceSix.peight);
        //System.out.println(thirdsequence.sequencefour);
        //System.out.println(sequencethree.pfive);
        
        sequencenine sequenceNine=new sequencenine();
        sequenceNine.nine();
    }
    
        
}

class sequence{
    private String ptwo="1,4,16,64,256,1024";
    //public sequence(String ptwo){
      //  this.ptwo=ptwo;
    //}
    
    void printsequence(){
        System.out.println(ptwo);
    }
}

class sequencetwo{
    String pthree="";
    public sequencetwo(String pthree){
        this.pthree=pthree;
    } 
}

class sequencefour{
    public String pfour; //if u add public it still works
    public String pfive;
    
    public sequencefour(String pfour,String pfive){
        this.pfour=pfour;
        this.pfive=pfive;
    } 
}

class sequencefive{
    private String psix="1,32,243,1024,3125";
        void printsequence(){
            System.out.println(psix);
        }
}

class sequencesix{
    String pseven;
    String peight;
    public sequencesix(String pseven,String peight){
        this.pseven=pseven;
        this.peight=peight;
    }
}

abstract class sequenceeight{
    abstract void nine();
}

class sequencenine extends sequenceeight{
    @Override
    void nine(){
        System.out.println("64,125,216,343");
    }
}

final class sequenceten{
    void ten(){
        System.out.println("123456789");
    }
}

//class sequenceleven extends sequenceten{
    
//}
