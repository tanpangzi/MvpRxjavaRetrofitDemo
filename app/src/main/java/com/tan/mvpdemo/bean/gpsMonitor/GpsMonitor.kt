package com.tan.mvpdemo.bean.gpsMonitor

/**
 * <br> Description
 * <br> Author: 谭俊
 * <br> PackageName com.tan.mvpdemo.bean.gpsMonitor
 * <br> Date: 2018/6/22
 * <br> Copyright: Copyright © 2016 xTeam Technology. All rights reserved.
 */
class GpsMonitor {
    data class GpsMonitorHomeListBean(val orgId : String,
                                      val invalid : String,
                                      val sum : String,
                                      val orgName : String,
                                      val offline : String,
                                      val online : String)
}