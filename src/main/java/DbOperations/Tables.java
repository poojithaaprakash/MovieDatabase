package DbOperations;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Tables {

    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String MovieTable = "CREATE TABLE MOVIES "
                    + "(MovieName VARCHAR(40) UNIQUE, "
                    + " Actor VARCHAR(40) , "
                    + " Actress VARCHAR(40), "
                    + " Director VARCHAR(20), "
                    + " YearOfRelease VARCHAR(5))";
            InsertUdateDelete.setData(MovieTable, "Movie Table created successfully!");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
