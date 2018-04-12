package neo4jSample.core

class Player extends BaseGraphDomain {

    String name

    static belongsTo = [Club]

    static constraints = {
    }
}
