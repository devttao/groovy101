package main.com.ttao.tutorialspoint._20Closures_2

def baseDir = new File('interfaces')
baseDir.mkdir()


('a'..'e').each {
    def file = new File(baseDir, "${it}.txt")
    file << 'sample'
}


def filter = { it.path ==~ /.*\.txt$/ } as FileFilter
assert baseDir.listFiles(filter).size() == 5