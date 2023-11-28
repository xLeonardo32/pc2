package com.upc.pc2.service;

import com.upc.pc2.domain.model.entity.Chasis;
import com.upc.pc2.domain.persistence.ChasisRepository;
import com.upc.pc2.domain.service.ChasisService;
import com.upc.pc2.shared.exception.ResourceValidationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;

@Service
public class ChasisServiceIn implements ChasisService {
    private static final String ENTITY = "Chasis";
    private final ChasisRepository chasisRepository;
    private final Validator validator;

    public ChasisServiceIn(ChasisRepository chasisRepository, Validator validator) {
        this.chasisRepository = chasisRepository;
        this.validator = validator;
    }

    @Override
    public List<Chasis> getAll() {
        return chasisRepository.findAll();
    }

    @Override
    public Page<Chasis> getAll(Pageable pageable) {
        return chasisRepository.findAll(pageable);
    }

    @Override
    public Chasis create(Chasis chasis) {
        Set<ConstraintViolation<Chasis>> violations = validator.validate(chasis);

        if(!violations.isEmpty())
            throw new ResourceValidationException(ENTITY, violations);

        return chasisRepository.save(chasis);
    }
}
