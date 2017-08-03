package com.hocrox.worldwidecdln.imdrivertest;

import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.hocrox.worldwidecdln.R;
import com.hocrox.worldwidecdln.imdriver.Fragments.HomeActivtiy;
import com.hocrox.worldwidecdln.imdriver.History.HistoryListfragment;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;


/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */


@RunWith(AndroidJUnit4.class)

public class imdriverHistoryListfragment {

    public FragmentManager fragmentManager;

    @Before
    public void init() {

        FragmentTransaction fragmentTransaction = homeActivtiyActivityTestRule.getActivity()
                .getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fl_container, new HistoryListfragment());
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        fragmentTransaction.commit();
    }


    @Rule
    public ActivityTestRule<HomeActivtiy> homeActivtiyActivityTestRule = new ActivityTestRule<HomeActivtiy>(HomeActivtiy.class);


    @Test
    public void useAppContext() throws Exception {


        onView(withId(R.id.rl_history)).perform(RecyclerViewActions.actionOnItemAtPosition(2,

                new ViewAction() {
                    @Override
                    public Matcher<View> getConstraints() {
                        return null;
                    }

                    @Override
                    public String getDescription() {
                        return null;
                    }

                    @Override
                    public void perform(UiController uiController, View view) {

                        View views = view.findViewById(R.id.ll_root);
                        views.performClick();



                    }
                }));


       onView(withId(R.id.tvClose)).perform(click());

    }
}
