package cz.koprivajakub.rest.oauth2.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    //TODO: Try replace @Bean of TokenEndpoint type... This should be easy

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().and().httpBasic().disable()
//                .authorizeRequests()
//                .antMatchers("/test").permitAll()
//                .antMatchers("/secured").authenticated();
    }
}
