## REST API Fundamentals

#### What is curl?
curl is a command line HTTP client.

#### What is HTTP?
HTTP stands for Hypertext Transfer Protocol

The most common versions of HTTP on the internet today are 1.1 and 2.0

A HTTP request can contain a body

The content of a HTTP response is just text, we can view http in curl or in a browser using dev mode

TLS stands for transport layer security and is the current standard for implementing secure internet connections

HTTP Request Methods:

|Request Method Name|
|:---:|
|GET|
|POST|  
|PUT|
|PATCH|
|DELETE|

The differences between PUT PATCH and POST:

These are create and update methods.
If you are providing anything that is NOT NULL then when you insert you must provide values for every one of those fields
If you use a post request then you must supply all of the information, then the API will check if the entity exists in the database then there will be a client error IF there is no autoincrement, if there is an autoincrement then the database will always create a new record.

A POST will always create a new row in the database.

A PATCH will fail if the row does not already exist in the database.

A PUT will check first to see if the record already exists then update the fields and save it again, does not create a new record if the record already exists, if it doesnt then it will create a new record

HTTP Response Codes:

| Response Code Meaning | Example |
|:---:|:---|
|1xx - Informational| 100 = Continue|
|2xx - Successful| 200 = OK|
|3xx - Redirection| 301 = Moved Permanently|
|4xx - Client Error| 404 = Not Found|
|5xx - Server Error| 500 = Internal Server Error|

HTTP Responses contain the response code, headers, and a body.

Headers can also be included in http requests, things like what version of http you're using and also a body.

body can include form data among other things

___

### JSON

#### What is JSON?

JavaScript Object Notation

JSON is very flexible as it is just text.

Format:
```JSON
Object = {"property":value, "property":value , ...};
```
you can use this with Javascript, for instance

```JavaScript
person = {"firstName":"Cameron","lastName":"Higgins"};
console.log(person.firstName)//This would output "Cameron"
person.lastName = "Miller";
console.log(person.lastName)//This would now output "Miller"
```

You can create an array in JSON like this:
```JSON
"property":[someValue,someOtherValue,...]
```

JSON objects can contain other JSON objects within themselves, like so:

```JSON
objectA = {
  "objectB":{
    "bValue1":"someValue",
    "bValue2":"someValue",
    "bValue3":"someValue"
  }
}
```

JSON can store these types of values:

| Data Type | Example(s) |
| :---: | :--- |
|Numerical| 57, 12.07, -1.6e-19 |
|String| "String with text", "" |
|Boolean| true, false |
|Array| *see above* |
|JSON Object| *see above* |
|Null| null|

An alternative to JSON is XML, some people use JSON over its alternatives because JSON is compact.

___

### What is an API?

API stands for Application Programming Interface
 - A mechanism which allows two computer programs to communicate with each other.

### What is REST?

REST stands for Representational State Transfer

It is an architectural style, not a standard and its not an implementation technology. It is more of an approach for developing an API.

If something is RESTful that means it complies with the REST architectural style.

You can call REST from JavaScript code, which can increase functionality of web pages. It can add interactivity and dynamicity to a web page.

You can use REST in mobile apps to get data.

REST can integrate applications together, as there is wide support for HTTP in programming languages.
There is wide support for development of REST APIs in many languages

### What are the constraints of REST?

- We would expect that the service would have a client server structure.
- A REST API needs to be stateless.
- A REST API needs cacheability.
- We would expect that the system would be layered. (Abstracted and encapsulated)
- It should provide a uniform interface.
- Hypertext as the engine of application state

### Typical REST technologies

Message exchange
 - HTTP

Describing the location actions and target
 - URIs Uniform Resource Identifier
 - HTTP methods

Representing the Data
 - JSON
 - XML or HTML

Describing the service to someone else
 - Swagger/OpenAPI

## REST implementation

### REST Endpoints

Example: https://swapi.dev/api/films/1

- https - using HTTPS for security
- swapi.dev - the site hosting the APIs
- api - this is the api (other services may be available)
- films - this is the collection of films (typically a plural)
- 1 - the id of the film we are interested in
