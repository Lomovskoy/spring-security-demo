package net.schastny.contactmanager.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.AccessDeniedHandler;
// https://habr.com/ru/post/226791/
//https://www.baeldung.com/spring-security-login
//https://www.mkyong.com/spring-security/spring-security-form-login-example/
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    private final AccessDeniedHandler accessDeniedHandler;

    @Autowired
    public SpringSecurityConfig(AccessDeniedHandler accessDeniedHandler) {
        this.accessDeniedHandler = accessDeniedHandler;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

//        http.csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/v1/", "/swagger-ui.html", "/webjars/**").permitAll()
//                .antMatchers("/contact/getAll/**", "/contact/createContract/**", "/contact/deleteContract/**").hasAnyRole("ADMIN")
//                .antMatchers("/contact/getAll/**", "/contact/createContract/**").hasAnyRole("MODER")
//                .antMatchers("/contact/getAll/**").hasAnyRole("USER")
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/")
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll()
//                .and()
//                .exceptionHandling().accessDeniedHandler(accessDeniedHandler);
        http.authorizeRequests()
                .antMatchers("/contact/getAll/**", "/contact/createContract/**", "/contact/deleteContract/**")
                .access("hasRole('ADMIN')")
                .antMatchers("/contact/getAll/**", "/contact/createContract/**")
                .access("hasRole('MODER')")
                .and()
                .formLogin()
                .defaultSuccessUrl("/", false);
    }

    // создаем пользоватлелей, admin и user
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("user").password("password").roles("USER")
//                .and()
//                .withUser("admin").password("password").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("imxo").password("123qwerty").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("shirshova").password("12345678915").roles("MODER");
        auth.inMemoryAuthentication().withUser("shiharev").password("123").roles("USER");
    }
}
