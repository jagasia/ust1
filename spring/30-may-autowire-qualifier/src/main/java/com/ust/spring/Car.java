package com.ust.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	@Qualifier("j1")
	Audio audio;

	public Car(Audio audio) {
		super();
		this.audio = audio;
	}
	
	public Car() {}

	
	public Audio getSony() {
		return audio;
	}

	public void setSony(Audio audio) {
		this.audio = audio;
	}

	
	
	public void play()
	{
		audio.playMusic();
	}
}
