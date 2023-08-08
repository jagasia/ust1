package com.ust.spring;

import org.springframework.stereotype.Component;

@Component("j1")
public class Jbl implements Audio
{
	public Jbl() {}
	

	@Override
	public void playMusic() {
		System.out.println("Jbl makes more noise like Kalyan when he is happy");
	}

}
