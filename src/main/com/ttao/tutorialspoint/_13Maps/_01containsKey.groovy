package main.com.ttao.tutorialspoint._13Maps

class _01containsKey {
    static void main(String[] args) {
        def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]
        println(mp.containsKey("TopicName"));
        println(mp.containsKey("Topic"));
    }
}
