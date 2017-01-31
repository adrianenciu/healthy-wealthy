package com.adrianenciu.controller;

import com.adrianenciu.model.User;
import com.adrianenciu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static com.adrianenciu.model.UserBuilderForTest.aUser;
import static com.google.common.collect.Lists.newArrayList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @Test
    public void whenGettingAllUsers_returnTheCorrectResult() throws Exception {
        List<User> expectedListOfUsers = newArrayList(aUser().build());
        when(userService.getUsers()).thenReturn(expectedListOfUsers);

        ModelAndView actual = userController.getUsers();

        assertThat(actual.getModel().get("users")).isEqualTo(expectedListOfUsers);
    }
}