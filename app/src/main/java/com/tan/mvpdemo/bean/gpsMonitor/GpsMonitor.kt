package com.tan.mvpdemo.bean.gpsMonitor

/**
 * <br> Description
 * <br> Author: 谭俊
 * <br> PackageName com.tan.mvpdemo.bean.gpsMonitor
 * <br> Date: 2018/6/22
 * <br> Copyright: Copyright © 2016 xTeam Technology. All rights reserved.
 */
class GpsMonitor {
    /** gps 监控第一层*/
    /*****************************************/
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


    /**********************************/
    /** gps监控第二层 */
    data class GpsMonitorSotryBean(val status : String,
                                   val speed : String,
                                   val accState : String,
                                   val orgName : String,
                                   val type : String,
                                   val warning_name : String,
                                   val location_time : String,
                                   val driveStatus : String,
                                   val name : String,
                                   val carNumber : String,
                                   val imeiId : String,
                                   val warning_type : String,
                                   val beOnline : String,
                                   val online_status :String,
                                   val color : String)

}