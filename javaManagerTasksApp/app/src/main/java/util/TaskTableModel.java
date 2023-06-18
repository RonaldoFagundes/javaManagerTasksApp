
package util;

import java.util.Date;

/**
 *
 * @author RFagundes
 */
public class TaskTableModel {

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
}
