package core.dao;


import core.domain.Contact;

import java.util.List;

public interface ContactDao {
    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}
