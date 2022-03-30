package home.recipy.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @ManyToMany(mappedBy ="categories")
    private Set<Recipy> recipies;
    private String discription;

}
/*INSERT INTO unit (UNITOFMESURE) VALUES ('Teaspoon');
INSERT INTO unit (UNITOFMESURE) VALUES ('Tablespoon');
INSERT INTO unit (UNITOFMESURE) VALUES ('Cup');
INSERT INTO unit (UNITOFMESURE) VALUES ('Pinch');
INSERT INTO unit (UNITOFMESURE) VALUES ('Ounce');*/