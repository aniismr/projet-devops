package tn.iit.medicalfile.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Entity
public class Dossier implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @CreatedDate
    private Date createdDate;
    @NotNull
    @OneToOne
    private Patient patient;

    public Dossier(Patient patient){
        this.patient=patient;
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Dossier(Date createdDate, @NotNull Patient patient) {
		super();
		this.createdDate = createdDate;
		this.patient = patient;
	}

	public Dossier() {
		super();
	}


}
