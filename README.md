# JDBC-
using MYSQL shell, i created the database names "birds" and then i used the command " use birds" so that I can begin to work on this database.
the next step was to create a table with different parameters( in my case it was the id and the name)
if we type " desc bird" we are going to have the following table that writes a description of what we have till now(printscreen number 1)
then,we insert values that match the available fields, for instance ,I added the id 1 for the name zeina, etc.. so we can have this(printscreen number 2)
we conclude that our table is ready.
next step was to go to cmd, where i want to test if my JDBC is working and if the driver can do its job, since i am working on cmd and not on eclipse, IntelliJ,...whenever i want to access the java code, i have to write the name of the jar file so that it can be used when connecting the code with MYSQL.
we can finally conclude that thanks to our JDBC, we are accessing the database from our java code!

C:\Users\Zeina\Desktop>java -cp mysql-connector-j-8.0.32.jar TestJDBC.java
id :1 nom zeina
id :2 nom wael
id :3 nom joey
id :3 nom charbel


you can check the printscreens for more association with the explanation !!
