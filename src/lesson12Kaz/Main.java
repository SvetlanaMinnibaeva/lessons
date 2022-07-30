package lesson12Kaz;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayListA = new ArrayList<>();
        arrayListA.add(56);
        arrayListA.add(67);
        arrayListA.add(56);
        ArrayList<Integer> arrayListB = new ArrayList<>();
        arrayListB.add(8);
        arrayListB.add(13);
        arrayListB.add(56);
        arrayListB.add(56);

        CollectionUtils b = new CollectionUtils();
        Collection<Integer> intB = b.union(arrayListA, arrayListB);
        System.out.println(intB);

        CollectionUtils c = new CollectionUtils();
        Collection<Integer> intC = c.intersection(arrayListA, arrayListB);
        System.out.println(intC);

        CollectionUtils d = new CollectionUtils();
        Collection<Integer> intD = d.unionWithoutDuplicate(arrayListA, arrayListB);
        System.out.println(intD);

        CollectionUtils e = new CollectionUtils();
        Collection<Integer> intE = e.intersectionWithoutDuplicate(arrayListA, arrayListB);
        System.out.println(intE);

        CollectionUtils f = new CollectionUtils();
        Collection<Integer> intF = f.difference(arrayListA, arrayListB);
        System.out.println(intF);
    }
}
