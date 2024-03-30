import java.util.ArrayList;
import java.util.LinkedList;

public class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void displayInfo() {
        System.out.println("Value: " + value);
    }

    public static <E> void genericMethod(E element) {
        System.out.println("Generic Method: " + element);
    }

    public static void main(String[] args) {
        GenericClass<Integer> intObj = new GenericClass<>(10);
        intObj.displayInfo();

        GenericClass<String> stringObj = new GenericClass<>("Hello, Generics!");
        stringObj.displayInfo();

        genericMethod(5);

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println("ArrayList: " + intList);

        LinkedList<String> strList = new LinkedList<>();
        strList.add("Apple");
        strList.add("Banana");
        strList.add("Cherry");
        System.out.println("LinkedList: " + strList);
    }
}

//Ouput//
Value: 10
Value: Hello, Generics!
Generic Method: 5
ArrayList: [1, 2, 3]
LinkedList: [Apple, Banana, Cherry]
//Hasil//
