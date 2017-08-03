package com.hocrox.worldwidecdln;

import android.app.Activity;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.runner.lifecycle.ActivityLifecycleMonitorRegistry;

import com.hocrox.worldwidecdln.authentication.LoginSignUpActivity;
import com.hocrox.worldwidecdln.authentication.SignActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Collection;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.runner.lifecycle.Stage.RESUMED;
import static junit.framework.Assert.assertTrue;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class LoginSignUpTest {

    @Rule
    public ActivityTestRule<LoginSignUpActivity> splashActivityActivityTestRule = new ActivityTestRule<LoginSignUpActivity>(LoginSignUpActivity.class);


    @Test
    public void useAppContext() throws Exception {


        onView(withId(R.id.btnSignIn)).perform(click());

        Activity activity = getActivityInstance();

        boolean value=activity instanceof SignActivity;

        if(value){

            assertTrue(value);
        }
        else
            assertTrue(value);

    }

    public Activity getActivityInstance() {
        final Activity[] activity = new Activity[1];
        InstrumentationRegistry.getInstrumentation().runOnMainSync(new Runnable() {
            public void run() {
                Activity currentActivity = null;
                Collection resumedActivities = ActivityLifecycleMonitorRegistry.getInstance().getActivitiesInStage(RESUMED);
                if (resumedActivities.iterator().hasNext()) {
                    currentActivity = (Activity) resumedActivities.iterator().next();
                    activity[0] = currentActivity;
                }
            }
        });

        return activity[0];
    }
}
