
package util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author RFagundes
 */
public class DeadlineColumnCellRederer extends DefaultTableCellRenderer{
    
    
    
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column) {
    
    
   JLabel label;  
   label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        label.setHorizontalAlignment(CENTER);
        
        
        /*
        TaskTableModel taskModel = (TaskTableModel) table.getModel();
        Task task = taskModel.getTasks().get(row);
       
        
        if(task.getDeadLine().after(new Date())){
            
            label.setBackground(Color.lightGray);
            
        }else {
            
            label.setBackground(Color.RED);
        }
       */
           return label;

    }


    
    
    
    

}