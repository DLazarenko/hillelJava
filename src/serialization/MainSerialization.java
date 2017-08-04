package serialization;

import java.io.*;

public class MainSerialization {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Rex");
        dog.setAge(9);
        dog.setWeight(16.5);

        try (FileOutputStream outputStream = new FileOutputStream("dog.tmp")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(dog);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Dog dogi = null;
        try (FileInputStream inputStream = new FileInputStream("dog.tmp")) {
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            dogi = (Dog) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(dogi);
    }
}
