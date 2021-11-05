package MuhammadRaihanWijayaJmartMR;

import java.util.*;

public class Algorithm<T> {
    private Algorithm() {

    }
    //===========================collect===========================
    public static <T> List<T> collect(T[] array , T value){
        final Iterator<T>it = Arrays.stream(array).iterator();
        return collect(it, value);
    }

    public static <T> List<T> collect(Iterable<T>iterable , T value){
        final Iterable<T>e = (Iterable<T>) iterable.iterator();
        return collect(e, value);
    }

    public static <T> List<T> collect(Iterator<T>iterator , T value){
        final Predicate<T> predicate = value::equals;
        return collect(iterator, value);
    }

    public static <T> List<T> collect(T[] array, Predicate<T> pred){
        final Iterator<T> itArray = Arrays.stream(array).iterator();
        return collect(itArray, pred);
    }

    public static <T> List<T> collect(Iterator<T>iterator, Predicate<T> pred) {
        int count = 0;
        while(iterator.hasNext()){
            count++;
        }
        final Predicate<T> predicate = pred::equals;
        return collect(iterator, pred);
    }

    //===========================count===========================
    public static <T> int count(T[] array , T value){
        final Iterator<T>it = Arrays.stream(array).iterator();
        return count(it, value);
    }

    public static <T> int count(Iterable<T>iterable , T value){
        final Iterable<T>e = (Iterable<T>) iterable.iterator();
        return count(e, value);
    }

    public static <T> int count(Iterator<T>iterator , T value){
        final Predicate<T> predicate = value::equals;
        return count(iterator, value);
    }

    public static <T> int count(T[] array, Predicate<T> pred){
        final Iterator<T> itArray = Arrays.stream(array).iterator();
        return count(itArray, pred);
    }

    public static <T> int count(Iterable<T>iterable, Predicate<T> pred){
        final Iterable<T>e = (Iterable<T>) iterable.iterator();
        return count(e, pred);
    }

    public static <T> int count(Iterator<T>iterator, Predicate<T> pred) {
        int count = 0;
        while(iterator.hasNext()){
            count++;
        }
        final Predicate<T> predicate = pred::equals;
        return count(iterator, pred);
    }

