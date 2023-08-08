package com.ust.ajay.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.ust.ajay.Mathematics;

public class MathematicsTest3 {

	@Test
	public void m()
	{

		Mathematics m = new Mathematics();
		m.setNo1(2);
		m.setNo2(3);
		
		when(m.add()).thenReturn(200);
		assertEquals(200, m.add());
	}
}
