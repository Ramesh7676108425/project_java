package service;

import Dto.GovntDto;
import entity.GovntEntity;
import repository.GovntRepo;
import repository.GovntRepoImpl;

public class GovntServiceImpl implements GovntService{

	GovntRepo repo=new GovntRepoImpl();
	@Override
	public boolean save(GovntDto dto) {
		
		GovntEntity entity=new  GovntEntity();
		entity.setAddress(dto.getAddress());
		entity.setAge(dto.getAge());
		entity.setContactNumber(dto.getContactNumber());
		entity.setEmail(dto.getEmail());
		entity.setGender(dto.getGender());
		entity.setId(dto.getId());
		entity.setMaritalStatus(dto.getMaritalStatus());
		entity.setMotherTounge(dto.getMotherTounge());
		entity.setName(dto.getName());
		entity.setNationality(dto.getNationality());
		entity.setReligion(dto.getReligion());
	
		repo.save(entity);
		return true;
	}

}
