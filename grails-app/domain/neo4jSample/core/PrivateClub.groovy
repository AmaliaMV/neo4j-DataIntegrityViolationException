package neo4jSample.core

class PrivateClub extends Club {

    President president

    static constraints = {
        president nullable: true
    }
}
