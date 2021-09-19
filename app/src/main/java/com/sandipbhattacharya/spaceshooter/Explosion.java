package com.sandipbhattacharya.spaceshooter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Explosion {
    Bitmap explosion[] = new Bitmap[9];
    int explosionFrame;
    int eX, eY;

    public Explosion(Context context, int eX, int eY) {
        explosion[0] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.explosion0);
        explosion[1] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.explosion1);
        explosion[2] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.explosion2);
        explosion[3] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.explosion3);
        explosion[4] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.explosion4);
        explosion[5] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.explosion5);
        explosion[6] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.explosion6);
        explosion[7] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.explosion7);
        explosion[8] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.explosion8);
        explosionFrame = 0;
        this.eX = eX;
        this.eY = eY;
    }

    public Bitmap getExplosion(int explosionFrame){
        return explosion[explosionFrame];
    }
}
