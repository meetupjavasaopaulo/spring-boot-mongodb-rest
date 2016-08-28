package com.example;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DemoApplicationTests {


    @Autowired
    private MockMvc mockMvc;

    @Test
    public void apiNoAr() throws Exception {

        this.mockMvc.perform(get("/api/meetup")).andDo(print()).andExpect(status().isOk());
    }
    
    @Test
    public void apiBuscaTodos() throws Exception {

        this.mockMvc.perform(get("/api/meetup")).andDo(print()).andExpect(status().isOk())
                 .andExpect(jsonPath("$[0].titulo").value("12o Meetup"));
    }
    
}
