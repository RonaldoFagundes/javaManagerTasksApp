
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




public class ConnectionFactory {
        
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DB     = "capgemini";
    public static final String URL    = "jdbc:mysql://localhost:3306/"+DB+"?useTimezone=true&serverTimezone=UTC";
    public static final String USER   = "";
    public static final String PASS   = "";
    
    
    public static Connection getConnection(){
        
         try{             
              Class.forName(DRIVER); 
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
    
    
    public static void closeConnection (Connection conn, PreparedStatement pst){
         try{
             
             if (conn != null){
                 conn.close();
                 System.out.println(" conexão encerrada com sucesso  ");
               }
             
             if(pst != null){
                 pst.close();
             }
             
             
         }catch(Exception ex){             
               System.out.println(" erro ao encerrar a conexão ao db "+ex);             
         }
     }
    
    
    
    public static void closeConnection (Connection conn, PreparedStatement pst, ResultSet rs){
         try{
             
             if (conn != null){
                 conn.close();
                 System.out.println(" conexão encerrada com sucesso  ");
               }
             
             if(pst != null){
                 pst.close();
             }
             
             if(rs != null){
                 rs.close();
             }
             
             
         }catch(Exception ex){             
               System.out.println(" erro ao encerrar a conexão ao db "+ex);             
         }
     }
    
}
