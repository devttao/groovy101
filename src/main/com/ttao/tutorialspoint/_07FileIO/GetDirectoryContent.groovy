package main.com.ttao.tutorialspoint._07FileIO

class GetDirectoryContent {
    static void main(String[] args) {

        // 显示计算机上的驱动器, 根目录
        def rootFiles = new File("/Users/kutao/tmp/Example.txt").listRoots()
        rootFiles.each {
            file -> println file.absolutePath
        }

        // 列出特定目录中的文件
        new File("/Users/kutao/tmp").eachFile() {
            file -> println file.getAbsolutePath()
        }

        // 打印子目录的所有文件 --> 递归显示目录及其子目录中的所有文件
        new File("/Users/kutao/tmp").eachFileRecurse() {
            file -> println file.getAbsolutePath()
        }
    }
}
