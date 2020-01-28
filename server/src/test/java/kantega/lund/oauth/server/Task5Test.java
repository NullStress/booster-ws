package kantega.lund.oauth.server;

import org.junit.jupiter.api.Test;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.builders.ClientDetailsServiceBuilder;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Task5Test {

    private String clientId = "booster-private-client";
    private String mockPassword = "aMockPassword";

    @Test
    void configure() throws Exception {
        PasswordEncoder passwordEncoderMock = mock(PasswordEncoder.class);
        when(passwordEncoderMock.encode(anyString())).thenReturn(mockPassword);
        AuthenticationManager authenticationManagerMock = mock(AuthenticationManager.class);
        AuthServerConfig authServerConfig = new AuthServerConfig(passwordEncoderMock, authenticationManagerMock);
        ClientDetailsServiceConfigurerExtended clients = new ClientDetailsServiceConfigurerExtended(new ClientDetailsServiceBuilder());

        authServerConfig.configure(clients);
        ClientDetailsService clientDetailsService = clients.returnBuilder().build();
        ClientDetails details = clientDetailsService.loadClientByClientId(clientId);

        assertEquals(clientId, details.getClientId());
        assertTrue(details.isAutoApprove("user_info"));
    }
}
