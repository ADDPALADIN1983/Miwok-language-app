package com.example.alangregos.miwok;

public class ListEntry {
    private int mImage;
    private String mMiwokWord;
    private String mDefaultWord;

    public ListEntry(int imageFile, String miwok, String english){

        this.mImage = imageFile;
        this.mMiwokWord = miwok;
        this.mDefaultWord = english;

    }

    // get the image ID to the image resource for the word pair
    public int getImage(){
        return mImage;
    }

    // get the Miwok translation of the word pair
    public String getmMiwokWord(){
        return mMiwokWord;

    }

    //get the default language translation of the word pair
    public String getmDefaultWord() {
        return mDefaultWord;

    }


}
