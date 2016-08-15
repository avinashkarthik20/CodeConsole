package com.CodeConsole.code;

public class Canvas {
	
	String[][] canvasBorder;
	
	int w, h;
	
	public void createCanvas(int w, int h) {
		h+=2;
		w+=2;
		this.w = w;
		this.h = h;
		canvasBorder = new String[h][w];
		drawLine(0, 0, this.w-1, 0, "-");
		drawLine(0, this.h-1, this.w-1, this.h-1, "-");
		drawLine(0, 1, 0, this.h-2, "|");
		drawLine(this.w-1, 1, this.w-1, this.h-2, "|");
	}
	private void drawLine(int x1, int y1, int x2, int y2, String symbol) {
		for(int i=y1; i<=y2; i++) {
			for(int j=x1; j<=x2; j++) {
				canvasBorder[i][j] = symbol;
				}
			}
		}	
		
	public void display() {		
		for(int i=0;i<this.h;i++) {
			for(int j=0;j<this.w;j++) {				 
				System.out.print((canvasBorder[i][j] == null) ? " " : canvasBorder[i][j]);
			}
			System.out.println();
		}
	}

}
