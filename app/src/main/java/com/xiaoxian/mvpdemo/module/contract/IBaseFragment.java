package com.xiaoxian.mvpdemo.module.contract;

/**
 * Created by Administrator on 2016/10/5.
 */
public interface IBaseFragment<T> {
    void setPresenter(T mIFragmentPresenter);
}
