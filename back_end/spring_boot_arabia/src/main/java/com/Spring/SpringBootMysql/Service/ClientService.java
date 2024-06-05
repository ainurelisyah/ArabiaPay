package com.Spring.SpringBootMysql.Service;


import com.Spring.SpringBootMysql.model.Client;


public interface ClientService {

    Iterable <Client> getAllClient();

    Client createdClient(Client user);

    void updateClient(Long id, Client updateUser);
    
    void deleteClient(Long id);
}
