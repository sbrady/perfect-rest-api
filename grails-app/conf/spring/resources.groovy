import grails.rest.render.hal.HalJsonCollectionRenderer
import grails.rest.render.hal.HalJsonRenderer
import perfect.rest.api.User

// Place your Spring DSL code here

beans = {
    halUsersRenderer(HalJsonRenderer, User)
    halUsersCollectionRenderer(HalJsonCollectionRenderer, User)
}

