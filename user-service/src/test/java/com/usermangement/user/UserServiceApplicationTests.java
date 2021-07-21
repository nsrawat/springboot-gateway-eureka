package com.usermangement.user;

import com.usermangement.user.VO.Department;
import com.usermangement.user.VO.ResponseTemplateVO;
import com.usermangement.user.entity.User;
import com.usermangement.user.repository.UserRepository;
import com.usermangement.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class UserServiceApplicationTests {

	@Autowired
	private UserService service;

	@MockBean
	private UserRepository repository;

	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void getAllUser() {
		when(repository.findAll()).thenReturn(Stream
				.of(new User(1L,"aman","yadav","ay@gmail.com",1L))
				.collect(Collectors.toList()));
		assertEquals(1, service.getUserWithDept().size());
	}

//	@Test
//	public void getDepartmentwithUsers() {
//
//		User user=new User(1L,"aman","yadav","ay@gmail.com",1L);
//		Department department=new Department(1L,"java","navin","Java-Web");
//
//		ResponseTemplateVO vo = new ResponseTemplateVO();
//		vo.setUser(user);
//		vo.setDepartment(department);
//		String man=service.getUserWithDepartment(1L).getDepartment().getDepartmentManager();
//
//			assertEquals(vo.getDepartment().getDepartmentManager(),man );
//	}
	@Test
	public void saveUserTest() {
		User user = new User(1L,"aman","yadav","ay@gmail.com",1L);
		when(repository.save(user)).thenReturn(user);
		assertEquals(user, service.saveUser(user));
	}

	@Test
	public void deletedUserTest () {
		//int userId=2;
		User user = new User(1L,"aman","yadav","ay@gmail.com",1L);
		service.deleteUser(1L);
		assertThat(repository.existsById(1L)).isFalse();
	}

}
