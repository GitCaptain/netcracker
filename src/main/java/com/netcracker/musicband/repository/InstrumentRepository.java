package com.netcracker.musicband.repository;

import com.netcracker.musicband.domain.Instrument;
import org.springframework.data.repository.CrudRepository;

public interface InstrumentRepository extends CrudRepository<Instrument, Long> {
}
