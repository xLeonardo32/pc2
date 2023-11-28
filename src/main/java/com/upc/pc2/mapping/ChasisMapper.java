package com.upc.pc2.mapping;

import com.upc.pc2.domain.model.entity.Chasis;
import com.upc.pc2.resource.ChasisResource;
import com.upc.pc2.resource.CreateChasisResource;
import com.upc.pc2.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class ChasisMapper implements Serializable {
    @Autowired
    EnhancedModelMapper mapper;

    public ChasisResource toResource(Chasis model) {
        return mapper.map(model, ChasisResource.class);
    }

    public Chasis toModel(CreateChasisResource resource) {
        return mapper.map(resource, Chasis.class);
    }

    public Page<ChasisResource> modelListPage(List<Chasis> modelList, Pageable pageable) {
        return new PageImpl<>(mapper.mapList(modelList, ChasisResource.class), pageable, modelList.size());
    }
}
