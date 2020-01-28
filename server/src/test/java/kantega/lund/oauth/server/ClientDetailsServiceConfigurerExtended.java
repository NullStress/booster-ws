package kantega.lund.oauth.server;

import org.springframework.security.oauth2.config.annotation.builders.ClientDetailsServiceBuilder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;

public class ClientDetailsServiceConfigurerExtended extends ClientDetailsServiceConfigurer {

    public ClientDetailsServiceConfigurerExtended(ClientDetailsServiceBuilder<?> builder) {
        super(builder);
    }

    public ClientDetailsServiceBuilder returnBuilder(){
        return getBuilder();
    }
}
