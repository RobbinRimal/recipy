package home.recipy.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
@Entity

public class Recipy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String discription;
    private Integer preptime;
    private Integer serving;
    private Integer cooktime;
    private String url;
    private String source;
    private String direction;
    //todo add private difficulties
    @Enumerated(value = EnumType.STRING)
    // todo enum finally done
    private Difficulty difficulty;
    @Lob
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(nullable = false)
    private Notes notes;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "recipy")
    private Set<Ingredient> ingredients;
    @ManyToMany
    @JoinTable(name = "recipy_categorie",
            joinColumns = @JoinColumn(name = "recipy_id"),
            inverseJoinColumns = @JoinColumn(name = "categorie_id"))
    private  Set<Category> categories;


}

