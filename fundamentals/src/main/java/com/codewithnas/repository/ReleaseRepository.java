package com.codewithnas.repository;

import com.codewithnas.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}
