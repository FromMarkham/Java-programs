class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        elements element=new elements();
        element.elements();
        
        elements2 ee=new elements2();
        ee.printelement();
        
        elements3 rr=new elements3();
        rr.printelement("00001");
        
        System.out.println(rr.returnelement());
    }
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

