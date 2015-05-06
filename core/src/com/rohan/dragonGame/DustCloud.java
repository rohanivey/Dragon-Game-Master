package com.rohan.dragonGame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class DustCloud {
	private Texture img = new Texture(Gdx.files.internal("dust.png"));
	enum Direction {Left, Right}
	float velocity;
	Vector2 location;
	float timer = 1f;
	private SpriteBatch sb;
	
	DustCloud(String inputString, float inputX, float inputY)
	{
		switch(inputString)
		{
		case "Left":
				velocity = -0.2f;
			break;
		case "Right":
				velocity = 0.5f;
			break;
		default:
			break;
		
		}
		
		location = new Vector2(inputX, inputY);
		sb = new SpriteBatch();
		System.out.println("Made dust cloud");
	}
	
	public float getX(){return location.x;}
	public float getY(){return location.y;}
	public Texture getTexture(){return img;}

	public void update()
	{
		timer -= 0.1f;
		updateLocation();
	}
	
	public float getTimer()
	{
		return timer;
	}
	
	public void updateLocation()
	{
		location.x += velocity;
	}
	
	public void draw()
	{
		sb.begin();
		sb.setColor(0, 0, 0, timer);
		sb.draw(img, location.x, location.y);
		sb.end();
	}
}
