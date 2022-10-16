package org.acme.controllers;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.acme.models.Fruta;
import org.acme.service.FrutaService;


@Path("/frutas")
public class FrutaController {

    @Inject
    private FrutaService frutaService;
    
    @GET
    public List<Fruta> getAll(){
        return frutaService.listaFrutas();
    }
    @POST
    public Fruta save(Fruta fruta){
        return frutaService.saveFrutas(fruta);
    }
  
}
