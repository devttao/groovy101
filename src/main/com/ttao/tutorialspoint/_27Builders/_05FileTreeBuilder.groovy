package main.com.ttao.tutorialspoint._27Builders

tmpDir = File.createTempDir()
def fileTreeBuilder = new FileTreeBuilder(tmpDir)

fileTreeBuilder.dir('main') {
    dir('resources') {
        dir('Tutorial') {
            file('Sample.txt', 'println "Hello World"')
        }
    }
}