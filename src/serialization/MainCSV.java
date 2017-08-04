package serialization;


import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.*;
import java.util.List;

public class MainCSV {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Rex");
        dog.setAge(9);
        dog.setWeight(16.5);

        try (FileWriter fileWriter = new FileWriter("dog.csv")) {
            StatefulBeanToCsv<Dog> beanToCsv = new StatefulBeanToCsvBuilder(fileWriter).build();
            beanToCsv.write(dog);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvRequiredFieldEmptyException e) {
            e.printStackTrace();
        } catch (CsvDataTypeMismatchException e) {
            e.printStackTrace();
        }
        Dog dogi = null;
        try (FileReader fileReader = new FileReader("dog.csv")) {
            CsvToBean csvToBean = new CsvToBeanBuilder(fileReader).withType(Dog.class).build();
            List<Dog> beans = csvToBean.parse();
            dogi = beans.get(0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(dogi);
    }
}
