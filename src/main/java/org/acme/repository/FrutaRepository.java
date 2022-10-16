package org.acme.repository;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;

import org.acme.models.Fruta;
import org.springframework.data.jpa.repository.JpaRepository;

@ApplicationScoped
public interface FrutaRepository  extends JpaRepository<Fruta,UUID>{
    
 
}
