# Gradle
For all exercises the complete project should be your submission (excluding the .gradle, .idea, build folders). Add a single file "details.txt" alongwith submissions and add your explanation of what you did for the exercises - any docs, URLs that you referenced so others can understand. <br/>
<br/>
1) Look up java plugin documentation. Make changes in manifest to make it executable with correct class. When run using java -jar JAR_NAME_HERE the output should be text "Hello World" on the console. <br/>
2) look up idea plugin. make changes in build.gradle so that the sources of src/main/java as well as src/main/java2 are taken as sources. Ensure that when you make JAR file class files in both are added to the JAR. This will teach you how projects with non-conventional structure can be used with gradle.<br/>
3) add 2 files file1.xml and file1.txt in src/main/resources manually. make changes so that when creating jar only file1.xml is added to the jar. <br/>
4) find how to what is an uberjar. Make changes so you can use commons lang3 StringUtil in your jar. Make this uber jar executable. The output should be text but that should be using the StringUtils class of commons lang3<br/>
5) Find a maven repository and add it as a repository in your build.gradle. You can use bintray, jcenter or any other repository. The goal is to learn how to use a custom repository<br/>
6) Write a task in file "mytasks.gradle" and use it in your build.gradle. The goal is to be able to use tasks from another file in your build.gradle<br/>

Please check details.txt for details on the solutions.<br/>
