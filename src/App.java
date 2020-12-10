import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class App {
    public static void main(String[] args) throws Exception {
        // String query = "select * from data ";
          try{         
            String q = "insert into data(Name,Age) values(?,?)";
         
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini", "vedang11", "vedang11");
            
            PreparedStatement pst = con.prepareStatement(q);

            pst.setString(1, "Soham Bhobe");
            pst.setString(2, "22");


            pst.executeUpdate();

            System.out.println("Insertion Successfull !!!");

            // Statement st = con.createStatement();
            // ResultSet rs = st.executeQuery(q);
            // System.out.println("Name\t\t\tAge");
            // while(rs.next()){
                
            // String name = rs.getString("Name");
            // String age = rs.getString("Age");
            // System.out.println("\n"+name+"\t\t"+age);
            // }
            
            con.close();
           }catch(Exception e){
               e.printStackTrace();
           }

        }
    }