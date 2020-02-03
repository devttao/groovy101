package main.com.ttao.tutorialspoint._14DatesTimes

class _03compareTo {
    static void main(String[] args) {
        Date olddate = new Date("05/11/2015");
        Date newdate = new Date("05/11/2015");
        Date latestdate = new Date();

        System.out.println(olddate.compareTo(newdate));
        System.out.println(latestdate.compareTo(newdate));
        System.out.println(olddate.compareTo(latestdate));
    }
}


// Return Value
// − The value 0 if the argument Date is equal to this Date;
// a value less than 0 if this Date is before the Date argument;
// and a value greater than 0 if this Date is after the Date argument.