package day1;

public class scripts {
	
	/*-----------Scripts-------------------
	 * pre-requisite
	 * tests
	 * 
	 * order of execution will be like this (followed below)
	 * 
	 * levels 
	 * -------
	 *  collection level (pre-requisite) if we specify prerequest script in collection level that will be used in cfolder and request level aslo
	 *  Folder level (pre-requisite) 
	 *  Request level  (pre-requisite) 
	 *  
	 *  pre-request script ---->Request--------response-------->Tests script.
	 *                                                          levels
	 *                                                          --------
	 *                                                          collection (pre-requisite)   if we specify prerequest script in collection level that will be used in c folder and request level aslo
	 *                                                          Folder     (pre-requisite) 
	 *                                                          Request    (pre-requisite) 
	 * To see the  output in console of postman can be done by using command
	 * Console.log("prerequest script at collection level");
	 * add the above command in every prerequest at every level and also in test of different levels
	 * 
	 * 
	 * prerequisite will be sent before request 
	 * to sent the dynamical data before request we will use prerequest script
	 * to send some parameters to request we can use this prerequest script
	 * 
	 * 
	 *  ---------------------POSTMAN VARIABLES-----------
	 *  
	 *  postman supports different types of variables
	 *  
	 *  scope of variables(based on scope they are divided in 5 types)
	 *  --------------------------------------------------------------- 
	 *  Global---------we can access throughout workspace.
	 *  Collection------we can access within collection. {{url_collec}}/api/user?page=2
	 *  Environment-----we can access in. environment.{{url_qa_ennv}}/api/user?page=2---to use any environment varibale first we have to shift to that environmant 
	 *  to do that go to environment variable and shift to dat environment so dat we can access dat environmnet variable.
	 *  acesssable in all collection bt we need to switch to particular environment, they are also global.
	 *  Local----------accessed within particular request only.
	 *  Data------
	 *  
	 *  GLOBAL
	 *  ---------
	 *  after specifying the variable with value like url_global(name of variale_) https://reqres.in/(value of variable)
	 *  and save this varibale 
	 *  when u want to pass this url we can use {{url_global}}/api/user?page=2
	 *  
	 * Environment--it is a set of variables that allows u to switch context of your request term
	 * --------------------------------------------------------------------------------------------
	 * if we want to execute multiple requests present in collection in different environment like(QA, DEV, PRODUCTION)
	 * different environment has different multiple  variables if we want to exeute the collection in dev environment we have to shift to
	 * dev environment variable,like QA environment ,like PRODUCTION environment
	 *  
	 * LOCAL
	 * ------ 
	 * we can create this varibale in request level 
	 * we have to write this varibale in prerequest script in request window and that variable will be used by request
	 * 
	 * this is the function to create varibale
	 * 
	 * pm.variable.set("url_local", "htps://reqres.in/");  this one executed before request and sent to request 
	 * {{url_local}}/api/users?page=2.---this should be given as  URL in url box.
	 * 
	 * DATA
	 * ----------
	 * these can be created in external files(notepad,excel ...etc)------DDT TESTING.
	 * 
	 * instead of creating variables at different levels we can create this vraibales in prerequest sciprt in request level,send and save
	 * now u can see the updatae of this variable in particular level of variable section
	 * 
	 * to set the environment variable in prerequest script of request
	 * ---------------------------------------------------------------
	 * pm.envieonment.set("userid_qa_env", "2");
	 * to use this varible in URL  we have to give this syntax in url box following below {{url_global}}/api/users?page{{userid-qa_env}};
	 * 
	 * to set the collection variable in prerequest script of request
	 * ---------------------------------------------------------------
	 * pm.collectionvariable.set("userid_collcet", "2");
	 * to use this varible in URL  we have to give this syntax in url box following below {{url_global}}/api/users?page{{userid_collect}};
	 * to set the global variable in prerequest script of request
	 * ---------------------------------------------------------------
	 * pm.global.set("userid_global", "2");
	 * to use this varible in URL  we have to give this syntax in url box following below {{url_global}}/api/users?page{{userid_global}};
	 * 
	 * After creating and using the varibale if u want to delete we have to unset this vaibale in TEST window in request tab
	 * so dat we can not see this varibales in the variables windoe also
	 * 
	 * 
	 * unset varibale
	 * --------------
	 *  pm.environment.unset("userid_qa_env", "2");
	 *  pm.collectionvariable.unset("userid_collcet", "2");
	 *  pm.global.unset("userid_global", "2");
	 *  pm.variable.unset("url_local", "2");
	 *  
	 *  
	 *  
	 *  Beore unset data if u want to retrive the value of variables used in prerequest script following method should be used
	 *  this methods should be add before unset in Test window
	 *  
	 * console.log(pm.global.get("userid_global");
	 * console.get( pm.envieonment.get("userid_qa_env");
	 * console.get( pm.collectionvariable.get("userid_collcet");
	 * console.get( pm.global.get("userid_global);
	 * console.get( pm.variable.get("url_local");
	 * 
	 * 
	 * 
	 * set----global,env,collection,local--set data
	 * unset--global,env,collection,local---delete data
	 * get---global,env,collection,local---print data
	 */

}
