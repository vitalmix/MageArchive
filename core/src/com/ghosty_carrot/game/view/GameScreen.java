package com.ghosty_carrot.game.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.ghosty_carrot.game.model.Char;

public class GameScreen implements Screen {

    private Texture CharTexture;
    private SpriteBatch batch;
    private Char aChar;

    @Override
    public void show() {

        batch = new SpriteBatch();
        CharTexture = new Texture("Guide.png");
        aChar = new Char(CharTexture,50,0,400,400);

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        aChar.draw(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {  //Переход в меню

    }

    @Override
    public void dispose() {
        CharTexture.dispose();
        batch.dispose();
    }
}
