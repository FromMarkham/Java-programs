public class Main{
    public static void main(String[] args){
        System.out.println("kkkkkkkkk");
        Helloworld1 h=new Helloworld1();
        h.kkk();
        Helloworld2 hh=new Helloworld2();
        hh.hypercubes();
        Kubes k=new Kubes();
        k.cubes();
        
        fivecubes ppp=new fivecubes();
        ppp.cubes();
        
        fourcubes v=new fourcubes();
        v.kkk();
        
        sixcubes b=new sixcubes();
        b.kkk();
        
    }
}

class Helloworld1{
    void kkk(){
        System.out.println("1234567890");
    }
}

class Helloworld2{
    void hypercubes(){
        System.out.println("1,16,81,256,625");
    }
}
interface Cube{
    void cubes();
}

class Kubes implements Cube{
    public void cubes(){
        System.out.println("1,8,27,64,125,216,343,512");
    }
}

class fivecubes implements Cube{
    public void cubes(){ 
        System.out.println("1,32,243.1024,3125,7776");
    }
}


class fourcubes extends Helloworld1{
    @Override 
    void kkk(){
        System.out.println("625,1296,2407,4096,6561");
    }
}

class sixcubes extends Helloworld1{
    @Override
    void kkk(){
        System.out.println("1,64,729,4096,15625,46656");
    }
}
