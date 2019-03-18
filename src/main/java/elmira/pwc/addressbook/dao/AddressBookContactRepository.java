package elmira.pwc.addressbook.dao;

import elmira.pwc.addressbook.entity.AddressBookContact;
import elmira.pwc.addressbook.entity.AddressBookContactKey;
import elmira.pwc.addressbook.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressBookContactRepository extends JpaRepository<AddressBookContact, AddressBookContactKey> {

    @Query("SELECT c from Contact c WHERE c.id IN (SELECT ac.contact.id FROM AddressBookContact ac GROUP BY ac.contact HAVING COUNT(ac.contact)=1)")
    public List<Contact> findUniqueContacts();
}
