package neo4jSample.core

class PrivateClub extends Club {

    Person person

    static constraints = {
        person nullable: true
    }
}
