public class Main{
    public static void main(String[] args){
        System.out.println("kkkkkkkkk");
        Helloworld1 h=new Helloworld1();
        h.kkk();
        Helloworld2 hh=new Helloworld2();
        hh.hypercubes();
        hh.cubes();
        Helloworld3 hhh=new Helloworld3();
        hhh.squares();
        Helloworld4 u=new Helloworld4();
        u.fifths();
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
    void cubes(){
        System.out.println("1,8,27,64,125");
    }
}

class Helloworld3{
    void squares(){
        System.out.println("1,4,9,16,25");
    }
}

class Helloworld4{
    void fifths(){
        System.out.println("1,32,243,1024,3125");
    }
}
