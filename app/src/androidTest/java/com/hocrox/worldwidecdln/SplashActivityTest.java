package com.hocrox.worldwidecdln;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class SplashActivityTest {

   @Rule
    ActivityTestRule<SplashActivity> splashActivityActivityTestRule=new ActivityTestRule<SplashActivity>(SplashActivity.class);



    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.



    }
}
