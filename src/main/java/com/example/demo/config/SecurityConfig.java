@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

    http
        .csrf(csrf -> csrf.disable())
        .authorizeHttpRequests(auth -> auth
            // Swagger endpoints
            .requestMatchers(
                "/swagger-ui/**",
                "/v3/api-docs/**",
                "/swagger-ui.html"
            ).permitAll()

            // Auth endpoints
            .requestMatchers("/auth/**").permitAll()

            // Everything else needs JWT
            .anyRequest().authenticated()
        );

    return http.build();
}
