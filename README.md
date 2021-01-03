# SpringCRUD
Spring CRUD operation project 

#Technical Requirements :
1.MySQL
2.Apache Tomcat 8.5

#Table Details :
#Execute the below query before starting the project
create table testjava.UserDetails (id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    firstName varchar(255),
    email varchar(255),
    phone varchar(255),
    gender varchar(255),
    password varchar(255)
);

#Step for Deployment
1: Start Apache Tomcat 8.5.46
2: Deploy the war file in apache-tomcat-8.5.46/webapps/
3: Once deployed manually restart the tomcat service
4: Open the web browser and enter http://host:port/SpringCRUD_Project/
5: If any changes required in DataBase config, kindly change the config.properties file in SpringCRUD_Project/WEB-INF/classes/
