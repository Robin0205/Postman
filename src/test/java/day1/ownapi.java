package day1;

public class ownapi {
	
	/*To create our own APIS we need some software they are
	 * Step-1
	 * -----
	 * NODE JS(software)
	 * NPM-node package manager(this component comes along with the NODE JS software)
	 * To check the verison  of node js write npm --verison in command prompt, node --version.
	 * 
	 * Step-2
	 * -------
	 * Json-server
	 * 
	 * to install enter this command in command prompt beacse to run json file we need server
	 * 
	 * Run the below command in command/terminal
	 * 
	 * 
	 * npm install-g json-server 
	 * 
	 * Api opeartions will work in  presence  of data in database
	 * Download Json,npm-node package manager
	 * open command prompt- npm install-g json-server-it will create server  on other hand create file and insert data in json file
	 * in json format
	 * ---Run this file in command prompt by using json-server students.js-------now we can work on apis of students.json file (Apis are running now(it will give resources and home)
	 * ---Now open the locaalhost:3000/Students where we can see list of students in database(the given file)
	 * ---Now import the collection to postman tool and do the required HTTP request
	 * ---By using assertions provided by postman we can validate the response request
	 * 
	 * 
	 * -------------Json----------------
	 *J son is a java script object notation
	 *whenever ur communicating between the client/server json/xml file format is required 
	 *to transfer the data between both json/xml is manditory because the Json(rest assure)/XML(soap) file is low weighted file and they r capable of doing
	 *encryption and decryption ,where as Text/Excel/Pdf formats are high weighted files
	 *
	 *--Json is syntax for exchanging data
	 *Extension is .json
	 *It is extended from java scripe language
	 *Json internet media type is application/json
	 *designed for human -redeable data interchange
	 *json is a text, written with java script object notation
	 *
	 *------json data types--------
	 *Number   String    Boolean   Object    Null  Array
	 *The data present in  the form of Key nad value
	 *
	 *
	 *{
	 * "first name": "John",------------String
	 * "second name": null,-----------Null
	 * "age" : 30,-----------------Number
	 * "Phone":[123,456]---------------Json Array
	 * "status": Boolean--------------Boolean
	 * }
	 * In jSON EVERY KEY MUST BE KEPT IN DOUBLE QUOTES
	 * 
	 * 
	 * {
	 * Students[----------This is the json Array holding multiple objects
	 *         {
	 *               student--1 ----------------this is one object holding multiple forms of json data types
	 *         }
	 *         
	 *         {
	 *             student-2
	 *         }
	 *            {
	 *               student--3
	 *         }
	 *         
	 *         {
	 *             student-4
	 *         }
	 * ]
	 * }
	 * 
	 * 
	 * JSON ARRAY ["Monday","sunday","tuesday","thursday"]
	 *  
	 *     Json                                                     XML
	 * 
	 *simple to read and write                                  it is less simple than json 
	 *supports Array concept                                    Xml files are less human readable
	 *Json files are more human readable(number,text)           it supports many data types such as  (text number images graphs etc)
	 * 
	 * for example to find out the json path for the existing data  students[o].phone[0]
	 * 
	 * https://jsonpathfinder.com/
	 * https://jsonpath.com/----------in  this we can validate the response request also
	 * 
	 * 
	 */

}
