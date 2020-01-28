package kantega.lund.oauth.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ContextConfiguration(classes = ClientProperties.class)
public class Task4Test {

    @Autowired
    ClientProperties clientProperties;

    @Test
    public void testPropertiesAreSet() {
        assertThat(clientProperties.getClientId()).isNotBlank();
        assertThat(clientProperties.getClientSecret()).isNotBlank();
        assertThat(clientProperties.getScope()).isEqualTo("user_info");
        assertThat(clientProperties.getRedirectUri()).isEqualTo("http://localhost:8082/login/oauth2/code/");
    }
}
