package com.hocrox.worldwidecdln.imdrivertest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.hocrox.worldwidecdln.R;
import com.hocrox.worldwidecdln.imdriver.Fragments.HomeActivtiy;
import com.hocrox.worldwidecdln.imdriver.Fragments.OnDutyFragment;

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

public class imdriverOnDutyfragment {

    public FragmentManager fragmentManager;

    @Before
    public void init() {
        FragmentTransaction fragmentTransaction = homeActivtiyActivityTestRule.getActivity()
                .getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fl_container, new OnDutyFragment());
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

      onView(withId(R.id.btnHistory)).perform(click());



    }


}
