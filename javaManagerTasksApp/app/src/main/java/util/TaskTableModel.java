package util;

import controller.Task;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author RFagundes
 */


public class TaskTableModel extends AbstractTableModel {

    
   
  String [] columns = {
      "Nome",
      "Descrição",
      "Prazo",
      "Tarefa Concluida",
      "Editar","Excluir"
     };
  
  List<Task> tasks = new ArrayList();  
    
  
  
    @Override
    public int getRowCount() {
        return  tasks.size();
    }

    
    
    
    @Override
    public int getColumnCount() {
       return columns.length;
    }
    
    
    @Override
    public String getColumnName(int columnIndex){
        return columns[columnIndex];
    }

    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
                
       switch(columnIndex){
           
           case 0 :
                return tasks.get(rowIndex).getName();
                       
           case 1 :
                return tasks.get(rowIndex).getDescription();
                       
           case 2 :
                return tasks.get(rowIndex).getDeadLine();             
            
           case 3 :
                return tasks.get(rowIndex).getIsCompleted();
                        
           case 4 :
              return "";  
       
           case 5 :
              return "";                    
             
           default:
              return " Dados não encontrados ";   
       }       
       
    }

    
    
    
    
    public String[] getColumns() {
        return columns;
    }

    
    
    
    
    public List<Task> getTasks() {
        return tasks;
    }
    
    
    
    

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
   
    
    
    
    
    
          
    
}
