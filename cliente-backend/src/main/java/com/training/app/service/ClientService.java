package com.training.app.service;

import com.training.app.entity.Client;

import java.util.List;

public interface ClientService {

    Client save(Client client);
    List<Client> findAll();

    Client findById(Integer id);
    void delete(Integer id);

}
