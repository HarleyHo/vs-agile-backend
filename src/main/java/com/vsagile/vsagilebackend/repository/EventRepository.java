package com.vsagile.vsagilebackend.repository;

import com.vsagile.vsagilebackend.pojo.po.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event,Integer> {
}
