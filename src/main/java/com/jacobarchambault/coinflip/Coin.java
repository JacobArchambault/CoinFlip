package com.jacobarchambault.coinflip;

import java.util.Random;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Coin extends ImageView {

	Image heads;
	Random random;
	Image tails;

	Coin(final Image heads, final Image tails, final Random random) {
		this.heads = heads;
		this.tails = tails;
		this.random = random;
	}

	void flip() {
		setImage(random.nextInt(2) == 0 ? heads : tails);
	}
}
