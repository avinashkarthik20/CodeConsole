package com.CodeConsole.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DrawingApplication {

	static Canvasshapes canvas;
	static Map<Integer, Commands> map ;
	
	public static void main(String[] args) throws NumberFormatException, InterruptedException {		
		Scanner scan = new Scanner(System.in);
		String command = new String();
		while(!command.equals(Commands.Q)) {
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
	}

	private static void draw(String command) throws NumberFormatException, InterruptedException{
		
		try {
			if(String.valueOf(command.charAt(0)).equals(map.get(0).toString())){
						String[] cmd = command.split(" ");
						canvas = new Canvasshapes();
						canvas.createCanvas(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]));
						canvas.display();
			}
			if(String.valueOf(command.charAt(0)).equals(map.get(1).toString())){
				if (canvas == null)
					System.out.println("No canvas");
				String[] cmd = command.split(" ");
				canvas.drawBorder(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]), Integer.parseInt(cmd[3]),Integer.parseInt(cmd[4]),"X");
				canvas.display();
			}
			if(String.valueOf(command.charAt(0)).equals(map.get(2).toString())){
				if (canvas == null)
					System.out.println("No canvas");
				String[] cmd = command.split(" ");
				canvas.drawBorder(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]), Integer.parseInt(cmd[3]),Integer.parseInt(cmd[4]),"X");
				canvas.display();
			}
			if(String.valueOf(command.charAt(0)).equals(map.get(3).toString())){
				if (canvas == null)
					System.out.println("No canvas");
				String[] cmd = command.split(" ");
				canvas.bucketFill(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]), cmd[3]);
				canvas.display();
			}
		} catch (Exception e) {
			
		}
    }
} 
		


