1. Spring Starter Project 생성

   - Name : MosaicWeb
   - Type : Gradle(Buildship)
   - Packaging : war
   - Group : com.hybrid
   - Artifact : MosaicWeb
   - Package : com.hybrid
   - Dependencies 선택 : Web - Web
2. 형상관리

   - Remote Repository 생성 (github)
   - Local Repository 생성
   
      >> git status
      >> git log   	
      >> dir /A > .gitignore
      >> notepad .gitignore 편집
      >> git init
      >> git add *
      >> git commit -m "first commit" 
   - Local ====push===> Remote (최초 동기화)
   
      >> git remove -v
      >> git remote remove origin
      >> git remote add origin https://github.com/obsidians90/MosaicWeb.git
      >> git push -u origin master git push -u origin master
