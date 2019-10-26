package com.netcracker.musicband.repository;

import com.netcracker.musicband.domain.Group;
import org.springframework.data.repository.CrudRepository;

public interface GroupRepository extends CrudRepository<Group, Long> {
}
