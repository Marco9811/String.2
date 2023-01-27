import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        String[] aliceToDos = {"Coding","Reading","Learning"};
        String[] bobToDos ={"Reading", "Coding","Learning","Sleeping"};
        String[] timToDos = {"Reading","Learning","Coding"};


        System.out.println(aliceToDos == bobToDos);
        System.out.println(aliceToDos == timToDos);
        System.out.println(aliceToDos.length != bobToDos.length);
        System.out.println(aliceToDos.length != timToDos.length);
        System.out.println(aliceToDos[0] != bobToDos[0]);
        System.out.println(aliceToDos[0] != timToDos[0]);
    }
}
