package com.CodeConsole.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DrawingApplication {

	static Canvas canvas;
	static Map<Integer, Commands> map ;
	
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		String command = new String();
		while(!command.equals("Q")) {
			System.out.print("Enter command:");
			command = scan.nextLine();
			mapCommands();
			draw(command);
		}
		System.out.println("Exiting Program");
		scan.close();
	}
	
	private static void mapCommands() {
		map = new HashMap<Integer, Commands>();
		map.put(0,Commands.C);
		map.put(1,Commands.L);
		map.put(2,Commands.R);
		map.put(3,Commands.B);
		map.put(4,Commands.Q);
	}

	private static void draw(String command){
		if(String.valueOf(command.charAt(0)).equals(map.get(0).toString())){
					String[] cmd = command.split(" ");
					canvas = new Canvas();
					canvas.createCanvas(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]));
					canvas.display();
		}
		if(String.valueOf(command.charAt(0)).equals(map.get(1).toString())){
			String[] cmd = command.split(" ");
			canvas.drawBorder(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]), Integer.parseInt(cmd[3]),Integer.parseInt(cmd[4]),"X");
			canvas.display();
		}
    }
} 
		


