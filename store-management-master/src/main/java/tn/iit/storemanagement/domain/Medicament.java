package tn.iit.storemanagement.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString

@Entity
public class Medicament implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @NotEmpty
    @Size(min = 3)
    private String name;

    @NotNull
    private float dosage;

    private float price;
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date expiredDate;

    @NotNull
    @ManyToOne
    private Category category;

    public Medicament(String name, float dosage, float price, Date expiredDate, Category category) {
        this.name = name;
        this.dosage = dosage;
        this.price = price;
        this.expiredDate = expiredDate;
        this.category = category;
    }

	public Medicament(long id, @NotNull @NotEmpty @Size(min = 3) String name, @NotNull float dosage, float price,
			@NotNull Date expiredDate, @NotNull Category category) {
		super();
		this.id = id;
		this.name = name;
		this.dosage = dosage;
		this.price = price;
		this.expiredDate = expiredDate;
		this.category = category;
	}

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

	public Date getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Medicament() {
		super();
	}
    
    
    
}
