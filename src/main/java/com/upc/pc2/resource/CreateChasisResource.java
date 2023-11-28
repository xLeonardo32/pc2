package com.upc.pc2.resource;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateChasisResource {
    @NotNull
    private int cpu;

    @NotNull
    private Long mmax;

    @NotNull
    private Long mtotal;

    @NotNull
    private Long mfree;
}
