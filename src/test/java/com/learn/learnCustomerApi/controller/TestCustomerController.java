package com.learn.learnCustomerApi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CustomerController.class)
public class TestCustomerController {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getAllEmployeesAPI() throws Exception
    {
        mvc.perform(MockMvcRequestBuilders
                        .get("/api/v1/customer/21"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.firstName").value("test First123 Name"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.custId").value(121L));
    }

}
