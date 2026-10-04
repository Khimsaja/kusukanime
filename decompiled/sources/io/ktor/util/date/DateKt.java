package io.ktor.util.date;

import A5.a;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\u0004\u001a\u0011\u0010\n\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/util/date/GMTDate;", "", "milliseconds", "plus", "(Lio/ktor/util/date/GMTDate;J)Lio/ktor/util/date/GMTDate;", "minus", "LA5/a;", "duration", "plus-HG0u8IE", "minus-HG0u8IE", "truncateToSeconds", "(Lio/ktor/util/date/GMTDate;)Lio/ktor/util/date/GMTDate;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateKt {
    public static final GMTDate minus(GMTDate gMTDate, long j7) {
        l.f("<this>", gMTDate);
        return DateJvmKt.GMTDate(Long.valueOf(gMTDate.getTimestamp() - j7));
    }

    /* renamed from: minus-HG0u8IE, reason: not valid java name */
    public static final GMTDate m189minusHG0u8IE(GMTDate gMTDate, long j7) {
        l.f("$this$minus", gMTDate);
        return DateJvmKt.GMTDate(Long.valueOf(gMTDate.getTimestamp() - a.c(j7)));
    }

    public static final GMTDate plus(GMTDate gMTDate, long j7) {
        l.f("<this>", gMTDate);
        return DateJvmKt.GMTDate(Long.valueOf(gMTDate.getTimestamp() + j7));
    }

    /* renamed from: plus-HG0u8IE, reason: not valid java name */
    public static final GMTDate m190plusHG0u8IE(GMTDate gMTDate, long j7) {
        l.f("$this$plus", gMTDate);
        return DateJvmKt.GMTDate(Long.valueOf(a.c(j7) + gMTDate.getTimestamp()));
    }

    public static final GMTDate truncateToSeconds(GMTDate gMTDate) {
        l.f("<this>", gMTDate);
        return DateJvmKt.GMTDate(gMTDate.getSeconds(), gMTDate.getMinutes(), gMTDate.getHours(), gMTDate.getDayOfMonth(), gMTDate.getMonth(), gMTDate.getYear());
    }
}
