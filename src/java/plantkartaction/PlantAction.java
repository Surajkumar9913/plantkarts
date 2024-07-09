
package plantkartaction;
import dbconnection.plantkartDBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import plantkartbeans.PlantBean;


public class PlantAction 
{
   static Connection con=plantkartDBConnection.getPlantKartDBConnection();
   public boolean addPlant(PlantBean data)
   {
       boolean b=false;
       try 
       {
          
           PreparedStatement ps=con.prepareStatement("insert into plants (pid,plantname,plantdetail,price,quantity) values(?,?,?,?,?)");
           ps.setInt(1,data.getPid());
           ps.setString(2, data.getPlantName());
           ps.setString(3, data.getPlantDetail());
           ps.setInt(4, data.getPrice());
           ps.setInt(5, data.getQuantity());
           int i=ps.executeUpdate();
           if(i>0)
           {
               b=true;
           }
           
       } catch (Exception e) {
       }
       return b;
   }
   public ResultSet getBuyPlant( int pid)
   {
       ResultSet rs=null;
       try
       {
           Statement smt=con.createStatement();
           rs=smt.executeQuery("select * from plants where pid='"+pid+"'");
       }
       catch(Exception e)
       {
           
       }
       return rs;
   }
}
