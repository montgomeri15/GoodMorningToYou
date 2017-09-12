package com;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class GetTimeTest {

    DateFormat date_format = new SimpleDateFormat("HH:mm");

    public void TestTime(String time, GetTime.RightTime neededTime) throws Exception {
        Date date = date_format.parse(time);
        GetTime.RightTime timeBorder = GetTime.Time(date);
        assertEquals(timeBorder, neededTime);
    }

    @Test
    public void morning1() throws Exception {
        TestTime("06:00", GetTime.RightTime.Morning);
    }

    @Test
    public void morning2() throws Exception{
        TestTime("08:59", GetTime.RightTime.Morning);
    }

    @Test
    public void day1() throws Exception{
        TestTime("09:00", GetTime.RightTime.Day);
    }

    @Test
    public void day2() throws Exception{
        TestTime("18:59", GetTime.RightTime.Day);
    }

    @Test
    public void evening1() throws Exception{
        TestTime("19:00", GetTime.RightTime.Evening);
    }

    @Test
    public void evening2() throws Exception{
        TestTime("22:59", GetTime.RightTime.Evening);
    }

    @Test
    public void night1() throws Exception{
        TestTime("23:00", GetTime.RightTime.Night);
    }

    @Test
    public void night2() throws Exception{
        TestTime("05:59", GetTime.RightTime.Night);
    }
}