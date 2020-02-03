package main.com.ttao.tutorialspoint._22XML

class _03XMLParsing {
    static void main(String[] args) {

        def parser = new XmlParser()
        def doc = parser.parse("src/main/resources/Movies.xml");

        doc.movie.each{
            bk->
                print("Movie Name:")
                println "${bk['@title']}"

                print("Movie Type:")
                println "${bk.type[0].text()}"

                print("Movie Format:")
                println "${bk.format[0].text()}"

                print("Movie year:")
                println "${bk.year[0].text()}"

                print("Movie rating:")
                println "${bk.rating[0].text()}"

                print("Movie stars:")
                println "${bk.stars[0].text()}"

                print("Movie description:")
                println "${bk.description[0].text()}"
                println("*******************************")
        }
    }
}
