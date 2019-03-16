package com.tw.nho.practicesystem.controller;

import com.tw.nho.practicesystem.Bean.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Optional;
import java.util.UUID;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TrainingCampControllerTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mvc;
    private MockHttpSession session;


    @Before
    public void setupMockMvc(){
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
        session = new MockHttpSession();
        User user =User.builder().name("root").password("root").build();
        session.setAttribute("user",user);
    }

    @Test
    public void should_succ_when_search() throws Exception {
        String res = mvc.perform(MockMvcRequestBuilders.get("/training_camps")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .session(session))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn().getResponse().getContentAsString();

        System.out.println(res);

    }



    @Test
    public void should_succ_when_save() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/training_camp")
                .content("{\"id\":1,\"name\":\"abc\",\"age\":12}")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .session(session))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

    @Test
    public void should_succ_when_update() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/training_camp/1")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .session(session))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

    @Test
    public void should_succ_when_delete() throws Exception {
        mvc.perform(MockMvcRequestBuilders.delete("/training_camp/1")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .session(session))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

}