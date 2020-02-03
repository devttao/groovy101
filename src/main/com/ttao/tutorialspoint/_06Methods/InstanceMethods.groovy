package main.com.ttao.tutorialspoint._06Methods

class InstanceMethods {
    int x

    public int getX() {
        return x
    }

    public void setX(int pX) {
        x = pX
    }

    static void main(String[] args) {
        InstanceMethods ex = new InstanceMethods()
        ex.setX(1000)
        println(ex.getX())
    }
}
