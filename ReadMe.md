
1. Spring Starter Project 생성

	- Name : MosaicWeb
	- Type : Gradle(Buildship)
	- Packaging : war
	- Group : com.hybrid
	- Artifact : MosaicWeb
	- Package : com.hybrid
	
	- Dependencies : web 선택

2. 형상관리
	- Remote Repository 생성(github)
	- Local Repository 생성
		- >> git status
		- >> git log
		- >> dir /A > .gitignore
		- >> notepad .gitignore 편집
		- >> git init
		- >> git add *
		- >> git commit -m "first commit"
	- Local ==> Remote push(최초 동기화)
		- >> git remote -v
		- >> git remote remove origin
		- >> git remote add origin https://github.com/obsidians90/MosaicWeb.git
		- >> git push -u origin master
	- 개발자 2가 clone 수행
		- >> git clone https://github.com/obsidians90/MosaicWeb.git
		- >> git clone https://github.com/obsidians90/MosaicWeb.git MosaicWebDev
		- >> Eclipse Gradle Import
		
3. HTML 설정
	- 설정 불필요.
	- mkdir src/main/webapp 폴더 생성
	- notepad src/main/webapp/Hello.html
	- gradle bootrun
	- http://localhost:8080/Hello.html
	
4. JSP 설정
	- mvnrepository.com >> search : tomcat jasper
	- build.gradle dependency : 
		providedRuntime group: 'org.apache.tomcat.embed', name: 'tomcat-embed-jasper', version: '8.5.4'
	- Eclipse -> Gradle Refresh
	- notepad src/main/webapp/Hello.jsp
	- gradle bootrun
	- http://localhost:8080/Hello.jsp
	
5. Servlet 설정
	- Project facets 추가
		Dynamic Web Module 3.1
		Java 1.8
		JavaScript 1.0
	- MosaicWebApplication.java << @ServletComponentScan 추가
	- com.hybrid.servlet.HelloServlet.java 생성
	- gradle bootrun
	- http://localhost:8080/HelloServlet
	
6. SpringLoaded 설정(리로드 기능)
	- mvnrepository.com >> search: springloaded
	- build.gradle 설정 :
		classpath("org.springframework:springloaded:1.2.6.RELEASE")
		compile group: 'org.springframework', name: 'springloaded', version: '1.2.6.RELEASE'
	- Eclipse Output Directory 변경
		bin -> build/classes/main

7. Mybatis 설정
	- mvnrepository.com >> search: Mybatis Spring Boot Starter
	- build.gradle dependency : 
			compile group: 'org.mybatis.spring.boot', name: 'mybatis-spring-boot-starter', version: '1.1.1'
	- Eclipse Gradle Refresh
	- gradle bootrun
	- notepad src/main/java/com/hybrid/mapper/DeptMapper.java (인터페이스)
	- notepad src/main/java/com/hybrid/domain/Dept.java (클래스)
	- notepad src/test/java/com/hybrid/mapper/DeptMapperTest.java
	- notepad src/main/webapp/Dept.jsp
	
8. Deploy 방법
	- gradle war
	- build/libs/MosaicWeb*.war
	- cp MosaicWeb.war C:\Program Files\Apache Software Foundation\Tomcat 8.5\webapps
	- http://localhost/MosaicWeb/index.html
	
9. Gluon 설정
	- cp FXTemplate/src/* MosaicWeb/src
	- merge FXTemplate/build.gradle MosaicWeb/build.gradle
	- merge com.hybrid.fx.MainApplication com.hybrid.MosaicWebApplication
		->> spring boot + gluon start
		->> spring boot + gluon stop
		->> PrimaryView에 WebView 추가
10. SiteMesh 설정
	- mvnrepository.com >> search: sitemesh
	- build.gradle dependencies 추가
	- builder.addDecoratorPath("/deco", "/WEB-INF/deco/maindeco.jsp");
11. Spring Security 설정
	- mvnrepository.com >> search: spring boot security
	- build.gradle dependencies 추가
		->> 
	
	
	
	
	
	
	
	
	