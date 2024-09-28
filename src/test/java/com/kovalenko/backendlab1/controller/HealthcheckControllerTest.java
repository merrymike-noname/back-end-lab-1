package com.kovalenko.backendlab1.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HealthcheckController.class)
public class HealthcheckControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHealthcheck() throws Exception {
        mockMvc.perform(get("/healthcheck"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.status").value("ok"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.time").exists());
    }
}
