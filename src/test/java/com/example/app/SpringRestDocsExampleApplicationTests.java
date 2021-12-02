package com.example.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith({RestDocumentationExtension.class, SpringExtension.class})
//@WebMvcTest()
@AutoConfigureRestDocs
class SpringRestDocsExampleApplicationTests {

    @Test
    void contextLoads() {
    }

}
