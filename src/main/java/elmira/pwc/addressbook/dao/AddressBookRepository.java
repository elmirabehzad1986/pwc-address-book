package elmira.pwc.addressbook.dao;

import elmira.pwc.addressbook.entity.AddressBook;
import elmira.pwc.addressbook.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface AddressBookRepository extends JpaRepository<AddressBook,Integer> {

}
