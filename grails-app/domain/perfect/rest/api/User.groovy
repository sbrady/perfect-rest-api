package perfect.rest.api

import grails.rest.Linkable

@Linkable
class User {

    static constraints = {
    }

    String username
    String password
}
