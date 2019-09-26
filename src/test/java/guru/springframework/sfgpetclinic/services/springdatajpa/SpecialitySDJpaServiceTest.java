package guru.springframework.sfgpetclinic.services.springdatajpa;

import static org.junit.jupiter.api.Assertions.*;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.repositories.SpecialtyRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SpecialitySDJpaServiceTest {

	//Mockito is smart enough to understand tha we need SpecialtyRepository in SpecialitySDJpaService constructor. So he mocks the SpecialtyRepository and with 	@InjectMocks, passes the new mock instance to the constructor

	@Mock
	SpecialtyRepository specialtyRepository;

	@InjectMocks
	SpecialitySDJpaService service;


	@Test
	void deleteById() {
		service.deleteById(1L);
	}

	@Test
	void testDelete(){
		service.delete(new Speciality());
	}
}