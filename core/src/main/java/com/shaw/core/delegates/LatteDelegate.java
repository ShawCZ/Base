package com.shaw.core.delegates;

/**
 * Created by shaw on 2017/8/31.
 */

public abstract class LatteDelegate extends BaseDelegate {

    @SuppressWarnings("unchecked")
    public <T extends LatteDelegate> T getParentDelegate() {
        return (T) getParentFragment();
    }
}
