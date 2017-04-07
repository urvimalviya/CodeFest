package com.journaldev.viewpager;

public enum ModelObject {

    TRAINING(R.string.red, R.layout.view_training),
    NUTRITION(R.string.blue, R.layout.view_nutrition);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}
