package com.tan.mvpdemo.activity.gpsMonitor

import com.tan.mvpdemo.R
import com.tan.mvpdemo.activity.BaseActivity
import com.tan.mvpdemo.uitl.TitleView
import com.tan.mvpdemo.widget.AutoBgButton
import com.tan.mvpdemo.widget.DYTEditText
import com.tan.mvpdemo.widget.pullview.PullToRefreshListView
import org.jetbrains.anko.find

/**
 * <br> Description GPS监控 门店设备列表数据
 * <br> Author: 谭俊
 * <br> PackageName com.tan.mvpdemo.activity.gpsMonitor
 * <br> Date: 2018/6/26
 * <br> Copyright: Copyright © 2016 xTeam Technology. All rights reserved.
 */
class GpsMonitorStoryActivity : BaseActivity<T>() {

    /** 标题 */
    private var title_view : TitleView ?= null
    /** 搜索框 */
    private var et_search : DYTEditText?= null
    /** 搜索按钮 */
    private var btn_search : AutoBgButton ?= null
    /** 列表 */
    private var lv_base : PullToRefreshListView?= null
    /** 报警信息查看按钮 */
    private var btn_see : AutoBgButton ?= null

    /** 当前加载页码  */
    private var pageNum = 1
    private var storyId = ""
    private var storyName = ""

    /** true 超级管理员  */
    private var isAdmin = true
    /** true 一进页面就加载数据  */
    private var isShowData = true
    /** 搜索的内容  */
    private var searchStr = ""


    override fun getContentViewId(): Int {
        return R.layout.activity_gps_monitor_story
    }

    override fun findViews() {
        title_view = find(R.id.title_view)
        et_search = find(R.id.et_search)
        btn_search = find(R.id.btn_search)
        lv_base = find(R.id.lv_base)
        btn_see = find(R.id.btn_see)
    }

    override fun initGetData() {
        var bundle = intent.extras
        if (bundle != null){

        }

    }

    override fun init() {
        title_view!!.setLeftBtnImg()
    }

    override fun widgetListener() {

    }



}