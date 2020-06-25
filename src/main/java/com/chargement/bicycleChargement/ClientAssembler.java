package com.chargement.bicycleChargement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
/*
public class ClientAssembler extends RepresentationModelAssembler<Client,EntityModel<Client>> {

    @Override
    public EntityModel<Client> toModel(Client client){

        return EntityModel.of(client,linkTo(methodOn(ClientController.class).one))
    }


}
*/