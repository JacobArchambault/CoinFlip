package com.jacobarchambault.coinflip;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Coin extends ImageView {

	Image heads;
	Image tails;
	Random random;

	Coin(Image heads, Image tails, Random random) {
		this.heads = heads;
		this.tails = tails;
		this.random = random;
	}

	void flip() {
		setImage(random.nextInt(2) == 0 ? heads : tails);
	}
}
