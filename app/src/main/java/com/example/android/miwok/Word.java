package com.example.android.miwok;

public class Word {



private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = no_image_provider;
    private static final int no_image_provider = -1;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResource)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResource;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResource)

    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResource;
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
    public int getAudioResource()
    {
        return mAudioResourceId;
    }

    public boolean hasImage()
    {
    return mImageResourceId != no_image_provider;
    }

}
