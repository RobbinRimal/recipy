package home.recipy.repository;

import home.recipy.domain.Category;
import org.springframework.data.repository.CrudRepository;



public interface CategoryRepo extends CrudRepository<Category,Long> {


}
