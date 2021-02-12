package com.example.webcontent.app;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AddressBookRepository extends CrudRepository<AddressBook, Long> {

    List<AddressBook> findAll();

    AddressBook findById(long id);

}
