class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        elements element=new elements();
        element.elements();
        
        elements2 ee=new elements2();
        ee.printelement();
        
        elements3 rr=new elements3();
        rr.printelement("00001");
        
        elements5 oo=new elements5();
        elements4 pp=elements4.K;
        
        System.out.println(oo.cc);
        System.out.println(elements5.cc);
        
        System.out.println(rr.returnelement());
        System.out.println(pp);
        
        for (elements4 ppp : pp.values()){
            System.out.println(ppp);
        }
        
        elements6 qqq=new elements6();
        qqq.setter("Y,Zr,Nb");
        
        System.out.println(qqq.getter());
        
        elements8 nnn=elements8.Pd;
        System.out.println(nnn);
        
        for (elements8 nnnn : nnn.values()){
            System.out.println(nnnn);
        }
    }
}

enum elements4{
    Ar,K,Ca,Sc,Ti,V;
}

class elements{
    public void elements(){
        System.out.println("H, He, Li");

    }
}

class elements2{
    private String element="Be,B,C";
    public void printelement(){
        System.out.println(element);        
    }
}

class elements3{
    private String element="";
    public void printelement(String element){
         this.element=element;       
    }

    public String returnelement(){
        return element;
    }
    
}

class elements5{
    static String cc="Ne,Na,Mg,Al";
    String kk="Si,P,S,Cl";
    public void print5(){
        System.out.println("111");
    }
}

class elements6{
    private String mmm="";
    
    public void setter(String mmm){
        this.mmm=mmm;
    }
    
    public String getter(){
        return mmm;
    }
}

enum elements8{
    Tc,Ru,Rh,Pd,Ag;
}
