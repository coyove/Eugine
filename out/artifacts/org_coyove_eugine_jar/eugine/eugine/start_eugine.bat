java -verbose:gc -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:gclog.log -Xmx256m -Dfile.encoding=utf-8 -cp org.coyove.eugine.jar org.coyove.test.main http/http.eugine