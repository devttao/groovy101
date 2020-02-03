package main.com.ttao.tutorialspoint._06Methods

class MethodProperties {
    int x = 100

    public int getX() {
        this.x = 200
        return x
    }

    static void main(String[] args) {
        MethodProperties ex = new MethodProperties()
        println(ex.getX())
    }
}
