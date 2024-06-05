package com.Spring.SpringBootMysql.Service.ServiceImpl;

import com.Spring.SpringBootMysql.Service.ClientService;
import com.Spring.SpringBootMysql.model.Client;
import com.Spring.SpringBootMysql.repository.ClientRepo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class ClientServiceImpl implements ClientService {
    
    
    @Autowired
    private ClientRepo clientRepo;

    //GET LIST OF USERS
    @Override
    public Iterable<Client> getAllClient() {
       return clientRepo.findAll();
    }

    //POST A USER
    @Override
    public Client createdClient(Client client) {
        return clientRepo.save(client);
    }

    //EDIT USERS
    @Override
    public void updateClient(Long id, Client updateClient) {
        Optional <Client> clientToUpdateOptional = clientRepo.findById(id);

        if (clientToUpdateOptional.isPresent()) {
            Client clientToUpdate = clientToUpdateOptional.get();
            clientToUpdate.setUserName(updateClient.getUserName());
            clientToUpdate.setEmail(updateClient.getEmail());
            clientToUpdate.setPassword(updateClient.getPassword());
            clientToUpdate.setPhoneNo(updateClient.getPhoneNo());
            clientRepo.save(clientToUpdate);
        }
    }

    //DELETE USER
    @Override
    public void deleteClient(Long id) {
        Optional<Client> clientToDeleteOptional = clientRepo.findById(id);

        if (clientToDeleteOptional.isPresent()) {
            Client clientToDelete = clientToDeleteOptional.get();
            clientRepo.delete(clientToDelete);
        }
    }
    
    
}
