package kantega.lund.oauth.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClientProperties {

    @Value("${spring.security.oauth2.client.registration.private-client.client-id}")
    private String clientId;

    @Value("${spring.security.oauth2.client.registration.private-client.client-secret}")
    private String clientSecret;

    @Value("${spring.security.oauth2.client.registration.private-client.scope}")
    private String scope;

    @Value("${spring.security.oauth2.client.registration.private-client.provider}")
    private String provider;

    @Value("${spring.security.oauth2.client.registration.private-client.redirect-uri}")
    private String redirectUri;

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public String getScope() {
        return scope;
    }

    public String getProvider() {
        return provider;
    }

    public String getRedirectUri() {
        return redirectUri;
    }
}
