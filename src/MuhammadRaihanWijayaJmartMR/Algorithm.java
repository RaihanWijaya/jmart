package MuhammadRaihanWijayaJmartMR;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Algorithm<T>{
    private Algorithm(){

    }
    //count
    public static <T> int count(T[]array, T value){
        return array.length;
    }
    public static <T> int count(Iterable<T>iterable, T value){
        int counter = 0;
        for(T i : iterable){
            counter++;
        }
        return counter;
    }
    public static <T> int count(Iterator<T>iterator, T value){
        int counter = 0;
        while(iterator.hasNext()){
            counter++;
        }
        return counter;
    }
    public static <T> int count(T[]array, Predicate<T>pred){
        int counter = 0;
        if(pred.equals(true)) {
            for (T i : array) {
                counter++;
            }
        }
        return counter;
    }
    public static <T> int count(Iterable<T>iterable, Predicate<T>pred){
        int counter = 0;
        if(pred.equals(true)) {
            for(T i : iterable){
                counter++;
            }
        }
        return counter;
    }
    public static <T> int count(Iterator<T>iterator, Predicate<T>pred){
        int counter = 0;
        if(pred.equals(true)) {
            while(iterator.hasNext()){
                counter++;
            }
        }
        return counter;
    }
    //===========================exists===========================
    public static <T> boolean exists(T[]array, T value){
        for(T i : array){
            if(i.equals(value)){
                return true;
            }
        }
        return false;
    }
    public static <T> boolean exists(Iterable<T>iterable, T value){
        for(T i : iterable){
            if(i.equals(value)){
                return true;
            }
        }
        return false;
    }
    public static <T> boolean exists(Iterator<T>iterator, T value){
        while(iterator.hasNext()){
            if(iterator.next().equals(value)){
                return true;
            }
        }
        return false;
    }

    public static <T> boolean exists(T[]array, Predicate<T>pred){
        for(T i : array){
            if(i.equals(pred)){
                return true;
            }
        }
        return false;
    }
    public static <T> boolean exists(Iterable<T>iterable, Predicate<T>pred){
        for(T i : iterable){
            if(i.equals(pred)){
                return true;
            }
        }
        return false;
    }
    public static <T> boolean exists(Iterator<T>iterator, Predicate<T>pred){
        while(iterator.hasNext()){
            if(iterator.next().equals(pred)){
                return true;
            }
        }
        return false;
    }
    //===========================find===========================
    public static <T> T find(T[] array, T value){
        for(T i : array) {
            if (i.equals(value)) {
                return i;
            }
        }
        return null;
    }
    public static <T> T find(Iterable<T> iterable, T value) {
        for (T i : iterable){
            if (i.equals(value)){
                return i;
            }
        }
        return null;
    }
    public static <T> T find(Iterator<T> iterator, T value) {
        while (iterator.hasNext()){
            if (iterator.next().equals(value)){
                return iterator.next();
            }
        }
        return null;
    }
    public static <T> T find(T[] array, Predicate<T> pred) {
        for (T i : array){
            if(i.equals(pred)){
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
        while (iterator.hasNext()){
            if (iterator.next().equals(pred)){
                return iterator.next();
            }
        }
        return null;
    }
    //===========================max & min===========================
    public static <T> T max(T first, T second) {
        return null;
    }
    public static <T> T min(T first, T second) {
        return null;
    }
}
