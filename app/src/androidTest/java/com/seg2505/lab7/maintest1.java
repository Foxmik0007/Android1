package com.seg2505.lab7;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class maintest1 {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void emailIsInvalid(){
    onView(withId(R.id.username)).perform(typeText("user"), closeSoftKeyboard());
    onView(withId(R.id.Lastname)).perform(typeText("test"), closeSoftKeyboard());
    onView(withId(R.id.email)).perform(typeText("email@"), closeSoftKeyboard());
    onView(withId(R.id.loginBtn)).perform(click());
    onView(withText("Invalid Email")).check(matches(isDisplayed()));

    }
}
