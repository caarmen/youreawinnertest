/*
 * Copyright 2013 Carmen Alvarez
 *
 * This file is part of You're a Winner!.
 *
 * You're a Winner! is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * You're a Winner! is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with You're a Winner!.  If not, see <http://www.gnu.org/licenses/>.
 */
package ca.rmen.youreawinner.test;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import ca.rmen.youreawinner.MainActivity;
import ca.rmen.youreawinner.R;

import com.jayway.android.robotium.solo.Solo;

/**
 * Robotium automation for You're a Winner!
 * 
 * @author Carmen Alvarez
 * 
 */
public class YoureAWinnerTest extends
		ActivityInstrumentationTestCase2<MainActivity> {

	private Solo solo;

	public YoureAWinnerTest() {
		super(MainActivity.class);
	}

	@Override
	public void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}

	/**
	 * Simple scenario to tap the button and toggle the sound.
	 * 
	 * @throws Exception
	 */
	public void testScenario1() throws Exception {
		// tap the button
		tapButton(3);
		// toggle sound
		solo.clickOnActionBarItem(R.id.menu_sound);
		// tap the button
		tapButton(5);
		// toggle sound
		solo.clickOnActionBarItem(R.id.menu_sound);
		// tap the button
		tapButton(1000);
	}

	/**
	 * Tap the button a number of times.
	 * 
	 * @param tapCount
	 *            the number of times to tap the button.
	 */
	private void tapButton(int tapCount) {
		View buttonView = solo.getView(R.id.button);
		for (int i = 0; i < tapCount; i++)
			solo.clickOnView(buttonView);
	}

	@Override
	public void tearDown() throws Exception {
		// solo.finishOpenedActivities();
	}
}
