package serialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class MainGson {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Rex");
        dog.setAge(9);
        dog.setWeight(16.5);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try (FileOutputStream outputStream = new FileOutputStream("dog.json")) {
            String jsonDog = gson.toJson(dog);
            outputStream.write(jsonDog.getBytes());
            System.out.println(jsonDog);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Dog dogi = null;
        try (FileReader fileReader = new FileReader("dog.json")) {
            BufferedReader reader = new BufferedReader(fileReader);
            dogi = gson.fromJson(reader, Dog.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(dogi);
    }
}
