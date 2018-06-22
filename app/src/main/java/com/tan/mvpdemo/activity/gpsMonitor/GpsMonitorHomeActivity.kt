package com.tan.mvpdemo.activity.gpsMonitor

import android.widget.ListView
import android.widget.TextView
import com.tan.mvpdemo.R
import com.tan.mvpdemo.activity.BaseActivity
import com.tan.mvpdemo.adapter.GpsMonitorHomeAdapter
import com.tan.mvpdemo.bean.gpsMonitor.GpsMonitor
import com.tan.mvpdemo.uitl.TitleView
import org.jetbrains.anko.find
import java.util.ArrayList

/**
 * <br> Description
 * <br> Author: 谭俊
 * <br> PackageName com.tan.mvpdemo.activity.gpsMonitor
 * <br> Date: 2018/6/22
 * <br> Copyright: Copyright © 2016 xTeam Technology. All rights reserved.
 */
class GpsMonitorHomeActivity : BaseActivity() {

    /** 标题 */
    var title_view : TitleView ?= null
    /** 总数 */
    var txt_total : TextView ?= null
    /** 在线数量 */
    var txt_on_line : TextView ?= null
    /** 失效数量 */
    var txt_invalid : TextView ?= null
    /** 离线数量 */
    var txt_off_line : TextView ?= null
    /** list控件 */
    var lv_base : ListView ?= null

    /** 适配器 */
    private var mAdapter : GpsMonitorHomeAdapter? = null

    /** 数量 */
    private var orderListBean = ArrayList<GpsMonitor.GpsMonitorHomeListBean>()

    override fun getContentViewId(): Int {
        return R.layout.activity_gps_monitor_home
    }

    override fun findViews() {
        title_view = find(R.id.title_view)
        txt_total = find(R.id.title_view)
        txt_on_line = find(R.id.txt_on_line)
        txt_invalid = find(R.id.txt_invalid)
        txt_off_line = find(R.id.txt_off_line)
        lv_base = find(R.id.lv_base)
    }

    override fun initGetData() {

    }

    override fun init() {
        title_view!!.setTitle("紫米星监控平台")
        title_view!!.setLeftBtnImg()
    }

    override fun widgetListener() {

    }


}