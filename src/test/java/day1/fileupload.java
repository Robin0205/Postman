package day1;

public class fileupload {

	/*----------------UPLOAD FILE IN API-------------
	 * 
	 * To upload files through API we should have one jar file(file-upload-RestApI.jar) in C DRIVER (or) any where else in local system
	 * open command prompt and enter this command to run this jar API which is developed using spring boot application
	 * 
	 * java -jar file upload-RestAPI.jar +enter.
	 * 
	 * And this RestApi jar file is developed using springboot application
	 * then we need to pass the url link mentioned below in google and can upload the file (This is a GUI testing)
	 * 
	 * But to do the API testinf for file upload 
	 * open postman----in Url section mention URL mentioned below
	 * the go to body----form data----key (seelct-file) value(choose-file)
	 * if u choose text in key u  need to mention the file name in value type and response will be given in console
	 * we  can do some validation from dat response
	 * 
	 * 
	 * upload file through API URL http://localhost 8080/uploadfile ---to upload single file
	 * upload file through API URL http://localhost 8080/uploadmultiplefile ---to upload multiple file
	 * 
	 * To upload go to body section n go to form data
	 * parameter key-file  name-file value-the file which is going to be upload (for single file)
	 * parameter key-files  name-file value-the file which is going to be upload (for multiple file)
	 * after upload save and send request.
	 * if u select text instead of files u have to give path in the form of text.
	 * 
	 * 
	 * The uploaded fils can see in C driver ---upload folder it is automatically created by default
	 * 
	 * 
	 * ----------------------AUTENTICATION TYPES----------------
	 * 
	 * when ever we are accessing  real time or product API'S  we need some authentication  then only we will able to access those API
	 * we have different autherization options depend on the type of authentication the API is prepared by
	 * we have to take different API to test differnt authentications
	 * 
	 * Types of authentication
	 * -----------------------
	 * 
	 * 
	 * Basic (DATA IS NOT ENCRYPTED) in Digest authentication (data is encrypted) username and password
	 * AUTH-1  and AUTH-2 these are the third party authentications.(more secured authentications)
	 * OAUTH 2 i more secure than  the  OAUTH-1.
	 * 
	 * 
	 * BASIC---username and password---if username and password details are present in databse authentication got sucess.
	 * 
	 * Digest--same as dat of basic bt username and password are encrypted in this(more secure than basic). it will send some advanced
	 * fields along with request ,when u disable that check box autherization got unsucessful.
	 * 
	 * Barrier token--login to github repository,go to  developer settings----generate new tokens(personal access token)
	 * fill all the fields dat displayed
	 * we have to create our own access tokens,then we can acess the repositories present in github.
	 * 
	 * API KEY authentication
	 * ----------------------
	 * openweathermap.org-----------they are providing many APIS 
	 * to cretae API sign up to this website , this are temporary apis 
	 * 
	 * 
	 * 
	 * OAUTH-2.0 & OAUTH 1.0
	 * ----------------------
	 * third party compinies will provide this APIS
	 * service provider---owner of api(googgle maps)
	 * consumer--- who ever is using that API(whats up)
	 * high level internal AUTHENTICATION type.
	 * first we have to pass client and secret ID so that information we have to pass to server and that server authorize that
	 * information like both the ids are correct once its authorized it will return one token for u by using dat token we can use
	 * that API ,after checking client id github will send secret id by  along with some information,we have to send this id and info
	 * then it will send token then we can use to access.
	 * 
	 */

}
