package com.java2.snowing;

import java.awt.Canvas;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class SnowFrame extends JFrame {
	public SnowFrame() {
		setSize(850, 650);
		setLocation(500, 200);
		add(Canvas);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);

	}

	public class SnowCanvas {
		List<Snow> snows = new ArrayList<>();

		public SnowCanvas() {
			for (int i = 0; i < 100; i++) {
				Snow snow = new Snow(SnowCanvas.this);
				snows.add(snow);

			}
		}

		@Override
		public void paint(Graphics g) {
			for (int i = 0; i < 100; i++) {
				Snow snow = snows.get(i);
				g.drawString(雪,snow x,snow y);

			}

		}

	}
}
