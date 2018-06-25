package com.tan.mvpdemo.activity

import com.tan.mvpdemo.R
import com.tan.mvpdemo.uitl.TitleView
import com.tan.mvpdemo.widget.AutoBgButton
import com.tan.mvpdemo.widget.AutoBgTextView
import org.jetbrains.anko.find

/**
 * <br> Description 设置界面
 * <br> Author: 谭俊
 * <br> PackageName com.tan.mvpdemo.activity
 * <br> Date: 2018/6/25
 * <br> Copyright: Copyright © 2016 xTeam Technology. All rights reserved.
 */
class SettingActivity : BaseActivity() {

    /** 标题 */
    var title_view : TitleView ?= null
    /** 修改密码 */
    var txt_edit_password : AutoBgTextView ?= null
    /** 检查更新 */
    var txt_check_version : AutoBgTextView ?= null
    /** 退出登录 */
    var btn_login_out : AutoBgButton ?= null

    override fun getContentViewId(): Int {
        return R.layout.activity_setting
    }

    override fun findViews() {
        title_view = find(R.id.title_view)
        txt_edit_password = find(R.id.txt_edit_password)
        txt_check_version = find(R.id.txt_check_version)
        btn_login_out = find(R.id.btn_login_out)
    }

    override fun initGetData() {
    }

    override fun init() {
    }

    override fun widgetListener() {
        btn_login_out!!.setOnClickListener {  }
    }
}