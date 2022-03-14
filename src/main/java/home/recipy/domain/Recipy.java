package home.recipy.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

import java.security.PrivateKey;
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
    @Lob
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(nullable = false)
    private Notes notes;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "recipy")
    private Set<Ingredient> ingredients;


}
