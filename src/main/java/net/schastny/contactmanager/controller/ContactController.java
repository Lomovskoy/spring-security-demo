package net.schastny.contactmanager.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.schastny.contactmanager.model.Contact;
import net.schastny.contactmanager.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Api(tags = "Главный контроллер приложения")
@RequestMapping(path = "/contact/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ContactController {

    @Autowired
    private ContactService contactService;

    @ApiOperation("Получение всех контактов")
    @GetMapping
    public List<Contact> getAllContract() {
        return contactService.getContacts();
    }

    @ApiOperation("Создане контакта")
    @PostMapping
    public Contact createAllContract(@ApiParam("Объект контакта без id") @RequestBody Contact contact) {
        return contactService.addContact(contact);
    }

    @ApiOperation("Удаление контакта")
    @DeleteMapping
    public void deleteAllContract(Integer id) {
        contactService.deleteContact(id);
    }
}
