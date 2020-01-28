title Authorization Code flow with PKCE

User->Client Application:1. Click login link
Client Application->Client Application:2.Generate Code Verifier and Code Challenge
Client Application->Authorization Server:3. Authorization code request + Code Challenge /authorize
User<-Authorization Server:4. Redirect to login screen
User->Authorization Server:5. Authenticates and gives consent
Client Application<-Authorization Server:6. Authorization code
Client Application->Authorization Server:7. Authorization code + Code verifier
Authorization Server->Authorization Server:8. Validate Code verifier and challenge
Client Application<-Authorization Server:9. Access token
Client Application->Resource Server:10. Access user resources

Client Application<-Resource Server:11. Response with resources