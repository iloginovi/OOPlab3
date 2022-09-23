fun main() {
    val service = Service()
    var person = Person("Ivan", "Ivanov")
    service.addContact(person, Phone("900", PhoneType.HOME))
    service.addContact(person, Phone("9000", PhoneType.MOBILE))
    person = Person("Alexandr", "Smirnov")
    service.addContact(person, Phone("9067", PhoneType.WORK))
    println(service.getAllPersons())
    println("Phone numbers 1:")
    println(service.getPersonPhones(service.findPersons("Alexandr", "Smirnov")[0]))
    println("Phone numbers 2:")
    println(service.getPersonPhones(service.findPersons("Ivan", "Ivanov")[0]))
}