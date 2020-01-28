##Resource Owner

A resource owner is the person or entity that owns the resource.
In our Facebook example, this would be the end user.
The resource owner can delegate access to a third party provider by authorizing towards the authorization server.
The resource owner can then access his resources on the resource server through a client application.

##Authorization Server
The authorization server is responsible for authorizing the resource owner and the client application.
A successful authorization of the resource owner will result in an access code.
If the client application presents a valid access code and its client secret an access token will be issued to the client application.
In our example this is the Facebook server.

##Resource Server
The resource server is essentially the API server. It verifies the access tokens provided in the request and that the access token has the required scopes.
In our example this is the newspaper server.

##Client application
The client application is the application that the end user uses.
In our example this is the web browser.