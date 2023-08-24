package com.github.eferreira.interviewTest

import com.github.eferreira.interviewTest.util.datestringIsValid
import com.github.eferreira.interviewTest.util.emailIsValid

class AddContact(private val name: String?,
                 private val document: String?,
                 private val birthday: String?,
                 private val email: String?) {

    private fun validateInfo(): Boolean {
        if (name.isNullOrEmpty() || document.isNullOrEmpty() || birthday.isNullOrEmpty() ||
                email.isNullOrEmpty()) {
            return false
        }
        if (!datestringIsValid(birthday)) {
            return false
        }
        if (!emailIsValid(email)) {
            return false
        }
        return true
    }

    fun addContact(name: String, document: String, birthday: String, email: String) {
        if (!validateInfo()) return
        //TODO perform saving the contact
    }
    
    //.....
}


class EditContact(private val id: String,
                  private val name: String?,
                  private val document: String?,
                  private val birthday: String?,
                  private val email: String?) {

    private fun validateInfo(): Boolean {
        if (name.isNullOrEmpty() || document.isNullOrEmpty() || birthday.isNullOrEmpty() ||
            email.isNullOrEmpty()) {
            return false
        }
        if (!datestringIsValid(birthday)) {
            return false
        }
        if (!emailIsValid(email)) {
            return false
        }
        return true
    }

    fun editContact(id: String, name: String, document: String, birthday: String, email: String) {
        if (!validateInfo()) return
        //TODO search contact, edit and save
    }


    //.....
}