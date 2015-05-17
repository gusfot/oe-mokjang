1. 용어 정의 
 - Mokjang : 목장 
 - User : 목장원, 목자, 교구장 등 개인 구성원
 
 2. 사용자ID(userId) 는 이름으로 정한다. (기존 디모데 정책과 같음)
 동명이인일 경우 이름뒤에 a, b, c 등 알파벳 순서도 붙인다.
 예) 홍길동, 홍길동a, 홍길동b...
 
 3 tomcat JNDI 설정
  1) server.xml 설정
    - <GlobalNamingResources></GlobalNamingResources> 안에
  	<Resource auth="Container" driverClassName="com.mysql.jdbc.Driver" factory="org.apache.tomcat.jdbc.pool.DataSourceFactory" maxActive="8" maxIdle="4" name="jdbc/OeReportDB" password="!inpion00" type="javax.sql.DataSource" url="jdbc:mysql://52ch.kr:3307/mokjang?autoReconnect=true" username="mokjang"/>
  
  2)context.xml 설정
  	- <context></context> 안에
  	<ResourceLink global="jdbc/OeReportDB" name="jdbc/OeReportDB" type="javax.sql.DataSource" />	