package com.CodeConsole.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DrawingApplication {

	static Canvas canvas;
	
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		String command = new String();
		while(!command.equals("Q")) {
			System.out.print("Enter command:");
			command = scan.nextLine();
			draw(command);
		}
		System.out.println("Exiting Program");
		scan.close();
	}
	
	private static void draw(String command){
		Map<Integer, Commands> map = new HashMap<Integer, Commands>();
		map.put(0, Commands.C);
		if(String.valueOf(command.charAt(0)).equals(map.get(0).toString())){
					String[] cmd = command.split(" ");
					canvas = new Canvas();
					canvas.createCanvas(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]));
					canvas.display();
		}
    }
} 
		


