package class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Task {
    public static void main(String[] args) throws IOException {
        String path="Files/Task.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.setProperty("Name","Asghar");
        properties.setProperty("Age","25");
        properties.store(fileOutputStream,"A new name and age has been added");
    }
}

