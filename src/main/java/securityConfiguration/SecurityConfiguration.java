package securityConfiguration;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	@Bean
	SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception {
		return http.authorizeHttpRequests(
				autorizeConfig -> { 
					autorizeConfig.requestMatchers("/marca/{id}").permitAll();
					autorizeConfig.requestMatchers("/logout").permitAll();
					autorizeConfig.anyRequest().authenticated();
				}
				)
				.formLogin(Customizer.withDefaults())
				.csrf(AbstractHttpConfigurer::disable)
				.build();
	}

}
