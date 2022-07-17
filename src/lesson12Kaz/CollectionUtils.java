package lesson12Kaz;

import java.util.*;

public class CollectionUtils implements ICollectionUtils{
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        List<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);

        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        List<Integer> result = new ArrayList<>(a);
        return result.retainAll(b) ? result : new ArrayList<>();
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new HashSet<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new HashSet<>(a);
        return result.retainAll(b) ? result : new HashSet<Integer>();
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        List<Integer> result = new ArrayList<>(a);
        List<Integer> temp = new ArrayList<>(b);
        result.removeAll(b);
        temp.removeAll(a);
        result.addAll(temp);
        return result;
    }
}
