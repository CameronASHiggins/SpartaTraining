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

HTTP Response Codes:

| Response Code Meaning | Example |
|:---:|:---|
|1xx - Informational| 100 = Continue|
|2xx - Successful| 200 = OK|
|3xx - Redirection| 301 = Moved Permanently|
|4xx - Client Error| 404 = Not Found|
|5xx - Server Error| 500 = Internal Server Error|

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
