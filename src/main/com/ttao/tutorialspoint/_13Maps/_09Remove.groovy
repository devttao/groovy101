package main.com.ttao.tutorialspoint._13Maps


class _09Remove {
    static void main(String[] args) {
        def map = [1:20, a:30, 2:42, 4:34, ba:67, 6:39, 7:49]

        def minusMap = map.minus([2:42, 4:34])
        println(minusMap)

        // 根据条件删除条目
        minusMap.removeAll{it -> it.key instanceof String}
        println(minusMap)

        // 保留所有满足条件的条目
        minusMap.retainAll{it -> it.value % 2 == 0}
        println(minusMap)

    }
}
