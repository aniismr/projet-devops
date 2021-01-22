package tn.iit.medicalfile.web.rest.errors;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ErrorMF {
    private String message;
    private String conflict;
	public ErrorMF(String message, String conflict) {
		super();
		this.message = message;
		this.conflict = conflict;
	}
	
	

}
