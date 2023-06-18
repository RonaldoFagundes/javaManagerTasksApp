/*
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Task;
import util.ConnectionFactory;
*/
package model;

/**
 *
 * @author RFagundes
 */



public class TaskModel {
    
    /*
    
    public void save(Task task)  {
        
     String sql = "INSERT INTO tb_tasks(id_fk_pro, name_tks, description_tks, completed_tks, notes_tks, deadline_tks, createdAt_tks, updatedAt_tks )"
                + "VALUES(?,?,?,?,?,?,?,?) ";
        
        Connection conn = null;
        PreparedStatement pst = null ;
        
        try {
            conn = ConnectionFactory.getConnection();
            pst = conn.prepareStatement(sql);
            
            pst.setInt(1, task.getIdProject());
            pst.setString(2, task.getName());
            pst.setString(3, task.getDescription());
            pst.setBoolean(4, task.getIsCompleted());
            pst.setString(5, task.getNotes());
            pst.setDate(6, new Date(task.getDeadLine().getTime()));
            pst.setDate(7, new Date(task.getCreatedAt().getTime()));
            pst.setDate(8, new Date(task.getUpdatedAt().getTime()));                     
            
            pst.execute();                      
            
            System.out.println(task.getName()+" salvo com sucesso !!!");
            
          } catch (Exception e) {
            throw new RuntimeException("ERRO no metodo insert tasks "+e.getMessage(),e);
        } finally {
            ConnectionFactory.closeConnection(conn,pst);
            
                      
        }
    }

    
    
    
    
    
    public void update(Task task) {

     String sql = "UPDATE tb_tasks SET id_fk_pro = ?, name_tks = ?, description_tks = ?, completed_tks = ?, notes_tks = ?, deadline_tks = ?, createdAt_tks = ?, updatedAt_tks = ? WHERE id_tks =?" ;
         
         Connection conn = null;
         
         PreparedStatement pst = null ;
         
         try {
           
            conn = ConnectionFactory.getConnection();
             
            pst = conn.prepareStatement(sql);
            
            
            
            pst.setInt(1, task.getIdProject());
            pst.setString(2, task.getName());
            pst.setString(3, task.getDescription());
            pst.setBoolean(4, task.getIsCompleted());
            pst.setString(5, task.getNotes());
            pst.setDate(6, new Date(task.getDeadLine().getTime()));
            pst.setDate(7, new Date(task.getCreatedAt().getTime()));
            pst.setDate(8, new Date(task.getUpdatedAt().getTime()));                     
            pst.setInt(9, task.getId());
            pst.execute();
             
            System.out.println(task.getName()+" atualizado com sucesso !!!"); 
             
        } catch (Exception e) {
            throw new RuntimeException("ERRO no metodo update tasks "+e.getMessage(),e);
        } finally {
            ConnectionFactory.closeConnection(conn,pst);
            
                      
        }
         
         
         
    }

    
    
    
    
    
    
    
    
    public void removeById(int taskId) {

        String sql = "DELETE FROM tb_tasks WHERE id_tks =?";

        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = ConnectionFactory.getConnection();
            pst = conn.prepareStatement(sql);
            pst.setInt(1, taskId);
            pst.execute();
            
            System.out.println( " task id nº "+taskId+" removido com sucesso !!!");
            
            
            
        } catch (Exception e) {
            throw new RuntimeException("ERRO no metodo deletar tasks "+e.getMessage(),e);
        } finally {
            ConnectionFactory.closeConnection(conn,pst);
        }
    }

    
    
    
    
    
    
    
    
    
    
    public List<Task> getAll(int idProject) {

        String sql = "SELECT * FROM tb_tasks WHERE id_fk_pro =?  "; 
                
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;        
        
        List<Task> tasks = new ArrayList<Task>();
                
        try {
            
          conn = ConnectionFactory.getConnection();
          pst = conn.prepareStatement(sql);          
          pst.setInt(1, idProject);          
          rs = pst.executeQuery();
                    
           while(rs.next()){
               
               Task task = new Task();               
               
               task.setId(rs.getInt("id_tks"));
               task.setIdProject(rs.getInt("id_fk_pro"));
               task.setName(rs.getString("name_tks"));
               task.setDescription(rs.getString("description_tks"));
               task.setIsCompleted(rs.getBoolean("completed_tks"));
               task.setNotes(rs.getString("notes_tks"));
               task.setDeadLine(rs.getDate("deadline_tks"));
               task.setCreatedAt(rs.getDate("createdAt_tks"));
               task.setUpdatedAt(rs.getDate("updatedAt_tks"));
               
               tasks.add(task);               
           }         
            
            
        } catch (Exception e) {
            throw new RuntimeException("ERRO no metodo getAll tasks "+e.getMessage(),e);
        } finally {
            ConnectionFactory.closeConnection(conn,pst,rs);
        }               
        
        return tasks;
    }
    
    */
}
