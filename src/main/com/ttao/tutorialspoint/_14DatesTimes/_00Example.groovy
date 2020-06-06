package main.com.ttao.tutorialspoint._14DatesTimes

class _00Example {
    static void main(String[] args) {
        Date date = new Date();

        // display time and date using toString()
        System.out.println(date.toString());
        def formattedDate = date.format("yyy-dd-MM_HHmmss")
        println(formattedDate)

        Date date2 = new Date(100);

        // display time and date using toString()
        System.out.println(date2.toString());
    }
}
