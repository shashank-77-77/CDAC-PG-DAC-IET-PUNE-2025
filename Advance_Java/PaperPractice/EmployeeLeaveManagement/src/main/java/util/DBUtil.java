package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.InputStream;

public class DBUtil {

    private static String driver;
    private static String url;
    private static String uname;
    private static String pass;

    static {
        try {
            Properties prop = new Properties();
            InputStream is = DBUtil.class
                    .getClassLoader()
                    .getResourceAsStream("db.properties");

            prop.load(is);

            driver = prop.getProperty("jdbc.driverclass");
            url = prop.getProperty("jdbc.url");
            uname = prop.getProperty("jdbc.uname");
            pass = prop.getProperty("jdbc.pass");

            Class.forName(driver);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(url, uname, pass);
    }
}
