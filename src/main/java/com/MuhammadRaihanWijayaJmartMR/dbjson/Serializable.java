package com.MuhammadRaihanWijayaJmartMR.dbjson;

import java.util.HashMap;

/**
 * Class for Recognizable
 *
 * @author Muhammad Raihan Wijaya
 * @version v1.0 in Modul 4
 */
public abstract class Serializable implements Comparable<Serializable>
{
    public int id;
    private static HashMap<Class<?>, Integer> mapCounter = new HashMap<Class<?>, Integer>();
    
    protected Serializable(){
        Integer counter = mapCounter.get(getClass());
        if(counter == null){
            counter = 0;
        }
        else{
            counter += 1;
        }
        mapCounter.put(getClass(), counter);
        this.id = counter;
    }

    @Override
    public int compareTo(Serializable other) {
        if (this.id == other.id){
            return 1;
        }
        else{
            return 0;
        }
    }

    public boolean equals(Object other){
        return other instanceof Serializable && ((Serializable) other).id == id;
    }

    public boolean equals(Serializable other){
        return other.id == id;
    }

    public static <T> int getClosingId(Class<T> clazz){
        return mapCounter.get(clazz);
    }

    public static <T> void setClosingId(Class<T> clazz, int id){
        mapCounter.put(clazz, id);
    }
}