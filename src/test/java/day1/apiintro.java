package day1;

public class apiintro {

	public static void main(String[] args) {

		/*------------API TESING-------------
		 *Generally there are 3 layers presentation layer(GUI)2.Business layer(application user interfaec)3.database layer(database)
		 * APLICATION/CLIENT-----API REQUEST----SOURCE/DATABASE-----API RESPONSE.
		 *API stands for apppication programming interface
		 *It is a collection of procedures,functions and methods that are available to be executed by the other software applications
		 *The main purpose is to offer access to certain services and provide communication between two softwares
		 *It is a part of intergartion testing to determine if they meet expectation for functionality,reliability,security,performance.
		 *Since API's lack GUI so teting is performed at message layer.
		 *
		 * -----------------------Types oF APIS-------------
		 * 
		 * 1.SOAP(Simple object access protocol)--they are older and accept only xml format type of data)
		 * 2.REST(Representation state transfer)---they are new and accept xml, json,pom..etc
		 * 
		 * web services are API wrapped in HTTP(once they need to production and provide internet)
		 * All web services are API but not all apis's are web services
		 * A web service needs a network while an API doesnt need a network for its operation
		 * 
		 * 
		 * --------------------REST API METHODS----------
		 * Request  message----->application program interface------>response message(validation performed like response status code,data etc)
		 * 
		 * Rest ApI methods/HTTP request
		 * -------
		 * get---to get response from server
		 * post---to post something server
		 * put----to updatae data from server
		 * patch---to update the existed data from the server 
		 * delete---to delete the data present in server
		 
	
		 *---HTTP VS HTTPS-------
		 *HTTP---------hyper text transfer protocol 
		 *HTPPS---------hyper text transfer protocol more secure
		 *These are two different protocols used by softwares to communicate between APIS...
		 *Http is not so secure because when u send some request in browser it is not encrypted bt if u send the same request in browser
		 *the data dat is transfered through network then it converted to end to ends encrypted data and processing is done when request reach 
		 *server the data there is depricated(low chance of hacking nad more secure)
		 *
		 *-----TERMINOLOGIES-----------
		 *URI---uniform resource identifier
		 *URL---uniform resource locator
		 *URN---unifrom resource name
		 *----------------------URL--------------
		 *        URI----------------------------
		 *                    URN----------------
		 *https://google.com/articles/articlename
		 *
		 *(scheme)(host/domain)  (path- where resource is presnt) part after host called end point
		 *
		 *  
		 * ------Feature& Resource-------------
		 * Feature---is  a term used in manual & Automation testing to test some functionality 
		 * Resource--- is a term used in API automaation testing refering some functionality
		 * 
		 *  payload----
		 *  payload menas body in the HTTP request and response message.
		 *  .Request payload--sending data(post) through request is called request payload.
		 *  .Response payload--getting response form server is called response payload.
		 *   
		 *There are different response code like(200-which means it is sucessful response code same like this there are different code)
		 *only through browser get request are possible. 
		 *
		 * 
		 * Postman is availabe in 2 froms --1.Dispaly  format 2.web format
		 * The operations u do in the display mode reflect in web type the same is reflected in the web mode too.
		 * setting up workspace in postman is the primary thing without setting workspace we cant do any opetaion in postman.
		 * workspace --- is a area where files are stored.
		 * create collection-place where we can store T.C , http request,folders etc...
		 * in the collection (we can create collection,delete collection,rename collection)
		 * we can create any number of collections under work space.
		 * 
		 * 
		 * Request---------API------RESPONSE-------
		 * 
		 * GET--retrive the resource from daatbase
		 * POST---create a new resource on database
		 * PUT----update existing resource in database
		 * patch---update partial details of resources in database.
		 * DELETE----deleting existing resource from database
		 * there 4 are HTTP request
		 *
		 * https://reqres.in/api/users?page=2
		 *(schema)(host/domain)(path parameter)(query parameter)(2=resource)
		 * we will do validation on response payload (payload means sending request with data).
		 * 
		 * 
		 * validation
		 * -----------
		 * status code
		 * time
		 * size data
		 * response body{json/xml}
		 * cookies
		 * headers.
		 * 
		 * 
		 * status codes
		 * -------------
		 * 3 levels or series
		 * ---------
		 * 200:OK 201:created 202:Accepted 203:Non-Authoritative information 204:no content
		 * 400:Bad request 401:unauthorized 403:Forbidden 404:Not found 409:Conflict 
		 * 500:Internal server Error 501:Not implemented 502: Bad gateway 503:Service unavailable 504: Gateway Timeout 509:Network timeout
		 */
	}

}
