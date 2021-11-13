package MuhammadRaihanWijayaJmartMR;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

/**
 * Class for Jmart
 *
 * @author Muhammad Raihan Wijaya
 * @version v1.0 in Modul 4
 */
public class Jmart
{
    public static List<Product> filterByAccountId (List<Product>list, int accountId, int page, int pageSize){
        return paginate(list, page, pageSize, product -> product.accountId == accountId);
    }

    public static List<Product> filterByCategory (List<Product>list, ProductCategory category){
        List<Product> tempHasil = new ArrayList<Product>();

        for(Product temp : list){
            if(temp.category == category){
                tempHasil.add(temp);
            }
        }
        return tempHasil;
    }

    public static List<Product> filterByName (List<Product> list, String search, int page, int pageSize){
        return paginate(list, page, pageSize, product -> product.name.toLowerCase().contains(search.toLowerCase()));
    }

    public static List<Product> filterByPrice (List<Product>list, double minPrice, double maxPrice){
        List<Product> tempHasil = new ArrayList<Product>();

        for(Product temp : list) {
            if (minPrice == 0.0) {
                if (temp.price <= maxPrice) {
                    tempHasil.add(temp);
                }
            }
            else if (maxPrice == 0.0) {
                if (temp.price >= minPrice) {
                    tempHasil.add(temp);
                }
            }
            else if (minPrice != 0.0 && maxPrice != 0.0){
                if (temp.price >= minPrice) {
                    if (temp.price <= maxPrice) {
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

        try{
            List<Product> list = read("C:/Users/Raihan Wijaya/Documents/Kuliah Universitas Indonesia/Tugas Kuliah/Semester 3/Praktikum OOP/Tugas/Resource/CS6/randomProductList.json");
            List<Product> filtered = filterByPrice(list, 1000.0, 20000.0);
            filtered.forEach(Product -> System.out.println(Product.price));
        }
        catch (Throwable t){
            t.printStackTrace();
        }

        String filepath = "C:/Users/Raihan Wijaya/Documents/Kuliah Universitas Indonesia/Tugas Kuliah/Semester 3/Praktikum OOP/Tugas/Resource/CS7/Account.json";

        try{
            JsonTable<Account> tableAccount = new JsonTable<>(Account.class, filepath);
            tableAccount.add(new Account("name","email","password", 0));
            tableAccount.writeJson();

            tableAccount = new JsonTable<>(Account.class,filepath);
            tableAccount.forEach(account -> System.out.println(account.toString()));
        }catch (Throwable t){
            t.printStackTrace();
        }
    }

    private static List<Product> paginate (List<Product> list, int page, int pageSize, Predicate<Product> pred){
        List<Product> tempHasil = new ArrayList<Product>();

        if (pred.equals(true)){
            for(int i = ((list.size() / pageSize) * page); i < ((list.size() / pageSize) * page) + pageSize; i++){
                tempHasil.add(list.get(i));
            }
        }
        return tempHasil;
    }

    public static List<Product> read (String filepath) throws FileNotFoundException {
        Gson gson = new Gson();
        Type userListType = new TypeToken<ArrayList<Product>>() {
        }.getType();
        BufferedReader br = new BufferedReader(new FileReader(filepath));
        return gson.fromJson(br, userListType);
    }
}