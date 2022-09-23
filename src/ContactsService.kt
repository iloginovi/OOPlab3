
interface ContactsService {
    fun addContact(person: Person, contact: Contact)
    fun removeContact(person: Person, contact: Contact)
    fun removePerson(person: Person)

    fun addPhone(person: Person, phone: String, phoneType: PhoneType)
    fun addEmail(person: Person, email: String)
    fun addLink(person: Person, socialNetworkName: String, url: String)
    fun addAddress(person: Person, postcode: String, city: String, street: String, houseNumber: String)

    fun getPersonContacts(person: Person): List<Contact>
    fun getPersonPhones(person: Person): List<Phone>
    fun getPersonEmails(person: Person): List<Email>
    fun getPersonLinks(person: Person): List<LinkProfile>
    fun getPersonAddress(person: Person): List<Address>

    fun getAllPersons(): List<Person>
    fun getAllContacts(): Map<Person, List<Contact>>

    fun findPersons(subFirstName: String, subLastName: String): List<Person>

}