//package fa.training.loginTest.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http.authorizeRequests()
////                .antMatchers("/", "/home").permitAll()
////                .anyRequest().authenticated();
////
////        http.formLogin()
////                .loginProcessingUrl("/login")
////                .usernameParameter("username")
////                .passwordParameter("password")
////                .defaultSuccessUrl("/home");
////
////        http.sessionManagement()
////                .sessionFixation().migrateSession();
////    }
//    
//    @SuppressWarnings("removal")
//	@Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//            return http.csrf().disable()
//                    .authorizeHttpRequests()
//                    .requestMatchers("/hello").permitAll() // với endpoint /hello thì sẽ được cho qua
//                    .and()
//                    .authorizeHttpRequests()
//                    .requestMatchers("/customer/**").authenticated() // với endpoint /customer/** sẽ yêu cầu authenticate
//                    .and().formLogin() // trả về page login nếu chưa authenticate
//                    .and().build();
//    }
//
//    
//    
//}
