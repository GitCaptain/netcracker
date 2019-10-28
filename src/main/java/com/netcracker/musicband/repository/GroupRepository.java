package com.netcracker.musicband.repository;

import com.netcracker.musicband.domain.MusicBand;
import org.springframework.data.repository.CrudRepository;

public interface GroupRepository extends CrudRepository<MusicBand, Long> {
}
