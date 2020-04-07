Spring Boot With JPA and Oracle Integration

	I have developed a Spring Boot Application and with this application I am able to maintain and manipulate the PNC Bank Customer Level information like Customer Account Id ,First Name , Last Name, Email Id , CardType , Balance like.

	With this application , we are able to do CRUD oprations like SAVE OR UPDATE OR DELETE OR FETCH the Customer Level Information.

Note : Use Postman tool for testing.

Built with:

	1. Spring boot 1.5.9.RELEASE
	2. Java 8
	3. MySQL-8.0.19.0 Database  
	4. mysql-connector-java-5.1.46.jar 
	5. Maven

Restful Pattern:

	POST 	   /user/adduser						Save Customer Or User Data

	![Endpint-Adduser](https://user-images.githubusercontent.com/62999102/78668909-156ee380-78f9-11ea-859e-ea90fef6c4dd.PNG)

	GET 	   /user/all							Get all Customers Or User Data 
	GET 	   /user/{accountid}					Get  Customer Or User Data
	PUT 	   /api/update/{accountid}				Update Customer Or User by accountid
	DELETE 	   /api/delete/{id}						Delete Customer Or User by accountid
	
	














