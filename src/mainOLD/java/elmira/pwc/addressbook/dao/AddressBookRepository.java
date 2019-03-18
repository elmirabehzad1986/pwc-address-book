package elmira.pwc.addressbook.dao;

import elmira.pwc.addressbook.entity.AddressBook;
import elmira.pwc.addressbook.entity.Contact;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface AddressBookRepository extends PagingAndSortingRepository<AddressBook,Integer> {

//    @Query(value = "SELECT ab.contacts FROM AddressBook ab GROUP BY ab.contacts HAVING COUNT(ab.contacts) == 1 ")
//    List<Contact> findUniqueContacts();

    @Query("SELECT a.name from AddressBook a GROUP BY a.name")
    public List<Contact> findUniqueContacts();

}
