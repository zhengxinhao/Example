package com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2017/11/26.
 */
public class DateBean {
    private String dateTime;
    private String week;
    private Calendar calendar = Calendar.getInstance();
    public String getDateTime() {
        Date currDate = Calendar.getInstance().getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        dateTime = simpleDateFormat.format(currDate);
        return dateTime;
    }
    public String getWeek() {
        String[] weeks = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};
        int index = calendar.get(Calendar.DAY_OF_WEEK);
        week = weeks[index - 1];
        return week;
    }
}
