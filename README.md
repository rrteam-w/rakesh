# SpringBootJWT
To run the SpringBootJWT application in your local machine, use the below url to generate the token
http://localhost:9091/authenticate

#POST call data
username: admin 
password: password

Once token is generated, pass the Authorization with token in request header and hit the below url to access the webservice, otherwise you will get unauthorized error as output.
http://localhost:9091/pncbank/greeting

# SpringBootJPA
In this application, covered the CRUD operations with database access.
h2 database dependency added in the pom.xml file, in-order to persist objects into databse.
Written data.sql file with default insert statements, so that while application start up those will be persist into database.

#In order to access the database in your local machine. Use the below url.
http://localhost:8089/h2-console

Click on Test Connection button and then click on connect.

Note: No need to pass the username and password to access database. By default username will be added as 'sa'. password is optional.

# SpringBootSwagger2
In this application, It provides the user interface to access our webservices via web browser.
This is the url, to see webservices in browser. http://localhost:8080/swagger-ui.html.

#Case Study#
*****Online Banking System*****

The Banking system consists of two parts: User-Front and Admin-Portal. 

User-Front is a user-facing system and it includes such modules as User Signup/Login, Account, Transfer, 
Appointment, Transaction and User Profile. 

Admin-Portal is mainly used by Admin and it involves User Account and Appointment modules.
