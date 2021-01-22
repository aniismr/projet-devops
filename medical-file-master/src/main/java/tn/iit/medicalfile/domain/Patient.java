package tn.iit.medicalfile.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Patient implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date birthday;
    @NotNull
    @NotEmpty
    private String name;
    @NotNull
    @Size(min = 8,max = 8)
    private long cin;

    public Patient(String name,long cin,Date birthday){
        this.name=name;
        this.cin=cin;
        this.birthday=birthday;
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCin() {
		return cin;
	}

	public void setCin(long cin) {
		this.cin = cin;
	}

	public Patient(long id, @NotNull Date birthday, @NotNull @NotEmpty String name,
			@NotNull @Size(min = 8, max = 8) long cin) {
		super();
		this.id = id;
		this.birthday = birthday;
		this.name = name;
		this.cin = cin;
	}

	public Patient() {
		super();
	}
    
    
}
