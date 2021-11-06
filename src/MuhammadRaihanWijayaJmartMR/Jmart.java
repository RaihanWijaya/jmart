package MuhammadRaihanWijayaJmartMR;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
    /*Belum bener
    public static List<Product> read (String filepath) throws FileNotFoundException {
        Gson gson = new Gson();
        try{
            BufferedReader br = new BufferedReader(new FileReader(filepath));
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }
    */

    public static List<Product> filterByCategory (List<Product>list, ProductCategory category){
        List<Product> tempHasil = new ArrayList<Product>();

        for(Product temp : list){
            if(temp.category == category){
                tempHasil.add(temp);
            }
        }
        return tempHasil;
    }

    public static List<Product> filterByPrice (List<Product>list, double minPrice, double maxPrice){
        List<Product> tempHasil = new ArrayList<Product>();

        for(Product temp : list){
            if(temp.price >= minPrice){
                if(temp.price <= maxPrice){
                    if(minPrice != 0.0 && maxPrice != 0.0){
                        tempHasil.add(temp);
                    }
                }
            }
        }
        return tempHasil;
    }

    public static void main (String[] args){
        System.out.println("account id:" + new Account(null, null, null, -1).id);
        System.out.println("account id:" + new Account(null, null, null, -1).id);
        System.out.println("account id:" + new Account(null, null, null, -1).id);

        System.out.println("payment id:" + new Payment(-1, -1, -1, null).id);
        System.out.println("payment id:" + new Payment(-1, -1, -1, null).id);
        System.out.println("payment id:" + new Payment(-1, -1, -1, null).id);
        /*Belum bener
        try{
            List<Product> list = read("C:/Users/Raihan Wijaya/Documents/Kuliah Universitas Indonesia/Tugas Kuliah/Semester 3/Praktikum OOP/Tugas/Resource/CS6/randomProductList.json");
            List<Product> filtered = filterByPrice(list, 0.0, 2000.0);
            filtered.forEach(Product -> System.out.println(Product.price));
        }
        catch (Throwable t){
            t.printStackTrace();
        }
        */
    }

    /*
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
     */
}