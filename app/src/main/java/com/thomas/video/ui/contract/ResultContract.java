package com.thomas.video.ui.contract;

import com.thomas.core.mvp.IBaseMvpModel;
import com.thomas.core.mvp.IBaseMvpView;
import com.thomas.video.bean.SearchResultBean;
import com.yanzhenjie.kalle.simple.SimpleCallback;

import java.util.List;

/**
 * @author Thomas
 * @describe
 * @date 2020/1/9
 * @updatelog
 * @since
 */
public interface ResultContract {
    interface Model extends IBaseMvpModel {
        void getData(int currentPage, String key, SimpleCallback<String> callback);
    }

    interface View extends IBaseMvpView {
        void getDataSuccess(List<SearchResultBean.DataBean> succeed);
        void getDataEmpty();
        void hasMoreData(boolean hasMoreData);
    }

    interface Presenter {
        void getData(int currentPage, String key);
    }
}
