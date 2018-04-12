package dataintegrity

import neo4jSample.core.Club
import neo4jSample.core.Player

class ApplicationController {

    def index() {

        Club club1 = Club.findByName('Boca Jrs')

        Club club2 = Club.findByName('River')
        // Method threw 'org.springframework.dao.DataIntegrityViolationException' exception. Cannot evaluate neo4jSample.core.User_$$_jvst40e_2.toString()
        // Method threw 'org.springframework.dao.DataIntegrityViolationException' exception. Cannot evaluate neo4jSample.core.User_$$_jvst40e_2.toString()
        Player player2 = club2.players[0]

        [club1: club1, club2: club2]
    }

}
