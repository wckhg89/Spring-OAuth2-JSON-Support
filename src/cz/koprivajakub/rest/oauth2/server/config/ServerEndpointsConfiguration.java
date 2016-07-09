package cz.koprivajakub.rest.oauth2.server.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class ServerEndpointsConfiguration extends ResourceServerConfigurerAdapter {

    @Autowired
    JsonToUrlEncodedAuthenticationFilter jsonFilter;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .addFilterBefore(jsonFilter, ChannelProcessingFilter.class)
                .csrf().and().httpBasic().disable() // disable CSRF and HTTP Basic Auth
                .authorizeRequests()
                .antMatchers("/test").permitAll()
                .antMatchers("/secured").authenticated();
    }
}
