class UrlMappings {

	static mappings = {

//        "/users"(version:'1.0', resources:"user", namespace:'v1')
//        "/users/index"(controller: "users", action:'index')
//        "/users/show/$id?"(controller: "users", action:'show')

        // RESTful list mapping
        name restEntityList: "/$controller"(parseRequest: true) {
            action = [GET: "index", POST: "save"]
        }

        // RESTful entity mapping
        name restEntity: "/$controller/$id"(parseRequest: true) {
            action = [GET: "show", PUT: "update", POST: "update", DELETE: "delete"]
            constraints {
                id matches: /\d+/
            }
        }
        name restEntity: "/$controller/new"(parseRequest: true) {
            action = [GET: "create"]
        }


        "/"(view:"/index")
        "500"(view:'/error')
	}
}
