package main.com.ttao.tutorialspoint._13Maps

class _02get {
    static void main(String[] args) {
        def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]

        println(mp.get("TopicName"));

        println(mp.get("Topic"));  // --> null
    }
}
