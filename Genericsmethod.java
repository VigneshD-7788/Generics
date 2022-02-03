package Generics;

public class Genericsmethod {

    public static void main(String[] args) {

        DemoClass demo = new DemoClass();
        demo.genericsMethod("Hello Vignesh");
        demo.genericsMethod(45);
        demo.genericsMethod(1.7);
        demo.genericsMethod(true);
    }
}
 class DemoClass{

    public<G> void genericsMethod(G data){
        System.out.println("Generics Method: ");
        System.out.println("Data passed: "+data);
    }
}

