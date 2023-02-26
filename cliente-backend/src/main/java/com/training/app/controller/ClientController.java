/*
 * Copyright (c) 2023.
 * @Author: Yorsh
 * @Social: www.linkedin.com/in/jorge-pr
 */
package com.training.app.controller;


import com.training.app.entity.Client;
import com.training.app.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
@CacheConfig(cacheNames = "cache-cliente")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public Client save(@RequestBody Client client) {
        return clientService.save(client);
    }

    @Cacheable
    @GetMapping
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @Cacheable
    @GetMapping("{id}")
    public Client findById(@PathVariable Integer id) {
        return clientService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletedById(@PathVariable(name = "id") Integer id) {
        clientService.delete(id);
    }
}
