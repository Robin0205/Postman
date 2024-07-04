package day1;

public class ecommerce {
	
	
	 /* ----------------------------E-COMMERCE(OPEN CART APPLICATION) APPLICATION APIS-------------------------
	 * Each and every ECOMMERCE APPLICATION HAS 2 parts fronted and backend , in the frontend as a user we can register an account
	 * signup,search for product,move product to cart,buyand etc..this are some common activities we can do,
	 * 
	 *  IN ADMINISTRATION part admin can see the orders,no of products available etc...
	 *  There are so many APIS for both frontend and backend applications, for  every activity we do particular APIS are triggered.
	 *  we cannot access any API from the fronted application so dat just login to admin application u can seelct system---users--APIS
	 *  we have to create APIUSER to access the APIS to do so download the complete application  
	 * 

	 *  Application has  frontend and backend operation(cust infor,order details,lot of administartion info is avaiable in this)
	 *  insatll application(open cart) in local system.
	 *  After downloadong the administration part complete the installation process and u will see the X hamp control panel
	 *  u can search xhamp control panel in search box in windows
	 *  only 2 components are required for this application they are A pache and my sql.
	 *  
	 *  
	 *  step by step open cart application
	 *  ------------------------------------
	 * 1. Go to donwload section ,we have to remove extentiosn after downloading the admistration application copy this file 
	 *  and paste it in the c driver in xhamp (htdocs).
	 *  while copying this file u have to remove the version num and only copy the file name.
	 *  
	 *  2.Rename files
	 *  go to c:\xamp\htdocs\opencart\\upload
	 *  Rename file 'config.dist.php' to "config.php'
	 *  
	 *  Go to c:\xampp\htdocs\opencart\ upload\admin
	 *  Rename file 'config.dist.php' to 'cong.php'
	 *  
	 *  4.Connect to the database and create DB
	 *  DB access URL : http://localhost/phpmyadmin/
	 *  
	 *  create new database 'openshop' (refer the screenshot below to create new database in MYSQL)
	 *  
	 *  
	 *  U must run up  xamp server
	 *  --open xampp and cretae the database (opencart)
	 *  
	 *  to set up connection between the application and sql database provide the details of sql satabase
	 *  They do not provide the opencart application Api ACCESS
	 *  After installing the administration in local system we can see API access option in  the administration application.
	 *  
	 *  
	 *  
	 *  For creating the API user enter API u can see the api key with that u can see API KEY by that we can access all the API'S.
	 *  Add the local address in the ip adress,by doing the conifg-ip in commnad prompt save that num in ip adress tab in application.
	 *  
	 *  
	 *  for documentation u can search
	 *  --------------------------------
	 *  open cart documentation in browser
	 * 
	 *  To create APIS in application we have to create API user first with that we can access all the APIS
	 *  username and API key is required to create the new api 
	 *  
	 * 
	 * To create token or session we have to use username which is given in administration and api key  with this token is created
	 * with the help of that TOKEN or session we can access all the APIS. of the application.
	 * 
	 * By usernmae and key will return the Token/session with that we can do  authenticaton for multiple apis tetsing, they are
	 * 1.Add product to cart  2.get cart content 3.edit cart content 4. delete cart content.
	 * 
	 * 
	 * open postman
	 * -------------
	 * there is a section called form data in body there we have to add username and key and dont need any autherizaton it will cretae token that tooken 
	 * is used as a authentcaton for remaining all APIS.
	 * 
	 * 
	 * How many ways we can run collection.
	 * ------------------------------------
	 * we can run collecton locally (command prompt)
	 * To generate report or run collection we need newman component 
	 * pre-requisite---nodejs+npm
	 * 
	 * Below mentioned are 2 components that has to be downloaded to run collection and generate html report
	 * newman
	 * newman-report-html.
	 * 
	 * command to install newman
	 * -----------------------------
	 * npm install -g newman
	 * npm install -g newman-report-html.
	 * 
	 * To run collection file in command prompt export the collection file from postman and save it in local system.
	 * 
	 * Approach 1)run collection in commnad prompt
	 * -------------------------------------------
	 * This is the command has to be enter in commnad prompt to run collction 
	 * newman run "name of the file".
	 * 
	 *  To get result in html report we should install 
	 *  npm -g newman-report-html.
	 *   
	 * This is the command that has to be executed in command prompt to generate html report
	 * newman run opencart_RestAPI_cartmodulepostmna_collection r-html.
	 * 
	 * it will generate the report in the same location.
	 * 
	 * 
	 * Apprach 2) Run the collection remotly using URL
	 * -----------------------------------------------
	 * we have to create a URL for the collection.
	 * click on share button in collection options in postman or select via json it will create a link u can share this URL to anyone
	 * by that they can run this collection.
	 * we have to use the same command to run this collection.
	 * 
	 * 
	 * Approach 3) Run collection through JENNKINS
	 * --------------------------------------------
	 *  
	 * whenever u need to run jenkins run jarfile in command which is mentioned below
	 * java -jar jenkins.war------------ this is the command u have to enter in command prompt
	 * 
	 * open jenkins in browser by locaalhost:/8080/admin
	 * Enter project name in jenkins they open project name and goto build section and give the command in that section
	 * newman run "location of file".
	 * now run the file by clicking on the build now u can see the execution details.
	 * u can use the html command to generate html in jenkins.
	 * 
	 *  
	 *  Approach 4)Run the collection through GITHUB
	 *  ---------------------------------------------
	 *  open github--------create new repository (give project name)
	 *  
	 *  CREATE local repository
	 *  ------------------------
	 *  Go to location of file 
	 *  right click--git command prompt
	 *  gitin--------it will create local repository
	 *  
	 * 1.Create local repo:
	 * git init
	 * 
	 * 2.connected local repo with remote repo:
	 * git remote add origin ("enter the gihub project url)
	 * 
	 * 3.add file to index/stageing area
	 * git add filename
	 * 
	 * 4.git commit-m 'comment' filname.
	 * 
	 * 5.git push origin master
	 * 
	 * 
	 * we can run the github url through jenkins also by creating the project in source code managment n select build
	 * then select command then povide the command in this box we shoulg  specify url along with commnad
	 * newman run 
	 * 
	 */

}
