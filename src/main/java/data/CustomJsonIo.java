package data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Type: this "Type" parameter specifies the type of object from which we are going to read or write in the json files like the ArrayList class (java library).
public class CustomJsonIo<Type>{

    private Gson gson;
    private Writer writer;
    private Reader reader;

    public CustomJsonIo() {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }


    public void writeArrayToJson(String fileName, ArrayList<Type> list){
        try{
            //initialize writer
            writer = Files.newBufferedWriter(Paths.get(fileName));

            //convert an arraylist to json file
            gson.toJson(list, writer);

            //close the writer, when is done writing
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Type> readArrayFromJson(String fileName, Class destinationType){
        ArrayList<Type> list = new ArrayList<>();

        try{
            reader = Files.newBufferedReader(Paths.get(fileName));
            List<Type> temp = (List<Type>) Arrays.asList(gson.fromJson(reader, destinationType));
            list = new ArrayList<Type>(temp);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void clearFile(String fileName){
        Writer writer = null;
        try {
            writer = Files.newBufferedWriter(Paths.get(fileName));
            writer.write("");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
