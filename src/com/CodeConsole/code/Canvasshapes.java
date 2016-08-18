package com.CodeConsole.code;

public class Canvasshapes {
	
	String[][] canvasBorder;
	
	int w, h;
	
	public void createCanvas(int w, int h) {
		h+=2;
		w+=2;
		this.w = w;
		this.h = h;
		canvasBorder = new String[h][w];
		drawBorder(0, 0, this.w-1, 0, "-");
		drawBorder(0, this.h-1, this.w-1, this.h-1, "-");
		drawBorder(0, 1, 0, this.h-2, "|");
		drawBorder(this.w-1, 1, this.w-1, this.h-2, "|");
	}
	
	public void drawBorder(int x1, int y1, int x2, int y2, String symbol) {
		for(int i=y1; i<=y2; i++) {
			for(int j=x1; j<=x2; j++) {
				canvasBorder[i][j] = symbol;
				}
			}
		}
	
	public void drawLine(int x1, int y1, int x2, int y2) {
		for(int i=y1; i<=y2; i++) {
			for(int j=x1; j<=x2; j++) {
				canvasBorder[i][j]= "x";
				}
			}
		}
	public void drawRectanle(int x1, int y1, int x2, int y2){
		drawLine(x1,y1,x2,y1);
		drawLine(x2,y1,x2,y2);
		drawLine(x2,y2,x1,y2);
		drawLine(x1,y2,x1,y1);
	}
	
	public void bucketFill(int x, int y, String color)throws NumberFormatException, InterruptedException{
		try {
			checkifnull();
			if(Integer.parseInt(canvasBorder[y][x])!=0)
				return;
			if(x > 0 || x < this.h || y > 0 || y  < this.w) {
					if(Integer.parseInt(canvasBorder[y][x]) == 0){
						canvasBorder[y][x] = color;
						bucketFill(x+1,y, color);
						bucketFill(x-1,y, color);
						bucketFill(x,y-1, color);
						bucketFill(x,y+1, color);
			}
			}
		} catch (Exception e) {
			
		}
		
    }

    private void checkifnull(){
    	for(int i=0;i<this.h;i++) {
			for(int j=0;j<this.w;j++) {
			if(canvasBorder[i][j]!= "-" && canvasBorder[i][j] != "|" && canvasBorder[i][j]!= "x" && canvasBorder[i][j] == null){
				 canvasBorder[i][j] = String.valueOf(0);
			}
			}
    	}
    }

	public void display() {		
		for(int i=0;i<this.h;i++) {
			for(int j=0;j<this.w;j++) {
			System.out.print((canvasBorder[i][j] == null) ? " " : canvasBorder[i][j]);
			getCanvasBorder(canvasBorder[i][j]);
			}
			System.out.println();
		}
	}
	
	public String getCanvasBorder(String canvasBorder2){
		return canvasBorder[w][h];
		
	}

}
