package bernal_prueba_ge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityCondig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        return http
                .httpBasic()
                .and()
                .authorizeHttpRequests()
                //.anyRequest().permitAll() //--Permite a todos
                //.anyRequest().denyAll() //--Deniega a todos
                //.anyRequest().authenticated() //--autenticado
                //.anyRequest().hasRole("ADMIN")
                //.anyRequest().hasAuthority("write")
                //.anyRequest().access(new WebExpressionAuthorizationManager("hasRole('ADMIN') or hasRole('DBA')")) //SpEL(spring expression lenguage)
                //.requestMatchers("/api/demo").permitAll()
                //.requestMatchers("/api/admin").hasRole("ADMIN")
                //.requestMatchers("/api/dba").hasAnyRole("DBA","ADMIN")
                .requestMatchers(HttpMethod.POST,"/api/empresa").hasRole("ADMIN")
                .requestMatchers(HttpMethod.GET,"/api/empresas3").authenticated()
                .requestMatchers(HttpMethod.GET,"/api/empresas").authenticated()
                .and().csrf().disable().build();
        //.and().build();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        return new InMemoryUserDetailsManager(
                User.withUsername("user")
                        .password(passwordEncoder().encode("123456"))
                        .authorities("read","ROLE_USER")
                        .build(),
                User.withUsername("admin")
                        .password(passwordEncoder().encode("123456"))
                        .authorities("read","write","ROLE_ADMIN")
                        .build()
        );
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
