package main.com.ttao.tutorialspoint._14DatesTimes

class _02equals {
    static void main(String[] args) {
        Date olddate = new Date("05/11/2015");
        Date newdate = new Date("05/11/2015");
        Date latestdate = new Date();

        System.out.println(olddate.equals(newdate));
        System.out.println(latestdate.equals(newdate));
    }
}
