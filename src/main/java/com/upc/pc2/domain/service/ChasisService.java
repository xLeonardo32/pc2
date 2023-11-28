package com.upc.pc2.domain.service;

import com.upc.pc2.domain.model.entity.Chasis;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ChasisService {
    List<Chasis> getAll();
    Page<Chasis> getAll(Pageable pageable);
    Chasis create(Chasis chasis);
}
