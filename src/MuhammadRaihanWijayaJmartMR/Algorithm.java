package MuhammadRaihanWijayaJmartMR;

import java.util.*;

public class Algorithm<T> {
    private Algorithm() {

    }

    public static <T> int count(T[] array, T value) {
        final Iterator<T> var = Arrays.stream(array).iterator();
        return count(var, value);
    }

    public static <T> int count(Iterable<T> iterable, T value) {
        final Iterator <T> var = iterable.iterator();
        return count(var, value);
    }

    public static <T> int count(Iterator<T> iterator, T value) {
        final Predicate <T> var = value::equals;
        return count(iterator, var);
    }

    public static <T> int count(T[] array, Predicate<T> pred) {
        final Iterator<T> var = Arrays.stream(array).iterator();
        return count(var, pred);
    }

    public static <T> int count(Iterable<T> iterable, Predicate<T> pred) {
        final Iterator<T> var = iterable.iterator();
        return count(var, pred);
    }

    public static <T> int count(Iterator<T> iterator, Predicate<T> pred) {
        return count(iterator, pred);
    }

    public static <T> boolean exists(T[] array, T value) {
        final Iterator<T> var = Arrays.stream(array).iterator();
        return exists(var, value);
    }

    public static <T> boolean exists(Iterable<T> iterable, T value) {
        final Iterator<T> var = iterable.iterator();
        return exists(var, value);
    }

    public static <T> boolean exists(Iterator<T> iterator, T value) {
        final Predicate <T> var = value::equals;
        return exists(iterator, var);
    }

    public static <T> boolean exists(T[] array, Predicate<T> pred) {
        final Iterator<T> var = Arrays.stream(array).iterator();
        return exists(var, pred);
    }

    public static <T> boolean exists(Iterable<T> iterable, Predicate<T> pred) {
        final Iterator <T> var = iterable.iterator();
        return exists(var, pred);
    }

    public static <T> boolean exists(Iterator<T> iterator, Predicate<T> pred) {
        return exists(iterator, pred);
    }

    public static <T> T find(T[] array, T value) {
        final Iterator<T> var = Arrays.stream(array).iterator();
        return find(var, value);
    }

    public static <T> T find(Iterable<T> iterable, T value) {
        final Iterator <T> var = iterable.iterator();
        return find(var, value);
    }

    public static <T> T find(Iterator<T> iterator, T value) {
        final Predicate <T> var = value::equals;
        return find(iterator, var);
    }

    public static <T> T find(T[] array, Predicate<T> pred) {
        final Iterator<T> var = Arrays.stream(array).iterator();
        return find(var, pred);
    }

    public static <T> T find(Iterable<T> iterable, Predicate<T> pred) {
        final Iterator <T> var = iterable.iterator();
        return find(var, pred);
    }

    public static <T> T find(Iterator<T> iterator, Predicate<T> pred) {
        return find(iterator, pred);
    }

