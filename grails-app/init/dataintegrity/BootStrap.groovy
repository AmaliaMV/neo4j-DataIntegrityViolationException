package dataintegrity

import neo4jSample.core.Club
import neo4jSample.core.Player
import neo4jSample.core.President
import neo4jSample.core.PrivateClub

class BootStrap {

    def init = { servletContext ->

        Club.withNewSession {
            Club.withNewTransaction {

                Club club = Club.findByName('Boca Jrs')

                if (!club) {
                    club = new PrivateClub(name: 'Boca Jrs')
                    club.president = new President(name: 'Canelo').save()
                    club.save()
                }

                club = Club.findByName('River')

                if (!club) {
                    club = new PrivateClub(name: 'River')
                    club.addToPlayers(new Player(name: 'Tomy'))
                    club.save()
                }
            }
        }


    }
    def destroy = {
    }
}
