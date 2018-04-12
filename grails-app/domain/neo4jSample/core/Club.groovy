package neo4jSample.core

class Club extends BaseGraphDomain {

    static hasMany = [players: Player]

    String name

    static constraints = {
        name nullable: false, blank: false, unique: true
    }
}
