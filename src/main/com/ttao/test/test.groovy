package main.com.ttao.test
control_data = ['a','b','c','d','e']
def numToRun = (int) ((control_data.size() + 1)/2)
for (int i = 0; i < numToRun; i++) {
    job_data = control_data[i]
    println(job_data)
}