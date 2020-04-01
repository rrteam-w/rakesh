SpringBootJWT project
=====================
To run the application in your local machine, hit the below url to generate the token
http://localhost:9091/authenticate

POST details:
-------------
username: admin
password: password

Once token is generated then only hit the below url, otherwise you will get unauthorized error
http://localhost:9091/pncbank/greeting
