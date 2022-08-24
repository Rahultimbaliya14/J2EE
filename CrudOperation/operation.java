package CrudOperation;

import java.awt.List;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class operation {
       public static Connection getconnection(){
		      
    	    Connection con=null;
    	    try{
    	       Class.forName("com.mysql.jdbc.Driver");
    	       con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
    	    }
    	    catch(Exception e){
    	    	System.out.println(e);
    	    }
    	   return con;  
       }
       public static int insert(set s){
    	   Connection con=operation.getconnection();
    	   int result=0;
    	   try{
    	   PreparedStatement st=(PreparedStatement) con.prepareStatement("insert into detail(no,name,city,mobile,salary) values(?,?,?,?,?)");
    	      st.setString(1,s.getno() );
    	      st.setString(2,s.getname());
    	      st.setString(3,s.getcity() );
    	      st.setString(4,s.getmobile() );
    	      st.setString(5,s.getsalary() );
    	      result=st.executeUpdate();
    	   }
    	   catch(Exception e){
    		 System.out.println(e);   
    	   }
		return result;
       }
       public static int delete(String no){
    	   Connection con=operation.getconnection();
    	   int result=0;
    	   try{
    		   PreparedStatement st=(PreparedStatement)con.prepareStatement("delete from detail where no=?");
    		   st.setString(1,no);
    		   result=st.executeUpdate();
    	   }
    	   catch(Exception e){
    		  System.out.println(e); 
    	   }
		return result;
    	   
       }
}
