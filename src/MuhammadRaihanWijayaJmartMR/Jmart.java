package MuhammadRaihanWijayaJmartMR;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.google.gson.*;

/**
 * Class for Jmart
 *
 * @author Muhammad Raihan Wijaya
 * @version v1.0 in Modul 4
 */
public class Jmart
{
    class Country{
        public String name;
        public int population;
        public List<String> listOfStates;
    }

    public static void main(String[] args){
        String filepath = "C:/Users/Raihan Wijaya/Documents/Kuliah Universitas Indonesia/Tugas Kuliah/Semester 3/Praktikum OOP/Tugas/Case Study/jmart/city.json";
        Gson gson = new Gson();
        try{
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            Country input = gson.fromJson(br, Country.class);
            System.out.println("Name: " + input.name);
            System.out.println("Population: " + input.population);
            System.out.println("States: ");
            input.listOfStates.forEach(state -> System.out.println(state));
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}