package com.CodeConsole.code.test;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.core.IsCollectionContaining;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;


import com.CodeConsole.code.Canvasshapes;
import com.CodeConsole.code.Commands;
import com.CodeConsole.code.DrawingApplication;


public class DrawingApplicationTest {
	
	DrawingApplication drawapp = new DrawingApplication();
	Canvasshapes canvas = new Canvasshapes();
	Map<Integer, Commands> map = new HashMap<Integer, Commands>();
	
	@Test
	public void drawTest() throws NumberFormatException, InterruptedException{
		String s = "C 3 2";
	    DrawingApplication.mapCommands();
		DrawingApplication.draw(s);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void mapCommandsTest() {
		Map<Integer, Commands> Map1 = new HashMap<Integer, Commands>();
		map = DrawingApplication.mapCommands();
		Map1.put(0, Commands.C);
		Map1.put(1, Commands.L);
		Map1.put(2, Commands.R);
		Map1.put(3, Commands.B);
		assertThat((Map1),is(map));
		assertThat(Map1.size(), is(4));
		
	}
	}

