package tn.iit.medicalfile.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@ToString

public class TraitementDto {

    @NotNull
    private long id;
    @NotNull
    private long dossierId;
    private String medicamentName;
    private float medicamentDosage;
    private float medicamentPrice;
    @NotNull
    private long medicamentId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getDossierId() {
		return dossierId;
	}
	public void setDossierId(long dossierId) {
		this.dossierId = dossierId;
	}
	public String getMedicamentName() {
		return medicamentName;
	}
	public void setMedicamentName(String medicamentName) {
		this.medicamentName = medicamentName;
	}
	public float getMedicamentDosage() {
		return medicamentDosage;
	}
	public void setMedicamentDosage(float medicamentDosage) {
		this.medicamentDosage = medicamentDosage;
	}
	public float getMedicamentPrice() {
		return medicamentPrice;
	}
	public void setMedicamentPrice(float medicamentPrice) {
		this.medicamentPrice = medicamentPrice;
	}
	public long getMedicamentId() {
		return medicamentId;
	}
	public void setMedicamentId(long medicamentId) {
		this.medicamentId = medicamentId;
	}
	public TraitementDto(@NotNull long id, @NotNull long dossierId, String medicamentName, float medicamentDosage,
			float medicamentPrice, @NotNull long medicamentId) {
		super();
		this.id = id;
		this.dossierId = dossierId;
		this.medicamentName = medicamentName;
		this.medicamentDosage = medicamentDosage;
		this.medicamentPrice = medicamentPrice;
		this.medicamentId = medicamentId;
	}
	public TraitementDto() {
		super();
	}
    
    
}
