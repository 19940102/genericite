import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        StorageGenerique<Integer> storageGenerique = new StorageGenerique<>(new ArrayList<>());
        storageGenerique.addElement(12);
        storageGenerique.addElement(10);
        System.out.println(storageGenerique.getSize());
        try {
        System.out.println(storageGenerique.getElement(5));
    }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
}
}