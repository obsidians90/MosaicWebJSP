
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	