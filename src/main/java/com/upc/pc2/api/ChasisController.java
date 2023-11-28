package com.upc.pc2.api;

import com.upc.pc2.domain.service.ChasisService;
import com.upc.pc2.mapping.ChasisMapper;
import com.upc.pc2.resource.ChasisResource;
import com.upc.pc2.resource.CreateChasisResource;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@Tag(name = "Chasis", description = "Create, read, update and delete chasis")
@RestController
@RequestMapping(value = "api/v1/chasis")
public class ChasisController {
    private final ChasisService chasisService;
    private final ChasisMapper mapper;

    public ChasisController(ChasisService chasisService, ChasisMapper mapper) {
        this.chasisService = chasisService;
        this.mapper = mapper;
    }

    @GetMapping
    public Page<ChasisResource> getAllChasis(Pageable pageable) {
        return mapper.modelListPage(chasisService.getAll(), pageable);
    }

    @PostMapping
    public ChasisResource createChasis(@RequestBody CreateChasisResource resource) {
        return mapper.toResource(chasisService.create(mapper.toModel(resource)));
    }
}
