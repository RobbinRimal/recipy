package home.recipy.service;
import home.recipy.domain.Recipy;
import home.recipy.repository.Recipyrepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class RecipyServiceimplTest {
        RecipyServiceimpl recipyServiceimpl;
        @Mock
    Recipyrepo recipyrepo;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        recipyServiceimpl =new RecipyServiceimpl(recipyrepo);

    }

    @Test
    void getrecipe() {
        Recipy recipy=new Recipy();
        HashSet recipydata= new HashSet();
        recipydata.add(recipy);
    when(recipyServiceimpl.getrecipe()).thenReturn(recipydata);
        Set<Recipy> recipies=recipyServiceimpl.getrecipe();
        assertEquals(recipies,recipyServiceimpl.getrecipe());
    }
}