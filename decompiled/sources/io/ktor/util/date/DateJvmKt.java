package io.ktor.util.date;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a=\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0002*\u00020\u000e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u001c\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "timestamp", "Lio/ktor/util/date/GMTDate;", "GMTDate", "(Ljava/lang/Long;)Lio/ktor/util/date/GMTDate;", "", "seconds", "minutes", "hours", "dayOfMonth", "Lio/ktor/util/date/Month;", "month", "year", "(IIIILio/ktor/util/date/Month;I)Lio/ktor/util/date/GMTDate;", "Ljava/util/Calendar;", "toDate", "(Ljava/util/Calendar;Ljava/lang/Long;)Lio/ktor/util/date/GMTDate;", "Ljava/util/Date;", "toJvmDate", "(Lio/ktor/util/date/GMTDate;)Ljava/util/Date;", "getTimeMillis", "()J", "Ljava/util/TimeZone;", "kotlin.jvm.PlatformType", "GMT_TIMEZONE", "Ljava/util/TimeZone;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateJvmKt {
    private static final TimeZone GMT_TIMEZONE = TimeZone.getTimeZone("GMT");

    public static final GMTDate GMTDate(Long l7) {
        Calendar calendar = Calendar.getInstance(GMT_TIMEZONE, Locale.ROOT);
        l.c(calendar);
        return toDate(calendar, l7);
    }

    public static /* synthetic */ GMTDate GMTDate$default(Long l7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l7 = null;
        }
        return GMTDate(l7);
    }

    public static final long getTimeMillis() {
        return System.currentTimeMillis();
    }

    public static final GMTDate toDate(Calendar calendar, Long l7) {
        l.f("<this>", calendar);
        if (l7 != null) {
            calendar.setTimeInMillis(l7.longValue());
        }
        return new GMTDate(calendar.get(13), calendar.get(12), calendar.get(11), WeekDay.INSTANCE.from((calendar.get(7) + 5) % 7), calendar.get(5), calendar.get(6), Month.INSTANCE.from(calendar.get(2)), calendar.get(1), calendar.getTimeInMillis() + calendar.get(16) + calendar.get(15));
    }

    public static final Date toJvmDate(GMTDate gMTDate) {
        l.f("<this>", gMTDate);
        return new Date(gMTDate.getTimestamp());
    }

    public static final GMTDate GMTDate(int i7, int i8, int i9, int i10, Month month, int i11) {
        l.f("month", month);
        Calendar calendar = Calendar.getInstance(GMT_TIMEZONE, Locale.ROOT);
        l.c(calendar);
        calendar.set(1, i11);
        calendar.set(2, month.ordinal());
        calendar.set(5, i10);
        calendar.set(11, i9);
        calendar.set(12, i8);
        calendar.set(13, i7);
        calendar.set(14, 0);
        return toDate(calendar, null);
    }
}
