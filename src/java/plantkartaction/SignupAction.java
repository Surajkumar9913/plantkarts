
package plantkartaction;

import dbconnection.plantkartDBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import plantkartbeans.signupbean;

public class SignupAction 
{  Connection con=plantkartDBConnection.getPlantKartDBConnection();

    public boolean signUpRegister(signupbean data)
    {
       boolean b=false;
       try
       {
          Statement smt=con.createStatement();
          int i= smt.executeUpdate("insert into signup (email,name,mobile,password) values('"+data.getEmail()+"','"+data.getUser()+"','"+data.getMobile()+"','"+data.getPassword()+"')");
          
          if(i>0)
             b=true;
          else
            b=  false;
       }
       catch(Exception e )
       {}
       return b;
    }
    public ResultSet getCustomers()
    {ResultSet rs=null;
        try
        {
            Statement smt=con.createStatement();
            rs=smt.executeQuery("select * from signup");
        }
        catch(Exception e)
        {}
        return rs;
    }
    public boolean deletePerson(String email)
    { boolean b=false;
        try
        {  Statement smt=con.createStatement();
           int i=smt.executeUpdate("delete from signup where email='"+email+"'");
           if(i>0)
               b=true;
        }
        catch(Exception e)
        {}
        return b;
    }
            
}
