package core.service.impl;

import core.dao.ContactDao;
import core.domain.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ContactService implements core.service.ContactService{
    @Autowired
    private ContactDao contactDao;

    @Transactional
    public void addContact(Contact contact) {
        contactDao.addContact(contact);
    }

    @Transactional
    public List<Contact> listContact() {
        return contactDao.listContact();
    }

    @Transactional
    public void removeContact(Integer id) {
        contactDao.removeContact(id);
    }
}
