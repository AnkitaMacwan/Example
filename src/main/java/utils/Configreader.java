package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configreader {

public Properties properties() throws IOException {

    Properties prop = new Properties();
    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"/Properties/config.properties");
    prop.load(objfile);
    return prop;
}
}
