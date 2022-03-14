package home.recipy.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Entity
@Getter
@Setter

public class Ingredient
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String discription;
    private BigDecimal amount;
    @ManyToOne
    @JoinColumn(name = "recipy_id")
    private  Recipy recipy;
    @OneToOne(fetch = FetchType.EAGER)
    private  Unit unit;


}
