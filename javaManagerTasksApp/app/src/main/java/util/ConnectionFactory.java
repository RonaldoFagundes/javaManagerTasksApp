
package util;

import java.sql.Connection;
import java.sql.DriverManager;




public class ConnectionFactory {
        
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DB     = "capgemini";
    public static final String URL    = "jdbc:mysql://localhost:3306/"+DB+"?useTimezone=true&serverTimezone=UTC";
    public static final String USER   = "";
    public static final String PASS   = "";
    
    
    public static Connection getConnection(){
        
         try{
             
              Class.forName(DRIVER); 
              System.out.println(" conexão feita com sucesso ao data base "+DB);
              return DriverManager.getConnection(URL, USER, PASS);
             
            }catch(Exception ex){             
               System.out.println(" erro na conexão ao db "+ex);               
               return null;
         }
         
    } 
     
     
     
    public static void closeConnection (Connection conn){
         try{
             if (conn != null){
                 conn.close();
                 System.out.println(" conexão encerrada com sucesso  ");
               }
         }catch(Exception ex){             
               System.out.println(" erro ao encerrar a conexão ao db "+ex);             
         }
     }
    
}
