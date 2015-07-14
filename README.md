# StartJAVA

* Write once, run anywhere

* Environment: Ubuntu 14.04

* IDE: IntelliJ IDEA
	* IDEA is a smart Java IDE produced by JetBrains, a Czech Company.
	* It is similar to eclipse but more intelligent.
	* /src: source files .java
	* /out: complied files .class

<!--![](http://www.kankanews.com/ICkengine/wp-content/plugins/wp-o-matic/cache/9dd64871e1_140601104983641.jpg)-->
> ![](http://www.kankanews.com/ICkengine/wp-content/plugins/wp-o-matic/cache/ae42393cec_141105213014401.png)

* Ant: Also use ant to build the project
	* /build: .class
	* /dist: .jar
<pre>
<?xml version="1.0"?>
<project default="jar" name="Project Name" basedir=".">
	<description>Java project Complie/Run</description>

	<property name="srcDir" location="src"/>
	<property name="buildDir" location="build"/>
	<property name="distDir" location="dist"/>

	<target name="init" depends="clean">
		<tstamp/>
		<mkdir dir="${buildDir}"/>
		<mkdir dir="${distDir}"/>
	</target>

	<target name="compile" depends="init">
		<javac srcdir="${srcDir}" destdir="${buildDir}"/>
	</target>

	<target name="jar" depends="compile">
		<jar destfile="${distDir}/package.jar" basedir="${buildDir}">
			<manifest>
				<attribute name="Built-By" value="${user.name}"/>
				<attribute name="Main-Class" value="com.company.Main"/>
			</manifest>
		</jar>
		<jar destfile="${distDir}/package-src-${DSTAMP}.jar" basedir="${srcDir}"/>
	</target>

	<target name="run" depends="">
		<java jar="${distDir}/package.jar" fork="true"/>
	</target>

	<target name="clean">
		<delete dir="${buildDir}"/>
		<delete dir="${distDir}"/>
	</target>

</project>
</pr
