In this exercise we will finish the PKCE implementation on the Authorization server.
The missing piece is to hash the code verifier so that we can compare it to the challenge.
Finish the CodeChallengeMethod for S256 by using the SHA-256 algorithm to hash the input.
Then the result must be URL encoded but without padding.
A useful method is:

Base64.getUrlEncoder().withoutPadding()