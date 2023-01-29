import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJDBC {

    public static void main( String[] args ) throws Exception {

        Connection cx = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/birds"
                ,
                "root"
                ,
                "...");//ideletedthepasswordonpurpose
        Statement st = cx.createStatement();
        ResultSet rs = st.executeQuery( "SELECT * FROM bird" );
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            System.out.println( "id :"+ id + " nom: " + name  );
        }
        rs.close();
        st.close();
        cx.close();
    }
}
