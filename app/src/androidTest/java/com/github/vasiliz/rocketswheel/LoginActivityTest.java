package com.github.vasiliz.rocketswheel;

import android.content.Intent;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;

import com.github.vasiliz.rocketswheel.userAuth.view.LoginActivity;

import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class LoginActivityTest {

    public ActivityTestRule<LoginActivity> mActivityTestRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void testLoginActivity() {
        mActivityTestRule.launchActivity(new Intent());

        final ViewInteraction checkButton = onView(withId(R.id.send_auth_data));
        checkButton.check(matches(isDisplayed()));
        checkButton.check(matches(isClickable()));
        checkButton.perform(click());

        final ViewInteraction checkTextEdit = onView(withId(R.id.set_login_view));
        checkTextEdit.check(matches(isEnabled()));
        checkTextEdit.check(matches(isDisplayed()));
        checkTextEdit.perform(typeText("user name"));

    }

}