package repository

import entity.ContactEntity

class ContactRepository {

    companion object {

        private val contactList = mutableListOf<ContactEntity>()

        fun save(contact: ContactEntity) {
            contactList.add(contact)
        }

        fun delete(contact: ContactEntity) {
            // contactList.remove(contact)

            var index = 0
            for (item in contactList.withIndex()) {
                if (item.value.name == contact.name && item.value.phone == contact.phone) {
                    index = item.index
                    break
                }
            }
            contactList.removeAt(index)

        }

        fun getList(): List<ContactEntity> {
            return contactList
        }
    }
}