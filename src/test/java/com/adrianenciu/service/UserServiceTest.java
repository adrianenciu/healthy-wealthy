package com.adrianenciu.service;

import com.adrianenciu.model.User;
import com.adrianenciu.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static com.adrianenciu.model.UserBuilderForTest.aUser;
import static com.google.common.collect.Lists.newArrayList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void whenGettingAllUsers_returnTheCorrectResult() throws Exception {
        User user1 = aUser().withFirstName("Ion").withLastName("Popescu").build();
        User user2 = aUser().withFirstName("George").withLastName("Ionescu").build();

        when(userRepository.findAll()).thenReturn(newArrayList(user1, user2));

        List<User> actual = userService.getUsers();

        assertThat(actual).containsExactly(user1, user2);
    }

    @Test
    public void givenNoUsers_whenGettingAllUsers_returnAnEmptyList() throws Exception {
        when(userRepository.findAll()).thenReturn(newArrayList());

        List<User> actual = userService.getUsers();

        assertThat(actual).isEmpty();
    }
}