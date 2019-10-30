package com.netcracker.musicband.repository;

import com.netcracker.musicband.domain.Track;
import org.springframework.data.repository.CrudRepository;

public interface TrackRepository extends CrudRepository<Track, Long> {
}
