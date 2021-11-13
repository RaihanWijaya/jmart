package MuhammadRaihanWijayaJmartMR;
import java.io.*;
import java.lang.*;
import java.util.Vector;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;

public class JsonTable<T> extends Vector
{
    public final String filepath;
    private static final Gson gson = new Gson();

    public JsonTable(Class<T> clazz, String filepath) throws IOException{
        this.filepath = filepath;
    }

    public static<T> T readJson(Class<T> clazz, String filepath) throws FileNotFoundException{
        final JsonReader read = new JsonReader(new FileReader(filepath));
        return gson.fromJson(read, clazz);
    }

    public void writeJson() throws IOException{
        writeJson(this, this.filepath);
    }

    public static void writeJson(Object object, String filepath) throws IOException{
        final FileWriter write = new FileWriter(filepath);
        write.write(gson.toJson(object));
        write.close();
    }
}