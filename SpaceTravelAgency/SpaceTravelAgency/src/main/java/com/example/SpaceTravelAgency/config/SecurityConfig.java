package com.example.SpaceTravelAgency.config;

import com.example.SpaceTravelAgency.repositories.UserRepository;
import com.example.SpaceTravelAgency.services.CosmosUserDetailsService;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new Pbkdf2PasswordEncoder("cosmos", 5, 200000, Pbkdf2PasswordEncoder.SecretKeyFactoryAlgorithm.PBKDF2WithHmacSHA1);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.
                // define which requests are allowed and which not
                        authorizeHttpRequests(requests -> requests.
                        // everyone can download static resources (css, js, images)
                                requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll().
                        // everyone can login and register
                                requestMatchers("/", "/users/login", "/users/register").permitAll().
                        // pages available onny for moderators
                                anyRequest().
                        authenticated()).
                // configuration of form login
                        formLogin(form -> form.
                        //.loginPage("/login")
                        // the custom login form
                                loginPage("/users/login").
                        // the name of the username form field
                                usernameParameter(UsernamePasswordAuthenticationFilter.SPRING_SECURITY_FORM_USERNAME_KEY).
                        // the name of the password form field
                                passwordParameter(UsernamePasswordAuthenticationFilter.SPRING_SECURITY_FORM_PASSWORD_KEY).
                        // where to go in case that the login is successful
                                defaultSuccessUrl("/").
                        // where to go in case that the login failed
                                failureForwardUrl("/users/login-error")).
                //and().
                // configure logut
                        logout(logout -> logout.
                        // which is the logout url
                                logoutUrl("/users/logout").
                        // invalidate the session and delete the cookies
                                invalidateHttpSession(true).
                        deleteCookies("JSESSIONID"));


        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(UserRepository userRepository) {
        return new CosmosUserDetailsService(userRepository);
    }
}
