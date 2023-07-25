
package util;

import controller.Task;
import java.util.Date;
import java.util.List;

/**
 *
 * @author RFagundes
 */
public class TaskTableMode {

    private boolean isCompleted;
    private Date deadLine;
    private Date createdAt;
    private Date updatedAt;
    private String description;
    private String id;
    private String idProject;
    private String name;
    private String notes;
   
    
    public void setIsCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}


	public Date getDeadLine() {
		return deadLine;
	}


	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}





	@Override
	public String toString() {
     return "Task [id=" + id + ", idProject=" + idProject + ", name=" + name + ", description=" + description
				+ ", notes=" + notes + ", isCompleted=" + isCompleted + ", deadLine=" + deadLine + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + "]";
	}

    public void setTasks(List<Task> tasks) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
