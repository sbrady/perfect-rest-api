package perfect.rest.api

import grails.rest.RestfulController

class UsersController extends RestfulController<User> {
    static responseFormats = ['hal', 'json', 'xml']
    UsersController() {
        super(User)
    }

    def create() {
        respond new User()
    }


    def index() {
        respond User.findAll()
    }

    def show() {
        def user = User.get(params.id)

        println "SHOWING ${user}"

        user.link(rel:'new', href: "http://google.com", type: 'application/json')

        respond(user)
    }


}
