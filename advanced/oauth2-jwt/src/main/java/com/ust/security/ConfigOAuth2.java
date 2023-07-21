package com.ust.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration 
public class ConfigOAuth2 extends AuthorizationServerConfigurerAdapter{
	
	   private String clientId = "pixeltrice";
	   private String clientSecret = "pixeltrice-secret-key";
	   private String privateKey = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
	   		"MIIEowIBAAKCAQEAwZNsySn6wEk9k92wIaZl0vgcKdIUDyRRhbpRTokdvcCD6ZYW\r\n" + 
	   		"Bq2HrZDFHqwlvpNdPjw9lgO1hmMnz47mJ1megu11OgInxb7TlQh2CQ8dTZ4upXME\r\n" + 
	   		"JD7UHEN+aii1PM2+Gh9jCozGOBKhkYFfyXIjTY2EigX4LBIC/JIKPs8OzFUxsHeL\r\n" + 
	   		"9qnJDJ/WdY/rT05hg0DQe00nfeX0glWKREfw23OZNNQyCq9n4vOsXFX3jP5CgnqN\r\n" + 
	   		"LCrslkuAIIzQoNRBqWAzhtHC6dOglO4lg1xJ2E+sqA0i0xJWs5aU5P1StRXt7sld\r\n" + 
	   		"mTFOjPKkl1dNxyYRRls7jk25YoWZRRWeE2EHbQIDAQABAoIBADjooYvGZqyPG6ZT\r\n" + 
	   		"/0r1Q2wxev4kf7cv4zOgYfTnxLGbXmyWriUKcR/qtrjcvT/4zOnWBfkLYBuBHRwd\r\n" + 
	   		"E7av1zUAoH0MUysEfemLkj/5jJDcFzSWyrnpKqygfxKwow+cIO5HGfPpDQFBIPTJ\r\n" + 
	   		"ByMPBifvme6F8L7sEKq2OILclqolQrQ4pldfGdaMAESwze2zu+YRDRifSDcuyvWa\r\n" + 
	   		"xEwXX0qXImLRsri2vE4LMh1tVfENnrAfE3tuUhCSMexgQKe57+8efHbWYdZwdD/S\r\n" + 
	   		"j5vRq2AsfT0iDgAOcvAWd3Q/p53YMuEOqgG9ooxTymtPbdJoMuqlaILMxiWid6C+\r\n" + 
	   		"ojoK0HUCgYEA6BaDsGuIr+Sg8Ai2gRdXdipUyXeRary2OF/pK9Dq/LQUl0UOAPJi\r\n" + 
	   		"TqWJAEw8eA3V8DdaQUBIwjctZWabNq6ctdLlADm2tCNTq0FrX1E0oOofS/YLlln2\r\n" + 
	   		"st+nG5Cn854NHLToZwPz6drAMImiTyCu10lvwYOkpqsZTU7zN6BNqscCgYEA1YUg\r\n" + 
	   		"j44WHtWeX2ugO51PB8+JEFwSyEt6I9jlmb0tNWSvUHaVJ9rh+pOW3MqMtFV0nmDJ\r\n" + 
	   		"fBtEdLas3cV83/tnWA7JLIHbZBEaLyyK7Tpc0YYxlNM7nGp8gIRrvWAyghuYJcEe\r\n" + 
	   		"nSgDLeawe8xquATXwIVEMRSD/Wl8n3ecxgbn6CsCgYEAujh+d8sAxOl0vMSw84mw\r\n" + 
	   		"Es9KctDurC85IqjKZe7e7d7seqfc4aOaf7JQ6B1Dk6y+UV2InLyg5LzzPt6CgfC/\r\n" + 
	   		"KyFJv9GPKKED3HDEX5m/2bGhZQjKKVyMFuBfrD14lX/m03bQ1v+T8bsk5I0637TA\r\n" + 
	   		"tVtmQWaIcXbt+Vr0ylhkmTcCgYB4O8biD3iVVGUiBlDsQODH3S2pcK+C6j2VAgYI\r\n" + 
	   		"VGaoslGmVaAYGUE3APTqz4P76EMLDCVpJVGfB17AYvy2g7Ll+y19SoJoDtlXxxVU\r\n" + 
	   		"EJFDyvUQgQIISk5hcC/bK9hFO5Spbd33URi5ODYZADr39IIpfuGvYYYRpNzwT0KQ\r\n" + 
	   		"oELmkQKBgAKnOHLOGUC0SB7HNEHbs0j1kkhYD8rltklvjA9QMRdkQpBK/X+uMGAh\r\n" + 
	   		"e9aK8ZwiOHsJJmnFuhjJgVL+2OeGKOXdJ10O3Gwy6jC55A0x3ywqcHBq/AISNCev\r\n" + 
	   		"92GBZEwzCLoo8bfIWGArnOi519QLx4purrHJ+fyLwG2TvvirGJnd\r\n" + 
	   		"-----END RSA PRIVATE KEY-----";
	   private String publicKey = "-----BEGIN PUBLIC KEY-----\r\n" + 
	   		"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwZNsySn6wEk9k92wIaZl\r\n" + 
	   		"0vgcKdIUDyRRhbpRTokdvcCD6ZYWBq2HrZDFHqwlvpNdPjw9lgO1hmMnz47mJ1me\r\n" + 
	   		"gu11OgInxb7TlQh2CQ8dTZ4upXMEJD7UHEN+aii1PM2+Gh9jCozGOBKhkYFfyXIj\r\n" + 
	   		"TY2EigX4LBIC/JIKPs8OzFUxsHeL9qnJDJ/WdY/rT05hg0DQe00nfeX0glWKREfw\r\n" + 
	   		"23OZNNQyCq9n4vOsXFX3jP5CgnqNLCrslkuAIIzQoNRBqWAzhtHC6dOglO4lg1xJ\r\n" + 
	   		"2E+sqA0i0xJWs5aU5P1StRXt7sldmTFOjPKkl1dNxyYRRls7jk25YoWZRRWeE2EH\r\n" + 
	   		"bQIDAQAB\r\n" + 
	   		"-----END PUBLIC KEY-----";
	   
	   @Autowired
	   @Qualifier("authenticationManagerBean")
	   private AuthenticationManager authenticationManager;
	   
	   @Autowired
	   PasswordEncoder passwordEncoder;
	   
	   @Bean
	   public JwtAccessTokenConverter tokenEnhancer() {
	      JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
	      converter.setSigningKey(privateKey);
	      converter.setVerifierKey(publicKey);
	      return converter;
	   }
	   
	   @Bean
	   public JwtTokenStore tokenStore() {
	      return new JwtTokenStore(tokenEnhancer());
	   }
	   
	   @Override
	   public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
	      endpoints.authenticationManager(authenticationManager).tokenStore(tokenStore())
	      .accessTokenConverter(tokenEnhancer());
	   }
	   @Override
	   public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
	      security.tokenKeyAccess("permitAll()").checkTokenAccess("isAuthenticated()");
	   }
	   @Override
	   public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
	      clients.inMemory().withClient(clientId).secret(passwordEncoder.encode(clientSecret)).scopes("read", "write")
	         .authorizedGrantTypes("password", "refresh_token").accessTokenValiditySeconds(20000)
	         .refreshTokenValiditySeconds(20000);

	   }

	  
}