package com.training.repository;

import com.training.entity.Import;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImportRepository extends JpaRepository<Import,Long>, CrudRepository<Import, Long> {
}
