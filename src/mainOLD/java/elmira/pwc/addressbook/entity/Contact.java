package elmira.pwc.addressbook.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "contact")
public class Contact {

    // *** define fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "full_name")
    private  String fullName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToMany(targetEntity = AddressBook.class, cascade = {CascadeType.ALL})
    @JoinTable(name = "address_book_contact",
            joinColumns = {@JoinColumn(nullable = false, name = "address_book_id")},
            inverseJoinColumns = {@JoinColumn(name = "contact_id")}
            )
    private List<AddressBook> addressBooks;

    // ***  define constructors

    public Contact() {

    }

    public Contact(int id, String fullName, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    // *** Setters and Getters

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<AddressBook> getAddressBooks() {
        return addressBooks;
    }

    public void setAddressBooks(List<AddressBook> addressBooks) {
        this.addressBooks = addressBooks;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
