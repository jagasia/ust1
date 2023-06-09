package com.ust.spring;

import org.springframework.stereotype.Component;

@Component
public class Sony implements Audio
{
	public Sony() {}
	
	@Override
	public void playMusic() {
		System.out.println("Sony makes good sound like Kalyan's voice");
	}

}
