package home.recipy.repository;
import home.recipy.domain.Unit;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitRepo extends CrudRepository<Unit,Long> {
                                                                                    //todo use okpktional method <optinal > findby()
    Optional<Unit> findByDescription(String description);
}

