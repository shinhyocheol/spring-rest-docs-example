package com.example.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.restdocs.RestDocumentationContextProvider;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ExtendWith({RestDocumentationExtension.class, SpringExtension.class})
@AutoConfigureMockMvc
class SpringRestDocsExampleApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void before(
            WebApplicationContext context,
            RestDocumentationContextProvider provider) {
        this.mockMvc = MockMvcBuilders
                .webAppContextSetup(context)
                .apply(documentationConfiguration(provider))
                .addFilter(new CharacterEncodingFilter("UTF-8", true))
                .alwaysDo(print())
                .build();
    }

    @Test
    void context_loads_컨트롤러_호출_테스트() throws Exception{

        ResultActions result = this.mockMvc
                .perform(get("/posts").accept(MediaType.APPLICATION_JSON))
                .andDo(print());

        result
                .andExpect(status().isOk())
                .andDo(document("posts",
                        responseFields(
                                fieldWithPath("[].id").description("글 ID"),
                                fieldWithPath("[].title").description("글 제목"),
                                fieldWithPath("[].content").description("글 본문"),
                                fieldWithPath("[].author").description("글 작성자")
                        )
                ));
    }

    @Test
    void context_loads_유저_목록_조회_테스트() throws Exception {
        ResultActions result = this.mockMvc
                .perform(get("/v1/users").accept(MediaType.APPLICATION_JSON))
                .andDo(print());
    }

}
