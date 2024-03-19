package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

import lombok.Data;

@Data 
@Entity
@Table(name="govnt_table")
public class GovntEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String Name;
	@Column(name="contactNumber")
	private double contactNumber;
	@Column(name="email")
	private String email;
	@Column(name="age")
	private int age;
	@Column(name="MotherTounge")
	private String MotherTounge;
	@Column(name="gender")
	private String gender;
	@Column(name="maritalStatus")
	private String maritalStatus;
	private String Nationality;
	private String religion;
	private String address;
	

}
