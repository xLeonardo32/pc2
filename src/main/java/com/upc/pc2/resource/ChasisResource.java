package com.upc.pc2.resource;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class ChasisResource {
    private Long id;
    private int cpu;
    private Long mmax;
    private Long mtotal;
    private Long mfree;
}
