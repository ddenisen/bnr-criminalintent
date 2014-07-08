package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by dmitry on 7/8/14.
 */

public class Crime {

    private final UUID mId;
    private String mTitle;

    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }
}
