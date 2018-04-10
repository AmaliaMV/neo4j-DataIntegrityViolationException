package neo4jSample.core


abstract class BaseGraphDomain {

    static mapWith = "neo4j"

    User createBy
    User updateBy

    Date dateCreated
    Date lastUpdated

    static constraints = {
        createBy nullable: true
        updateBy nullable: true
    }
}
