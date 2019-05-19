package com.appjishu.starzone.ui.viewholder;

import android.support.annotation.NonNull;
import android.view.View;

/**
 * Created by liushaoming on 2016/11/1.
 *
 * 抽象出的vh接口
 */

public interface BaseMomentVH<T> {

    void onFindView(@NonNull View rootView);

    void onBindDataToView(@NonNull final T data,int position,int viewType);
}
