package org.bautista.ag.api.objects;

import org.bautista.ag.api.locatable.Position;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.image.Image;

public abstract class Sprite extends GameObject implements EventHandler<Event>{

	public Sprite(Image image, Position position) {
		super(image, position, true);
	}

}