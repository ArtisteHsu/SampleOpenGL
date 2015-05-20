package com.example.mobile.sampleopengl;

import android.content.res.Resources;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class SampleGLRenderer implements GLSurfaceView.Renderer {
    private Resources resources;
    private SampleGLTriangle mTriangle;
    private SampleGLTexture mTexture;
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        // Set background color
        gl.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);

        mTriangle = new SampleGLTriangle();
        mTexture = new SampleGLTexture(gl, resources);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        // Redraw background color
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        //mTriangle.draw();
        mTexture.draw(gl);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {

    }

    public SampleGLRenderer(Resources res) {
        resources = res;
    }
}
