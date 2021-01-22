package tn.iit.medicalfile.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Entity
public class Traitement implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @ManyToOne
    private Dossier dossier;
    @NotNull
    private long medicamentId;

    public Traitement(Dossier dossier, long medicamentId) {
        this.dossier = dossier;
        this.medicamentId = medicamentId;
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Dossier getDossier() {
		return dossier;
	}

	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}

	public long getMedicamentId() {
		return medicamentId;
	}

	public void setMedicamentId(long medicamentId) {
		this.medicamentId = medicamentId;
	}

	public Traitement() {
		super();
	}

	public Traitement(long id, @NotNull Dossier dossier, @NotNull long medicamentId) {
		super();
		this.id = id;
		this.dossier = dossier;
		this.medicamentId = medicamentId;
	}

	

	
	
}
