package main.com.ttao.tutorialspoint._09Numbers

class _20Random {
    static void main(String[] args) {
        int a =0
        int b =0

        def random = new Random()
        def reds = []

        while(reds.size() <6){
            a = random.nextInt(33)+1
            if(! reds.contains(a)) reds.add(a)
        }
        println "红球: ${reds.sort()}"

        b = random.nextInt(16)+1 // nextInt(int n)  返回一个“[0, n) 之间的int类型”的随机数。
        println "蓝球: ${b}"
    }
}
