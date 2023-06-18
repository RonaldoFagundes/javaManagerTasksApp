package model;

import controller.Project;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.ConnectionFactory;



/**
 *
 * @author RFagundes
 */
public class ProjectModel {
   
     
    
    
     public void save(Project project)  {
        
     String sql = "INSERT INTO tb_projects"
                + "("
                + "name_pro,"
                + "description_pro,"
                + "createdAt_pro,"
                + "updatedAt_pro )"
                + "VALUES(?,?,?,?) "
                + " ";
        
        Connection conn = null;
        PreparedStatement pst = null ;
        
        try {
            conn = ConnectionFactory.getConnection();
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, project.getName());
            pst.setString(2, project.getDescription());            
            pst.setDate(3, new Date(project.getCreatedAt().getTime()));
            pst.setDate(4, new Date(project.getUpdatedAt().getTime()));                     
            
            pst.execute(); 
            
            System.out.println(project.getName()+" salvo com sucesso !!!");
            
          } catch (Exception e) {
            throw new RuntimeException("ERRO no metodo insert project "+e.getMessage(),e);
        } finally {
            ConnectionFactory.closeConnection(conn,pst);
            
                      
        }
    }

    
    
    
    
    
    public void update(Project project) {

   String sql = "UPDATE tb_projects SET name_pro =?, description_pro =?, createdAt_pro =?, updatedAt_pro =? WHERE id_pro  =?" ;
         
         Connection conn = null;
         
         PreparedStatement pst = null ;
         
         try {
           
            conn = ConnectionFactory.getConnection();
             
            pst = conn.prepareStatement(sql);
          
            pst.setString(1, project.getName());
            pst.setString(2, project.getDescription());
            pst.setDate(3, new Date(project.getCreatedAt().getTime()));
            pst.setDate(4, new Date(project.getUpdatedAt().getTime()));                     
            pst.setInt(5, project.getId());
            pst.execute();
             
            System.out.println(project.getName()+" atualizado com sucesso !!!"); 
             
        } catch (Exception e) {
            throw new RuntimeException("ERRO no metodo update project"+e.getMessage(),e);
        } finally {
            ConnectionFactory.closeConnection(conn,pst);
            
                      
        }
         
         
         
    }

    
    
    
    
    
    
    
    
    public void removeById(int idProject) {

        String sql = "DELETE FROM tb_projects WHERE id_pro =?";

        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = ConnectionFactory.getConnection();
            pst = conn.prepareStatement(sql);
            pst.setInt(1,idProject);
            pst.execute();
            
            System.out.println( " projeto id nº "+idProject+" removido com sucesso !!!");
            
            
        } catch (Exception e) {
            throw new RuntimeException("ERRO no metodo deletar project "+e.getMessage(),e);
        } finally {
            ConnectionFactory.closeConnection(conn,pst);
        }
    }

    
    
    
    
    
    
    
    
    
    
    public List<Project> getAll() {

        String sql = "SELECT * FROM tb_projects"; 
                
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;        
        
        List<Project> projects = new ArrayList<>();
                
        try {
            
          conn = ConnectionFactory.getConnection();
          pst = conn.prepareStatement(sql);        
           
          rs = pst.executeQuery();
                    
           while(rs.next()){
               
             Project project = new Project();         
               
               project.setId(rs.getInt("id_pro"));
               project.setName(rs.getString("name_pro"));
               project.setDescription(rs.getString("description_pro"));
               project.setCreatedAt(rs.getDate("createdAt_pro"));
               project.setUpdatedAt(rs.getDate("updatedAt_pro"));
               
               projects.add(project);
           }         
            
            
        } catch (Exception e) {
            throw new RuntimeException("ERRO no metodo getAll projects "+e.getMessage(),e);
        } finally {
            ConnectionFactory.closeConnection(conn,pst,rs);
        }               
        
        return projects;
    }
    
    
   
    
    
    
    
    
    


}
