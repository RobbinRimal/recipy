package home.recipy.service;

import home.recipy.domain.Recipy;
import home.recipy.repository.Recipyrepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.slf4j.*;

import java.util.HashSet;
import java.util.Set;
@Service
@Slf4j
public class RecipyServiceimpl implements RecipiesService{
    Recipyrepo recipyrepo;

    public RecipyServiceimpl(Recipyrepo recipyrepo) {
        this.recipyrepo = recipyrepo;
    }

    @Override
    public Set<Recipy> getrecipe() {
        log.debug("i am in service");

        Set<Recipy> recipies=new HashSet<>();

        recipyrepo.findAll().iterator().forEachRemaining(recipies::add);

        return recipies;
    }
}
