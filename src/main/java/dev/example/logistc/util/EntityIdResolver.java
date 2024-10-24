package dev.example.logistc.util;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.PagedModel;
import org.springframework.data.web.config.EnableSpringDataWebSupport;


@Configuration
@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)
public class EntityIdResolver implements ObjectIdResolver {

    private final EntityManager entityManager;

    @Autowired
    public EntityIdResolver(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void bindItem(ObjectIdGenerator.IdKey idKey, Object o) {

    }

    @Override
    public Object resolveId(ObjectIdGenerator.IdKey id) {
        return entityManager.find(id.scope, Long.parseLong(id.key.toString()));
    }

    @Override
    public ObjectIdResolver newForDeserialization(Object o) {
        return this;
    }

    @Override
    public boolean canUseFor(ObjectIdResolver objectIdResolver) {
        return false;
    }
}
