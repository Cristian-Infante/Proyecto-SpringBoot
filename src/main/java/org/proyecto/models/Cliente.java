package org.proyecto.models;

import jakarta.persistence.*;
import lombok.*;

@Entity @AllArgsConstructor @NoArgsConstructor @Setter @Getter @ToString
public class Cliente {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    protected Integer idCliente;
    @Column(name="razonSocial", length=100)
    protected String razonSocial;
    @Column(name="email", length=100)
    protected String email;
}
