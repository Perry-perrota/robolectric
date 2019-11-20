package com.obaradev.second;

import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;


@RunWith(RobolectricTestRunner.class)
public class UsersActivityTest {
    private UsersActivity activity;

    @Before
    public void setUp() {
        activity=Robolectric.setupActivity(UsersActivity.class);
    }
    @Test
    public void checkTextViewContentsTest(){
        TextView usersTextView=activity.findViewById(R.id.usersTextView);
        assertEquals("Here are the close by locations:null",usersTextView.getText().toString());
    }
}