package neo4jSample.core

class Club extends BaseGraphDomain {

    String name

    static constraints = {
        name nullable: false, blank: false, unique: true
    }
}
