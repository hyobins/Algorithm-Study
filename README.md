# commit 하는 법
우선 github에서 저장소 생성!   

이후 로컬에서 push하고싶은 파일이 있는 폴더로 이동해준 뒤
<pre><code> git init </code></pre>

git add: 해당 폴더 안의 모든 파일을 올릴때/ 특정 파일만 올릴때
<pre><code> git add . </code></pre>
<pre><code> git add 1234.java </code></pre>

git commit: 원격 저장소가 아닌 로컬에만 저장되는것
<pre><code> git commit -m "커밋 메세지 입력하기" </code></pre>

git remote: Repository Setting. 깃허브 저장소 주소 받아오기
<pre><code> git remote add origin https://github.com/hyobins/Algorithm-Study.git </code></pre>

git push: 마지막으로 푸시해주기
<pre><code> git push -u origin master</code></pre>


[Markdown 기본문법 참고] https://gist.github.com/ihoneymon/652be052a0727ad59601
