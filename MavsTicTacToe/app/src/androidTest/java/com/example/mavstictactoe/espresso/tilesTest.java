package com.example.mavstictactoe.espresso;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static org.hamcrest.Matchers.allOf;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import com.example.mavstictactoe.MainActivity;
import com.example.mavstictactoe.R;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class tilesTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void tilesTest() {
        ViewInteraction imageView = onView(
                Matchers.allOf(ViewMatchers.withId(R.id.imageView0), withContentDescription("tictactoe0"),
                        withParent(withParent(withId(R.id.linearLayout))),
                        isDisplayed()));
        imageView.check(matches(isDisplayed()));

        ViewInteraction imageView2 = onView(
                allOf(withId(R.id.imageView1), withContentDescription("tictactoe1"),
                        withParent(withParent(withId(R.id.linearLayout))),
                        isDisplayed()));
        imageView2.check(matches(isDisplayed()));

        ViewInteraction imageView3 = onView(
                allOf(withId(R.id.imageView2), withContentDescription("tictactoe2"),
                        withParent(withParent(withId(R.id.linearLayout))),
                        isDisplayed()));
        imageView3.check(matches(isDisplayed()));

        ViewInteraction imageView4 = onView(
                allOf(withId(R.id.imageView3), withContentDescription("tictactoe3"),
                        withParent(withParent(withId(R.id.linearLayout))),
                        isDisplayed()));
        imageView4.check(matches(isDisplayed()));

        ViewInteraction imageView5 = onView(
                allOf(withId(R.id.imageView4), withContentDescription("tictactoe4"),
                        withParent(withParent(withId(R.id.linearLayout))),
                        isDisplayed()));
        imageView5.check(matches(isDisplayed()));

        ViewInteraction imageView6 = onView(
                allOf(withId(R.id.imageView5), withContentDescription("tictactoe5"),
                        withParent(withParent(withId(R.id.linearLayout))),
                        isDisplayed()));
        imageView6.check(matches(isDisplayed()));

        ViewInteraction imageView7 = onView(
                allOf(withId(R.id.imageView6), withContentDescription("tictactoe6"),
                        withParent(withParent(withId(R.id.linearLayout))),
                        isDisplayed()));
        imageView7.check(matches(isDisplayed()));

        ViewInteraction imageView8 = onView(
                allOf(withId(R.id.imageView7), withContentDescription("tictactoe7"),
                        withParent(withParent(withId(R.id.linearLayout))),
                        isDisplayed()));
        imageView8.check(matches(isDisplayed()));

        ViewInteraction imageView9 = onView(
                allOf(withId(R.id.imageView8), withContentDescription("tictactoe8"),
                        withParent(withParent(withId(R.id.linearLayout))),
                        isDisplayed()));
        imageView9.check(matches(isDisplayed()));

        ViewInteraction imageView10 = onView(
                allOf(withId(R.id.imageView8), withContentDescription("tictactoe8"),
                        withParent(withParent(withId(R.id.linearLayout))),
                        isDisplayed()));
        imageView10.check(matches(isDisplayed()));
    }
}
