package com.upc.pc2.domain.persistence;

import com.upc.pc2.domain.model.entity.Chasis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChasisRepository extends JpaRepository<Chasis, Long> {

}
