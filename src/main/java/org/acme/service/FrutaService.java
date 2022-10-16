package org.acme.service;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.acme.models.Fruta;
import org.acme.repository.FrutaRepository;

@Singleton
public class FrutaService {

    @Inject
    private FrutaRepository frutaRepository;

    public List<Fruta> listaFrutas(){
        return frutaRepository.findAll();
    }

    public Fruta saveFrutas(Fruta fruta){
        return frutaRepository.save(fruta);
    }

}
