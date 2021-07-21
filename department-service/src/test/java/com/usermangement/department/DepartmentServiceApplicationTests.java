package com.usermangement.department;

import com.usermangement.department.entity.Department;
import com.usermangement.department.repository.DepartmentRepository;
import com.usermangement.department.service.DepartmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class DepartmentServiceApplicationTests {

	@Autowired
	private DepartmentService service;

	@MockBean
	private DepartmentRepository repository;

	@Test
	public void getDepartment() {
		when(repository.findAll()).thenReturn(Stream
				.of(new Department(1L,"java","navin","Java-Web"))
				.collect(Collectors.toList()));
		assertEquals(1, service.getAllDepartment().size());
	}

	@Test
	public void getDepartmentsIds() {

		Department department=new Department(1L,"java","navin","Java-Web");
		//repository.findByDepartmentId(1L).ge;
		assertEquals(repository.findByDepartmentId(1L), service.findDepartmentById(1L));
	}

	@Test
	public void saveDeptTest() {

		Department department = new Department(1L,"java","navin","Java-Web");
		when(repository.save(department)).thenReturn(department);
		assertEquals(department, service.saveDepartment(department));
	}

	@Test
	public void deletedDeptTest () {
		//int userId=2;
		service.deleteDepartment(2L);
		assertThat(repository.existsById(2L)).isFalse();
	}

}
