package net.schastny.contactmanager.service.impl;

import net.schastny.contactmanager.model.Contact;
import net.schastny.contactmanager.repository.ContactRepository;
import net.schastny.contactmanager.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    private ContactRepository contactRepository;

    @Autowired
    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }


    @Override
    public Contact addContact(Contact contact){
        return contactRepository.save(contact);
    }

    @Override
    public List<Contact> getContacts(){
        return contactRepository.findAll();
    }

    @Override
    public void deleteContact(Integer id){
        contactRepository.deleteById(id);
    }
}
