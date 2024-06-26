import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connecDB {
    private String url, usr, pwd, db;

    public connecDB() {
        db = "barang";
        url = "jdbc:mysql://localhost/" + db;
        usr = "root";
        pwd = "";
    }

    public Connection getConnect() {
        Connection cn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(url, usr, pwd);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return cn;
    }
}