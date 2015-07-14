# StartJAVA

* Key: Write once, run anywhere

* Environment: Ubuntu 14.04

* IDE: IntelliJ IDEA
	* IDEA is a smart Java IDE produced by JetBrains, a Czech Company.
	* It is similar to eclipse but more intelligent.
	* /src: source files .java
	* /out: complied files .class

<!--![](http://www.kankanews.com/ICkengine/wp-content/plugins/wp-o-matic/cache/9dd64871e1_140601104983641.jpg)-->
![](http://www.kankanews.com/ICkengine/wp-content/plugins/wp-o-matic/cache/ae42393cec_141105213014401.png)
***
* Ant: Also use ant to build the project
	* check the Ant/build.xml to understand the build process of ant
	* /build: .class
	* /dist: .jar

***
* JUnit: IDEA holds the JUnit-4.11 automatically,it's very easy to use.

***
* SonarQube: Just configure it as wiki. codes like that:
<pre>
    #required metadata
    #projectkey 项目的唯一标识，不能重复
    sonar.projectKey=src
    sonar.projectName=src
    sonar.projectVersion=1.0
    sonar.sourceEncoding=UTF-8
    sonar.modules=java-module
    #java-module
    java-module.sonar.projectName=Java module
    java-module.sonar.language=java
    #.表示prjectBaseDir指定的目录
    java-module.sonar.sources=.
    java-module.sonar.projectBaseDir=src
</pre>

***
