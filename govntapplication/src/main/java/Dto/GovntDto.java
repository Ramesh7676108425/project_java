package Dto;

import javax.persistence.Id;

import lombok.Data;

@Data
public class GovntDto {
	@Id
	private int id;
	private String Name;
	private double contactNumber;
	private String email;
	private int age;
	private String MotherTounge;
	private String gender;
	private String maritalStatus;
	private String Nationality;
	private String religion;
	private String address;
	

}
