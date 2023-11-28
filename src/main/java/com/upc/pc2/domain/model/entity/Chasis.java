package com.upc.pc2.domain.model.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chasis")
public class Chasis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private int cpu;

    @NotNull
    private Long mmax;

    @NotNull
    private Long mtotal;

    @NotNull
    private Long mfree;

}
