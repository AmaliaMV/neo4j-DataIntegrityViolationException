package dataintegrity

import neo4jSample.core.Club
import neo4jSample.core.Person
import neo4jSample.core.PrivateClub

class BootStrap {

    def init = { servletContext ->

        Club.withNewSession {
            Club.withNewTransaction {
                Club club = Club.findByName('Boca Jrs')

                if (!club) {
                    club = new PrivateClub(name: 'Boca Jrs')
                    club.person = new Person(name: 'Canelo').save()
                    club.save()
                }

                club = Club.findByName('River')

                if (!club) {
                    club = new PrivateClub(name: 'River')
                    club.save()
                }
            }
        }


    }
    def destroy = {
    }
}
