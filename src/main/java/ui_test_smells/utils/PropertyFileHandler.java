package ui_test_smells.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileHandler {

    private static Properties prop;
    private static String filePath = "/Users/kapileson/Desktop/code-smells/src/main/resources/book_app_qa_env.properties";

    private PropertyFileHandler() {
    }

    public static String getValue(String key){
        loadPropertyFile();
        return prop.getProperty(key);
    }

    public static void loadPropertyFile(){
        if(prop == null){
            prop = new Properties();
            try(FileReader reader = new FileReader(filePath)) {
                prop.load(reader);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
