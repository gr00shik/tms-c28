import java.util.ArrayList;
import java.util.List;

public class GenericMain {

    public static void main(String[] args) {

        Service<A2> service = new Service<>();


//        List<A2> a2s = new ArrayList<>();

        A1 a1 = new A1();
        A2 a2 = new A2();
        A3 a3 = new A3();

        List<? super A2> a2sup = new ArrayList<>();
        a2sup.add(a2);
        a2sup.add(a1);

        Object o = a2sup.get(0);

        // List<A2>
        // List<A3>
        // List<Object>

        List<? extends A2> a2ext = List.of(a1, a2);
        A2 a21 = a2ext.get(0);
//        a2ext.add(190);

        // List<A2>
        // List<A1>
        // List<A0>
        // List<Test>

        // PECS
        // Producer - extend, Consumer - super




    }

}
