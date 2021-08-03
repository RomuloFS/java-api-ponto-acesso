package com.bootcamp.SistemaDeControleDePonto.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Audited
public class Localidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;

}
