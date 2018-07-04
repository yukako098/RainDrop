package com.example.yuka.raindropsexercise;

import android.graphics.Paint;

// Class for A raindrop.
public class RainDrop {

    private float rainX;
    private float rainY;
    private float radius;

    public RainDrop(float rainX, float rainY, float radius) {
        this.rainX = rainX;
        this.rainY = rainY;
        this.radius = radius;
    }

    public float getRainX() {
        return rainX;
    }

    public void setRainX(float rainX) {
        this.rainX = rainX;
    }

    public float getRainY() {
        return rainY;
    }

    public void setRainY(float rainY) {
        this.rainY = rainY;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
