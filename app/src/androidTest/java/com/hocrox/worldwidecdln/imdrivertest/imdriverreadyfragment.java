package com.hocrox.worldwidecdln.imdrivertest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.hocrox.worldwidecdln.R;
import com.hocrox.worldwidecdln.imdriver.Fragments.HomeActivtiy;
import com.hocrox.worldwidecdln.imdriver.Fragments.ReadyDriverFragment;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */


@RunWith(AndroidJUnit4.class)

public class imdriverreadyfragment {

    public FragmentManager fragmentManager;

    @Before
    public void init() {
        FragmentTransaction fragmentTransaction = homeActivtiyActivityTestRule.getActivity()
                .getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fl_container, new ReadyDriverFragment());
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        fragmentTransaction.commit();
    }


    @Rule
    public ActivityTestRule<HomeActivtiy> homeActivtiyActivityTestRule = new ActivityTestRule<HomeActivtiy>(HomeActivtiy.class);


    @Test
    public void useAppContext() throws Exception {


      /*  wait(3000);
        boolean value=fragmentManager.findFragmentByTag("com.hocrox.worldwidecdln.imdriver.Fragments.HomeFragment").isVisible();

        Log.e("testing",""+value);
*/


        onView(withId(R.id.tvOnDuty)).perform(click());
        onView(withId(R.id.ivBackArrow)).perform(click());
        onView(withId(R.id.tvInfo)).perform(click());
        onView(withId(R.id.ivBackArrow)).perform(click());
        onView(withId(R.id.tvStartPur)).perform(click());
        onView(withId(R.id.ivBackArrow)).perform(click());
        onView(withId(R.id.tvVehicles)).perform(click());

        onView(withText("Add-on Trailer")).check(matches(isDisplayed()));
        onView(withId(R.id.tvName)).perform(click());


        onView(withText("Submit New Trailer")).check(matches(isDisplayed()));
        onView(withId(R.id.tvName)).perform(click());

        onView(withId(R.id.ivBackArrow)).perform(click());
        onView(withId(R.id.tvPostedTrips)).perform(click());

        onView(withId(R.id.ivBackArrow)).perform(click());


        onView(withId(R.id.tvAddItems)).perform(click());
        onView(withId(R.id.tvName)).perform(click());



    }


}
