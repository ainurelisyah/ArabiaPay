package com.Spring.SpringBootMysql.controller;

import com.Spring.SpringBootMysql.Service.ClientService;
import com.Spring.SpringBootMysql.model.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
@Controller
public class ClientController {

   
    @Autowired
    ClientService clientService;

    //GET ALL USERS
    @GetMapping("/clientlist")
    public Iterable<Client> getAllClient() {
        return clientService.getAllClient();
    }

    //POST NEW USER
    @PostMapping("/registerclient")
    public Client createdClient(@RequestBody Client client) {

        if (client == null) throw new NullPointerException();
        return clientService.createdClient(client);
    }

    //EDIT USER
    @PutMapping("/editclient/{id}")
    public void updateClient(@PathVariable Long id, @RequestBody Client updateClient) {

        if (updateClient == null) throw new NullPointerException();
        clientService.updateClient(id, updateClient);
    }
    
    //DELETE
     @DeleteMapping("/deleteclient")
     public void deleteClient(@RequestParam Long id) {
         clientService.deleteClient(id);
     }

    
}
