package DbOperations;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Select {

    public static ResultSet getData(String query) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

//    public static String getId() {
//        int id = 1;
//        try {
//            ResultSet rs = Select.getData("select max(BillID) from orders");
//            if (rs.next()) {
//                id = rs.getInt("1");
//                id = id + 1;
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        return String.valueOf(id);
//    }

//    public static ResultSet getCID(String Cname) {
//        
//        try {
//            ResultSet rs = Select.getData("select CID from customer where Cname='" + Cname + "'");
//            return rs;
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        return null;
//}
}
