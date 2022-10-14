# NYU_BDAD_Labs_2022Spring
Labs of Big Data Application Development in NYU.


密码：bdad
ssh-keygen -R peel.hpc.nyu.edu

spark-shell --deploy-mode client --driver-java-options=-Dscala.color



上传文件
hadoop fs -put /scratch/xm2074/devicestatus.txt loudacre/devstatus
hadoop fs -ls loudacre/devstatus

从hadoop上下载文件
hadoop fs -get /user/hadoop/file localfile
hadoop fs -get loudacre/output_lab3.txt /scratch/xm2074
scp -r xm2074@dtn.hpc.nyu.edu:/home/xm2074/localfile/output_lab3.txt /Users/xiao/Desktop/A_bdad/lab/lab3
(-r是传输文件夹)

从本地往hadoop上传文件
链接vpn
scp /Users/shereen/Desktop/rbda_lab2/src/com/company/MaxTemperatureReducer.java xl3781@dtn.hpc.nyu.edu:/scratch/xl3781/


scp -p /Users/xiao/Desktop/A_bdad/lab/2014-03-15.log xm2074@dtn.hpc.nyu.edu:/scratch/xm2074/loudacre/weblog

hadoop fs -rm -r


1. create rdd
1) val rdd = sc.parallelize(List(1,2,3,4))
2) val myData = sc.textFile("purplecow.txt")


