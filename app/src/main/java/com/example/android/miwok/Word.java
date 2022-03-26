package com.example.android.miwok;

public class Word {



private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = no_image_provider;
    private static final int no_image_provider = -1;

    public Word(String defaultTranslation, String miwokTranslation)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId)

    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }
    public String getMMiwokTranslation()
    {
        return mMiwokTranslation;
    }
    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    public boolean hasImage()
    {
    return mImageResourceId != no_image_provider;
    }

}
