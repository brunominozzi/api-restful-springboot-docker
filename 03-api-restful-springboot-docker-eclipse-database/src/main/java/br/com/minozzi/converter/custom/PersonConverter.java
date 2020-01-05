package br.com.minozzi.converter.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.minozzi.data.model.Person;
import br.com.minozzi.data.vo.v2.PersonVOv2;

@Service
public class PersonConverter {
	
	public PersonVOv2 convertEntityToVO(Person person) {
		PersonVOv2 vo = new PersonVOv2();
		vo.setId(person.getId());
		vo.setFirstName(person.getFirstName());
		vo.setLastName(person.getLastName());
		vo.setAddress(person.getAddress());
		vo.setGender(person.getGender());
		vo.setBirthDay(new Date());
		return vo;
	}
	
	public Person convertVOToEntity(PersonVOv2 person) {
		Person entity = new Person();
		entity.setId(person.getId());
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());
		return entity;
	}

}
