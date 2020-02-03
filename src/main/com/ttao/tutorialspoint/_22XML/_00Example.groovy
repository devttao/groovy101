package main.com.ttao.tutorialspoint._22XML

import groovy.xml.MarkupBuilder

class _00Example {
    static void main(String[] args) {
        def mB = new MarkupBuilder()

        // Compose the builder
        mB.collection(shelf : 'New Arrivals') {
            movie(title : 'Enemy Behind')
            type('War, Thriller')
            format('DVD')
            year('2003')
            rating('PG')
            stars(10)
            description('Talk about a US-Japan war')
        }
    }
}
