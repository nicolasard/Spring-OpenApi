## Open Api 

Here you can find my tests about OpenaPI, I'm reading the following links to learn about it.

	- https://openapi-generator.tech/

#### example-1
This was my first example taken an OpenApi contract that I found in github and implementing the 
server. 

#### example-2
This was made from scratch, I first write the OpenApi contract, then I implemented the server. In this case, I'm also using Spring Actuator which is not related to OpenApi, but it's the first time I play 
with it.

|Url |Description|   
|---|---|
|http://localhost:8010/actuator/|Display all the urls we have available in the actuator, for ex (http://localhost:8010/actuator/health) that could be used as readiness prove at k8s|
|http://localhost:8010/card|Implementation of one OpenApi contract, display a list of tokenized cards|

#### example-3
