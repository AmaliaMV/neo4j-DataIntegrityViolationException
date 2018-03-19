package neo4jSample.core

class Club extends BaseGraphDomain {

    String name

    Person person

    static constraints = {
        name nullable: false, blank: false, unique: true
    }
}
