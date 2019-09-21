package net.schastny.contactmanager.service;

import net.schastny.contactmanager.model.Contact;

import java.util.List;

public interface ContactService {

    Contact addContact(Contact contact);

    List<Contact> getContacts();

    void deleteContact(Integer id);
}
