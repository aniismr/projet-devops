package tn.iit.storemanagement.web.rest.errors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data

public class ErrorSM  {
    private String message;
    private String conflict;
	public ErrorSM(String message, String conflict) {
		super();
		this.message = message;
		this.conflict = conflict;
	}
    
    
}
