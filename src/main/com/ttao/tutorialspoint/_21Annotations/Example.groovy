package main.com.ttao.tutorialspoint._21Annotations

/*
 - https://www.tutorialspoint.com/groovy/groovy_annotations.htm
 */

@interface OnlyIf {
    Class value()
}

@OnlyIf({ number<=6 })
void Version6() {
    result << 'Number greater than 6'
}

@OnlyIf({ number>=6 })
void Version7() {
    result << 'Number greater than 6'
}