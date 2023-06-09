package com.ust.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.spring.entity.AuthRequest;
import com.ust.spring.service.MyUserDetailsService;
import com.ust.spring.util.JwtUtil;

class JwtToken
{
	String token;
	public JwtToken() {}
	public JwtToken(String token) {
		super();
		this.token = token;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@Override
	public String toString() {
		return "JwtToken [token=" + token + "]";
	}
	
}

@RestController
public class MyController {
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private MyUserDetailsService ms;
	
	 @Autowired
	   private AuthenticationManager authenticationManager;
	
	@PostMapping("/login")
	public JwtToken validateLogin(@RequestBody AuthRequest ar) throws Exception
	{
		try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(ar.getUsername(), ar.getPassword())
            );
        } catch (Exception ex) {
            JwtToken jwt1=new JwtToken();
            jwt1.token="Login failed";
            return jwt1;
        }
        String str=jwtUtil.generateToken(ar.getUsername());
        JwtToken jwt=new JwtToken();
        jwt.token=str;
        return jwt;
//		UserDetails temp = ms.loadUserByUsername(ar.getUsername());
//		if(temp!=null)
//		{
//			//login is success
//			if(temp.getPassword().equals(ar.getPassword()))
//			{
//				//login is success
//				return jwtUtil.generateToken(ar.getUsername());
//			}
//		}
//		return "Login failed";
	}
	
	@GetMapping("/hello")
	public String hello()
	{
		return "hello";
	}
	
	@GetMapping("/hi")
	public String hi()
	{
		return "hi";
	}
}
