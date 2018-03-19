package dataintegrity

import neo4jSample.core.Club
import neo4jSample.core.PrivateClub

class ApplicationController {

    def index() {

        Club club1 = Club.findByName('Boca Jrs')
        Club club2 = Club.findByName('River') // here I have the DataIntegrityViolationException

        [club1: club1, club2: club2]
    }

    def indexOK() {

        Club club1 = Club.findByName('Boca Jrs')
        Club club2 = PrivateClub.findByName('River') // here is OK

        render view:'index', model: [club1: club1, club2: club2]
    }
}
