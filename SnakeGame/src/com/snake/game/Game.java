package com.snake.game;

import java.awt.Graphics;

public interface Game {
	public void move();
	public void checkHit();
	public void addFood();
	public void checkFood();
	public void playGame();
	public void draw(Graphics graphics);
	public void gameOver(Graphics graphics);
	
}
