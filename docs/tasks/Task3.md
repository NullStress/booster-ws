In this exercise we will verify that the oAuth server is working as expected.
To do this we need to perform http requests.

First build up an url consisting of:

http://localhost:8081/auth/oauth/authorize?response_type=code&client_id=booster-private-client&state=a_random_string&redirect_uri=http://localhost:8083/login/oauth2/code/

And open it in your browser.
You should be redirected to the login prompt.
Fill in with the username and password from the first task.

If everything goes as expected you should have a query parameter in your url called code.
This is the access code and now we need to exchange it for an access token.

Use the supplied postman collection and fill in with your values or do the same with the curl below:

curl -X POST \
  http://localhost:8081/auth/oauth/token \
  -H 'Content-Type: application/vnd.my.company.json;v=1.0' \
  -H 'Postman-Token: 93fa42f5-1ef6-4875-92e9-1e25059d5dc7' \
  -H 'cache-control: no-cache' \
  -H 'content-type: multipart/form-data \
  -F client_id=booster-private-client \
  -F client_secret=fDw7Mpkk5czHNuSRtmhGmAGL42CaxQB9 \
  -F grant_type=authorization_code \
  -F redirect_uri=http://localhost:8083/login/oauth2/code/ \
  -F state=a_random_string \
  -F 'code=<your_code>'