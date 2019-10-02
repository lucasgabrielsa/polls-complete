package com.lucas.polls;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.List;

import com.lucas.polls.model.Role;
import com.lucas.polls.repository.RoleRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PollsApplicationTests {
	
	@Autowired
	private RoleRepository roleRepository;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void rolesListNotEmpty() {
		List<Role> roles = roleRepository.findAll();
		for(Role role: roles) {
			System.out.print(role);
		}

        assertThat(roles, not(IsEmptyCollection.empty()));
	}

}
