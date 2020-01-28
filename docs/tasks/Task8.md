In this task we will use postman or curl to make a call to the server using the public client with the code flow with PKCE flow.
To perform the call we take 979c7636-8f46-4064-91d9-b7ac83632033 and hash it with SHA256 to Y2MwNzgwODRjNjk2ZjRlNTU2OTg1MGQ4MGZiMTJiNDdiYmM5NGQ3MTUyNGM5NTA2ODc3MjI1ZGNlMjIzMDM3MA==
We send the hashed value together with the hashing algorithm SHA256 to the same endpoint as we used earlier.
We also have to change the client id.

http://localhost:8081/auth/oauth/authorize?response_type=code&client_id=booster-public-client&state=a_random_string&code_challenge=Y2MwNzgwODRjNjk2ZjRlNTU2OTg1MGQ4MGZiMTJiNDdiYmM5NGQ3MTUyNGM5NTA2ODc3MjI1ZGNlMjIzMDM3MA==&code_challenge_method=s256&redirect_uri=http://localhost:8083/login/oauth2/code/

After we receive the code we need to exchange it for an access token.
So we call the token endpoint.
To prove that we sent the original request we also send in the un-hashed value for verification.
Use the supplied PKCE postman call or use the curl below: 


curl -X POST \
  http://localhost:8081/auth/oauth/token \
  -H 'content-type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW' \
  -F client_id=booster-public-client \
  -F grant_type=authorization_code \
  -F redirect_uri=http://localhost:8083/login/oauth2/code/ \
  -F state=a_random_string \
  -F 'code=<your_code>' \
  -F code_verifier=979c7636-8f46-4064-91d9-b7ac83632033
