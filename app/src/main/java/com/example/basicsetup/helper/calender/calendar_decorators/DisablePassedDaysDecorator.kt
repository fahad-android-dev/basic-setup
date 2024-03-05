package com.example.basicsetup.helper.calendar_decorators

import android.content.Context
import android.text.style.ForegroundColorSpan
import androidx.core.content.ContextCompat
import com.example.basicsetup.R
import com.example.basicsetup.helper.Constants
import com.example.basicsetup.helper.CustomTypefaceSpan
import com.example.basicsetup.helper.Global
import com.prolificinteractive.materialcalendarview.CalendarDay
import com.prolificinteractive.materialcalendarview.DayViewDecorator
import com.prolificinteractive.materialcalendarview.DayViewFacade

class DisablePassedDaysDecorator(private val context: Context, private var date: CalendarDay?) : DayViewDecorator {
    init {
        date = CalendarDay.today()
    }

    override fun shouldDecorate(day: CalendarDay): Boolean {
        return date != null && day.isBefore(date!!)
    }

    override fun decorate(view: DayViewFacade) {
        view.setDaysDisabled(true) //disable all days
        view.addSpan(ForegroundColorSpan(ContextCompat.getColor(context, R.color.divider_line_color_grey)))
        view.addSpan(CustomTypefaceSpan("", Global.getTypeFace(context, Constants.fontRegular)))
        ContextCompat.getDrawable(context, R.drawable.bg_circle_calendar_disabled)?.let { view.setBackgroundDrawable(it) }
    }
}