    public static <T extends Comparable<? super T>> T max(T first, T  second) {
        if(first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }

    public static <T extends Comparable<? super T>> T max(T[] array) {
        T maximum = array[0];

        for (T each : array) {
            if(each.compareTo(maximum) > 0)
            {
                maximum = each;
            }
            else {
                maximum = maximum;
            }
        }

        return maximum;
    }

    public static <T extends Comparable<? super T>> T max(Iterable<T> iterable) {
        final Iterator <T> each  = iterable.iterator();
        T maximum = null;
        while(each.hasNext()) {
            if (each.next().compareTo(maximum) > 0)
            {
                maximum = each.next();
            }
        }

        return maximum;
    }

    public static <T extends Comparable<? super T>> T max(Iterator<T> iterator) {
        T maximum = null;
        while(iterator.hasNext()) {
            if(iterator.next().compareTo(maximum) >= 0) {

            }
        }
        return maximum;
    }

    public static <T extends Comparable<? super T>> T max(T first, T second, Comparator<? super T> comparator) {
        T maximum;
        if(comparator.compare(first, second) >= 0)
        {
            maximum = first;
        }
        else {
            maximum = second;
        }
        return maximum;
    }

    public static <T extends Comparable<? super T>> T max(T[] array, Comparator<? super T> comparator) {
        T maximum = null;

        for (T each : array) {
            if(comparator.compare(each, maximum) >= 0)
            {
                maximum = each;
            }
            else {
                maximum = maximum;
            }
        }

        return maximum;
    }

    public static <T extends Comparable<? super T>> T max(Iterable<T> iterable, Comparator<? super T> comparator) {
        final Iterator <T> each  = iterable.iterator();
        T maximum = null;
        while(each.hasNext()) {
            if (comparator.compare(each.next(), maximum) >= 0) {
                maximum = each.next();
            }
        }

        return maximum;
    }

    public static <T extends Comparable<? super T>> T max(Iterator<T> iterator, Comparator<? super T> comparator) {
        T maximum = null;
        while(iterator.hasNext()) {
            if(comparator.compare(iterator.next(), maximum)>= 0) {

            }
        }
        return maximum;
    }

    public static <T extends Comparable<? super T>> T min(T  first, T  second) {
        if(first.compareTo(second) < 0) {
            return first;
        }
        return second;
    }

    public static <T extends Comparable<? super T>> T min(T[] array) {
        T minimum = null;

        for (T each : array) {
            if(each.compareTo(minimum) < 0) {
                minimum = each;
            }
            else {
                minimum = minimum;
            }
        }

        return minimum;
    }

    public static <T extends Comparable<? super T>> T min(Iterable<T> iterable) {
        final Iterator <T> each  = iterable.iterator();
        T minimum = null;
        while(each.hasNext()) {
            if (each.next().compareTo(minimum) < 0) {
                minimum = each.next();
            }
        }

        return minimum;
    }

    public static <T extends Comparable<? super T>> T min(Iterator<T> iterator) {
        T minimum = null;
        while(iterator.hasNext()) {
            if(iterator.next().compareTo(minimum) >= 0) {
                minimum = iterator.next();
            }
        }
        return minimum;
    }

    public static <T extends Comparable<? super T>> T min(T first, T second, Comparator<? super T> comparator) {
        T minimum;
         if(comparator.compare(first, second) >= 0) {
            minimum = first;
        }
        else {
            minimum = second;
        }
        return minimum;
    }

    public static <T extends Comparable<? super T>> T min(T[] array, Comparator<? super T> comparator) {
        T minimum = null;

        for (T each : array) {
            if(comparator.compare(each, minimum) <= 0) {
                minimum = each;
            }
            else {
                minimum = minimum;
            }
        }

        return minimum;
    }

    public static <T extends Comparable<? super T>> T min(Iterable<T> iterable, Comparator<? super T> comparator) {
        final Iterator <T> each  = iterable.iterator();
        T minimum = null;
        while(each.hasNext()) {
            if (comparator.compare(each.next(), minimum) <= 0)
            {
                minimum = each.next();
            }
        }

        return minimum;
    }

    public static <T extends Comparable<? super T>> T min(Iterator<T> iterator, Comparator<? super T> comparator) {
        T minimum = null;
        while(iterator.hasNext()) {
            if(comparator.compare(iterator.next(), minimum)>= 0) {

            }
        }
        return minimum;
    }

    public static<T> List<T> collect(T[] array, T value) {
        List<T> list = new ArrayList<T>();
        for (T each: array) {
            if(each.equals(value)) {
                list.add(each);
            }
        }
        return list;
    }

    public static<T> List<T> collect(Iterable<T> iterable, T value) {
        List<T> list = new ArrayList<T>();
        for (T each: iterable) {
            if(each.equals(value)) {
                list.add(each);
            }
        }
        return list;
    }

    public static<T> List<T> collect(Iterator<T> iterator, T value) {
        List<T> list = new ArrayList<T>();
        while(iterator.hasNext()) {
            T each = iterator.next();
            if(each.equals(value)) {
                list.add(each);
            }
        }
        return list;
    }

    public static<T> List<T> collect(T[] array, Predicate<T> pred) {
        List<T> list = new ArrayList<T>();
        for (T each: array) {
            if(pred.predicate(each)) {
                list.add(each);
            }
        }
        return list;
    }

    public static<T> List<T> collect(Iterable<T> iterable, Predicate<T> pred) {
        List<T> list = new ArrayList<T>();
        for (T each: iterable) {
            if(pred.predicate(each)) {
                list.add(each);
            }
        }
        return list;
    }


    public static<T> List<T> collect(Iterator<T> iterator, Predicate<T> pred) {
        List<T> list = new ArrayList<T>();
        while(iterator.hasNext()) {
            T each = iterator.next();
            if(pred.predicate(each)) {
                list.add(each);
            }
        }
        return list;
    }

    public static<T> List<T> paginate (T[] array, int page, int pageSize, Predicate<T> pred){
        List<T> tempHasil = new ArrayList<T>();

        if (pred.equals(true)){
            for(int i = ((array.length / pageSize) * page); i < ((array.length / pageSize) * page) + pageSize; i++){
                tempHasil.add(array[i]);
            }
        }
        return tempHasil;
    }

    public static<T> List<T> paginate (Iterable<T> iterable, int page, int pageSize, Predicate<T> pred) {
        List<T> tempHasil = new ArrayList<T>();
        int iterableSize = 0;
        for (Object i : iterable) {
            iterableSize++;
        }

        int start = (iterableSize / pageSize) * page;
        int finish = start + pageSize;
        int counter = 0;

        for (T each: iterable) {
            if (counter >= start && counter < finish) {
                tempHasil.add(each);
            }
            counter++;
        }
        return tempHasil;
    }

    public static<T> List<T> paginate (Iterator<T> iterator, int page, int pageSize, Predicate<T> pred) {
        List<T> tempHasil = new ArrayList<T>();
        int iteratorSize = 0;
        while (iterator.hasNext()) {
            iteratorSize++;
            iterator.next();
        }
        int start = (iteratorSize / pageSize) * page;
        int finish = start + pageSize;
        int counter = 0;

        while (iterator.hasNext()) {
            if(counter >= start && counter < finish){
                T each = iterator.next();
                tempHasil.add(each);
            }
            counter++;
        }
        return tempHasil;
    }
}