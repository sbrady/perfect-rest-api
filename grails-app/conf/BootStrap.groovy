import perfect.rest.api.User

class BootStrap {

    def init = { servletContext ->
        User user = new User(username: "admin@example.com", password: "test123")
        user.save()
    }
    def destroy = {
    }
}
