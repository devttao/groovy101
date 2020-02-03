package main.com.ttao.tutorialspoint._07FileIO

class DeleteFile {
    static void main(String[] args) {
        def file = new File('/Users/kutao/tmp/Example.txt')
        file.delete()
    }
}
