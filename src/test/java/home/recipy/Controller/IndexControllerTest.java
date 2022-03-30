package home.recipy.Controller;

import home.recipy.service.RecipiesService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {
    @Mock
    RecipiesService recipiesService;
    @Mock
    Model model;
    IndexController indexController;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        indexController =new IndexController(recipiesService);

    }

    @Test
    void getIndex() {
        String viewname=indexController.getIndex(model);
assertEquals("index",viewname);

    }
}