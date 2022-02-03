package Generics;

public class Genericclass {
    public static void main(String[] args) {

        // initialize generic class
        // with Integer data
        GenericsClass<Integer> intObj = new GenericsClass<>(6);
        System.out.println("Generic Class returns: " + intObj.getData());

        // initialize generic class
        // with String data
        GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
        System.out.println("Generic Class returns: " + stringObj.getData());
    }
}

// create a generics class
class GenericsClass<V> {

    // variable of T type
    private V data;

    public GenericsClass(V data) {
        this.data = data;
    }

    // method that return T type variable
    public V getData() {
        return this.data;
    }
}