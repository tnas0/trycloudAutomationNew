package com.trycloud.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties=new Properties();
    //2-we need to open the file in java memory:FileInputStream
    static {
        //2-we need to open the file in java memory:FileInputStream

        //load the properties object using FileInputStream object
        //click load and surround try catch
        try {
            FileInputStream file=new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("File not found in the configurationReader class.");
            e.printStackTrace();
        }

    }
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}

