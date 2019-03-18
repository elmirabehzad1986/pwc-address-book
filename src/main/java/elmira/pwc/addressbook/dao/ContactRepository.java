package elmira.pwc.addressbook.dao;

import elmira.pwc.addressbook.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface ContactRepository extends JpaRepository<Contact,Integer> {


}
