package tn.iit.storemanagement.dto;

import lombok.*;
import tn.iit.storemanagement.domain.Category;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@ToString

public class MedicamentDto {
    private long id;
    @NotNull
    @NotEmpty
    @Size(min = 3)
    private String name;
    @NotNull
    private float dosage;
    @NotNull
    private float price;
    @NotNull
    private Date expiredDate;
    @NotNull
    private long categoryId;
    @NotNull
    @Size(min = 3)
    private String categoryName;
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
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public MedicamentDto(long id, @NotNull @NotEmpty @Size(min = 3) String name, @NotNull float dosage,
			@NotNull float price, @NotNull Date expiredDate, @NotNull long categoryId,
			@NotNull @Size(min = 3) String categoryName) {
		super();
		this.id = id;
		this.name = name;
		this.dosage = dosage;
		this.price = price;
		this.expiredDate = expiredDate;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	public MedicamentDto() {
		super();
	}
    
    
    
}
