package mz.com.dimasoft.crudspring.auth.errors;
/**
 * 
 */
public class ErrorDTO {
	
	private int status;
	private String message;
	
	public ErrorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErrorDTO(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
