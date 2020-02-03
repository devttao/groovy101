package main.com.ttao.tutorialspoint._18Generics

// 泛型
class _01GenericforCollections {
    static void main(String[] args) {
        // Creating a generic List collection
        List<String> list = new ArrayList<String>()

        list.add("First String")
        list.add("Second String")
        list.add("Third String")

        for(String str : list) {
            println(str)
        }
    }
}
