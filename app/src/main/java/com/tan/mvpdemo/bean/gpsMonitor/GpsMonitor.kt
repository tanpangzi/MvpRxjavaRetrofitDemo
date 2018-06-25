package com.tan.mvpdemo.bean.gpsMonitor

/**
 * <br> Description
 * <br> Author: 谭俊
 * <br> PackageName com.tan.mvpdemo.bean.gpsMonitor
 * <br> Date: 2018/6/22
 * <br> Copyright: Copyright © 2016 xTeam Technology. All rights reserved.
 */
class GpsMonitor {

    data class HomeBean(val invalid :String,
                        val sum : String,
                        val offline: String,
                        val online : String,
                        val returnList: ArrayList<GpsMonitorHomeListBean>)

    data class GpsMonitorHomeListBean(val orgId : String,//机构id
                                      val invalid : String, //失效个数
                                      val sum : String,//当前门店总数
                                      val orgName : String,//机构名称
                                      val offline : String, //当前门店下线
                                      val online : String) //当前门店上线
}