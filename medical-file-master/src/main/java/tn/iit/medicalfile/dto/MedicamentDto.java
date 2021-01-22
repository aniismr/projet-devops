package tn.iit.medicalfile.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@ToString

public class MedicamentDto {
    @NotNull
    private long id;
    @NotNull
    @Size(min = 3)
    @NotEmpty
    private String name;
    @NotNull
    private float dosage;
    @NotNull
    private float price;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDosage() {
		return dosage;
	}
	public void setDosage(float dosage) {
		this.dosage = dosage;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public MedicamentDto(@NotNull long id, @NotNull @Size(min = 3) @NotEmpty String name, @NotNull float dosage,
			@NotNull float price) {
		super();
		this.id = id;
		this.name = name;
		this.dosage = dosage;
		this.price = price;
	}
	public MedicamentDto() {
		super();
	}
    
    
}
