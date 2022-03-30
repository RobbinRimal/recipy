package home.recipy.domain;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class CategoryTest {
    Category category;
    @Mock
    Recipy recipy;
    @BeforeEach
    public  void setup(){
        category=new Category();
        MockitoAnnotations.openMocks(this);


    }


    @Test
    void getId() throws Exception {
        Long idValue=4L;
        category.setId(idValue);
        assertEquals(idValue,category.getId());

    }

    @Test
    void getRecipies() {
        recipy= new Recipy();

        HashSet recipyData=new HashSet();
        recipyData.add(recipy);
        when(category.getRecipies()).thenReturn(recipyData);
        Set<Recipy> recipies=category.getRecipies();

        assertEquals(recipies.size(),1);
    }

    @Test
    void getDiscription() {
    }
}