    //===========================exists===========================
    public static <T> boolean exists(T[] array, T value) {
        for (T i : array) {
            if (i.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean exists(Iterable<T> iterable, T value) {
        for (T i : iterable) {
            if (i.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean exists(Iterator<T> iterator, T value) {
        while (iterator.hasNext()) {
            if (iterator.next().equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean exists(T[] array, Predicate<T> pred) {
        for (T i : array) {
            if (i.equals(pred)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean exists(Iterable<T> iterable, Predicate<T> pred) {
        for (T i : iterable) {
            if (i.equals(pred)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean exists(Iterator<T> iterator, Predicate<T> pred) {
        while (iterator.hasNext()) {
            if (iterator.next().equals(pred)) {
                return true;
            }
        }
        return false;
    }

    //===========================find===========================
    public static <T> T find(T[] array, T value) {
        for (T i : array) {
            if (i.equals(value)) {
                return i;
            }
        }
        return null;
    }

    public static <T> T find(Iterable<T> iterable, T value) {
        for (T i : iterable) {
            if (i.equals(value)) {
                return i;
            }
        }
        return null;
    }

    public static <T> T find(Iterator<T> iterator, T value) {
        while (iterator.hasNext()) {
            if (iterator.next().equals(value)) {
                return iterator.next();
            }
        }
        return null;
    }

    public static <T> T find(T[] array, Predicate<T> pred) {
        for (T i : array) {
            if (i.equals(pred)) {
                return i;
            }
        }
        return null;
    }

    public static <T> T find(Iterable<T> iterable, Predicate<T> pred) {
        for (T i : iterable) {
            if (i.equals(pred)) {
                return i;
            }
        }
        return null;
    }

    public static <T> T find(Iterator<T> iterator, Predicate<T> pred) {
        while (iterator.hasNext()) {
            if (iterator.next().equals(pred)) {
                return iterator.next();
            }
        }
        return null;
    }

    //===========================max===========================
    public static <T extends Comparable<? super T>> T max(T first , T second){
        if(first.hashCode()>second.hashCode()){
            return first;
        }else {
            return second;
        }
    }

    public static <T extends Comparable<? super T>> T max(T[] array){
        int max = 0;
        T result = null;
        for (T i : array) {
            if (i.hashCode() > max) {
                max = i.hashCode();
                result = i;
            }
        }
        return result;
    }

    public static <T extends Comparable<? super T>> T max(Iterable<T> iterable) {
        final Iterator<T> arr = iterable.iterator();
        T maximum = null;
        while (arr.hasNext()) {
            if (arr.next().compareTo(maximum) >= 0) {
                maximum = arr.next();
            }
        }

        return maximum;

    }

    public static <T extends Comparable<? super T>> T max(Iterator<T> iterator) {
        T maximum = null;
        while (iterator.hasNext()) {
            if (iterator.next().compareTo(maximum) >= 0) {
                maximum = iterator.next();
            }
        }

        return maximum;

    }

    public static <T extends Comparable<? super T>> T max(T first , T second, Comparator<?super T>comparator){
        int result = ((Comparable<T>) first).compareTo(second);
        return result == -1 ? second : first;
    }

    public static <T extends Comparable<? super T>> T max(T[] array, Comparator<?super T>comparator){
        int max = 0;
        T result = null;
        for (T i : array) {
            if (i.hashCode() > max) {
                max = i.hashCode();
                result = i;
            }
        }
        //int res = ((Comparable<T>) comparator).compareTo((T) array);
        return max(array, comparator);
    }

    public static <T extends Comparable<? super T>> T max(Iterable<T> iterable, Comparator<? super T> comparator) {
        final Iterator<T> arr = iterable.iterator();
        T maximum = null;
        while (arr.hasNext()) {
            if (comparator.compare(arr.next(), maximum) >= 0) {
                maximum = arr.next();
            }
        }

        return maximum;

    }

    public static <T extends Comparable<? super T>> T max(Iterator<T>iterator , T value, Comparator<?super T>comparator){
        int result = ((Comparable<T>) iterator).compareTo(value);
        if(iterator.next().hashCode()>value.hashCode()){
            return iterator.next();
        }else {
            return value;
        }
    }

    //===========================min===========================
    public static <T extends Comparable<? super T>> T min(T first, T second) {
        T minimum;
        if (first.compareTo(second) <= 0) {
            minimum = first;
        } else {
            minimum = second;
        }

        return minimum;

    }

    public static <T extends Comparable<? super T>> T min(T[] array) {
        T minimum = null;

        for (T arr : array) {
            if (arr.compareTo(minimum) <= 0) {
                minimum = arr;
            } else {
                minimum = minimum;
            }
        }

        return minimum;

    }

    public static <T extends Comparable<? super T>> T min(Iterable<T> iterable) {
        final Iterator<T> arr = iterable.iterator();
        T minimum = null;
        while (arr.hasNext())
        {
            if (arr.next().compareTo(minimum) <= 0) {
                minimum = arr.next();
            }
        }

        return minimum;

    }

    public static <T extends Comparable<? super T>> T min(Iterable<T> iterable, Comparator<? super T> comparator) {
        final Iterator<T> arr = iterable.iterator();
        T minimum = null;
        while (arr.hasNext()) {
            if (comparator.compare(arr.next(), minimum) <= 0) {
                minimum = arr.next();
            }
        }

        return minimum;

    }

    public static <T extends Comparable<? super T>> T min(T first, T second, Comparator<? super T> comparator) {
        T minimum;
        if (comparator.compare(first, second) >= 0) {
            minimum = first;
        } else {
            minimum = second;
        }

        return minimum;

    }

    public static <T extends Comparable<? super T>> T min(T[] array, Comparator<? super T> comparator) {
        T minimum = null;

        for (T arr : array) {
            if (comparator.compare(arr, minimum) <= 0) {
                minimum = arr;
            } else {
                minimum = minimum;
            }
        }

        return minimum;

    }

    public static <T extends Comparable<? super T>> T min(Iterator<T> iterator, Comparator<? super T> comparator) {
        T minimum = null;
        while (iterator.hasNext()) {
            if (comparator.compare(iterator.next(), minimum) >= 0) {
                minimum = iterator.next();
            }
        }

        return minimum;

    }

    public static <T extends Comparable<? super T>> T min(Iterator<T> iterator) {
        T minimum = null;
        while (iterator.hasNext()) {
            if (iterator.next().compareTo(minimum) >= 0) {
                minimum = iterator.next();
            }
        }

        return minimum;
    }
}