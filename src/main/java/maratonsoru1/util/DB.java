package maratonsoru1.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    private final String mysqlDriver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost/maraton2soru1";
    private final String username = "root";
    private final String pass = "123456789";

    public Connection connection = null;

    public DB() {
        try {
            Class.forName(mysqlDriver);
            connection = DriverManager.getConnection(url, username, pass);
            if (!connection.isClosed()) {
                System.out.println("Connection Success");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
