package io.ktor.util.date;

import J3.a;
import O3.j;
import V5.i;
import Y5.b;
import Z5.AbstractC0632e0;
import Z5.B;
import Z5.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p.AbstractC1755i;
import z1.c;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002FGBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Bg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b%\u0010&Jj\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0018\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001bJ\u001a\u0010.\u001a\u00020-2\b\u0010\u0015\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b<\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b?\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b@\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010#R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\bC\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bE\u0010&¨\u0006H"}, d2 = {"Lio/ktor/util/date/GMTDate;", "", "", "seconds", "minutes", "hours", "Lio/ktor/util/date/WeekDay;", "dayOfWeek", "dayOfMonth", "dayOfYear", "Lio/ktor/util/date/Month;", "month", "year", "", "timestamp", "<init>", "(IIILio/ktor/util/date/WeekDay;IILio/ktor/util/date/Month;IJ)V", "seen0", "LZ5/o0;", "serializationConstructorMarker", "(IIIILio/ktor/util/date/WeekDay;IILio/ktor/util/date/Month;IJLZ5/o0;)V", "other", "compareTo", "(Lio/ktor/util/date/GMTDate;)I", "copy", "()Lio/ktor/util/date/GMTDate;", "component1", "()I", "component2", "component3", "component4", "()Lio/ktor/util/date/WeekDay;", "component5", "component6", "component7", "()Lio/ktor/util/date/Month;", "component8", "component9", "()J", "(IIILio/ktor/util/date/WeekDay;IILio/ktor/util/date/Month;IJ)Lio/ktor/util/date/GMTDate;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "", "equals", "(Ljava/lang/Object;)Z", "self", "LY5/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LO3/C;", "write$Self$ktor_utils", "(Lio/ktor/util/date/GMTDate;LY5/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getSeconds", "getMinutes", "getHours", "Lio/ktor/util/date/WeekDay;", "getDayOfWeek", "getDayOfMonth", "getDayOfYear", "Lio/ktor/util/date/Month;", "getMonth", "getYear", "J", "getTimestamp", "Companion", "$serializer", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class GMTDate implements Comparable<GMTDate> {
    private static final O3.i[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final GMTDate START;
    private final int dayOfMonth;
    private final WeekDay dayOfWeek;
    private final int dayOfYear;
    private final int hours;
    private final int minutes;
    private final Month month;
    private final int seconds;
    private final long timestamp;
    private final int year;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/util/date/GMTDate$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lio/ktor/util/date/GMTDate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "START", "Lio/ktor/util/date/GMTDate;", "getSTART", "()Lio/ktor/util/date/GMTDate;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final GMTDate getSTART() {
            return GMTDate.START;
        }

        public final KSerializer serializer() {
            return GMTDate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        j jVar = j.f7525k;
        $childSerializers = new O3.i[]{null, null, null, c.B(jVar, new a(2)), null, null, c.B(jVar, new a(3)), null, null};
        START = DateJvmKt.GMTDate(0L);
    }

    public /* synthetic */ GMTDate(int i7, int i8, int i9, int i10, WeekDay weekDay, int i11, int i12, Month month, int i13, long j7, o0 o0Var) {
        if (511 != (i7 & 511)) {
            AbstractC0632e0.j(i7, 511, GMTDate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.seconds = i8;
        this.minutes = i9;
        this.hours = i10;
        this.dayOfWeek = weekDay;
        this.dayOfMonth = i11;
        this.dayOfYear = i12;
        this.month = month;
        this.year = i13;
        this.timestamp = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        WeekDay[] weekDayArrValues = WeekDay.values();
        l.f("values", weekDayArrValues);
        return new B("io.ktor.util.date.WeekDay", weekDayArrValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$0() {
        Month[] monthArrValues = Month.values();
        l.f("values", monthArrValues);
        return new B("io.ktor.util.date.Month", monthArrValues);
    }

    public static /* synthetic */ GMTDate copy$default(GMTDate gMTDate, int i7, int i8, int i9, WeekDay weekDay, int i10, int i11, Month month, int i12, long j7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i7 = gMTDate.seconds;
        }
        if ((i13 & 2) != 0) {
            i8 = gMTDate.minutes;
        }
        if ((i13 & 4) != 0) {
            i9 = gMTDate.hours;
        }
        if ((i13 & 8) != 0) {
            weekDay = gMTDate.dayOfWeek;
        }
        if ((i13 & 16) != 0) {
            i10 = gMTDate.dayOfMonth;
        }
        if ((i13 & 32) != 0) {
            i11 = gMTDate.dayOfYear;
        }
        if ((i13 & 64) != 0) {
            month = gMTDate.month;
        }
        if ((i13 & 128) != 0) {
            i12 = gMTDate.year;
        }
        if ((i13 & 256) != 0) {
            j7 = gMTDate.timestamp;
        }
        long j8 = j7;
        Month month2 = month;
        int i14 = i12;
        int i15 = i10;
        int i16 = i11;
        return gMTDate.copy(i7, i8, i9, weekDay, i15, i16, month2, i14, j8);
    }

    public static final /* synthetic */ void write$Self$ktor_utils(GMTDate self, b output, SerialDescriptor serialDesc) {
        O3.i[] iVarArr = $childSerializers;
        output.q(0, self.seconds, serialDesc);
        output.q(1, self.minutes, serialDesc);
        output.q(2, self.hours, serialDesc);
        output.j(serialDesc, 3, (KSerializer) iVarArr[3].getValue(), self.dayOfWeek);
        output.q(4, self.dayOfMonth, serialDesc);
        output.q(5, self.dayOfYear, serialDesc);
        output.j(serialDesc, 6, (KSerializer) iVarArr[6].getValue(), self.month);
        output.q(7, self.year, serialDesc);
        output.x(serialDesc, 8, self.timestamp);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSeconds() {
        return this.seconds;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMinutes() {
        return this.minutes;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHours() {
        return this.hours;
    }

    /* renamed from: component4, reason: from getter */
    public final WeekDay getDayOfWeek() {
        return this.dayOfWeek;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDayOfYear() {
        return this.dayOfYear;
    }

    /* renamed from: component7, reason: from getter */
    public final Month getMonth() {
        return this.month;
    }

    /* renamed from: component8, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* renamed from: component9, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final GMTDate copy(int seconds, int minutes, int hours, WeekDay dayOfWeek, int dayOfMonth, int dayOfYear, Month month, int year, long timestamp) {
        l.f("dayOfWeek", dayOfWeek);
        l.f("month", month);
        return new GMTDate(seconds, minutes, hours, dayOfWeek, dayOfMonth, dayOfYear, month, year, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GMTDate)) {
            return false;
        }
        GMTDate gMTDate = (GMTDate) other;
        return this.seconds == gMTDate.seconds && this.minutes == gMTDate.minutes && this.hours == gMTDate.hours && this.dayOfWeek == gMTDate.dayOfWeek && this.dayOfMonth == gMTDate.dayOfMonth && this.dayOfYear == gMTDate.dayOfYear && this.month == gMTDate.month && this.year == gMTDate.year && this.timestamp == gMTDate.timestamp;
    }

    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final WeekDay getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final int getDayOfYear() {
        return this.dayOfYear;
    }

    public final int getHours() {
        return this.hours;
    }

    public final int getMinutes() {
        return this.minutes;
    }

    public final Month getMonth() {
        return this.month;
    }

    public final int getSeconds() {
        return this.seconds;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + AbstractC1755i.a(this.year, (this.month.hashCode() + AbstractC1755i.a(this.dayOfYear, AbstractC1755i.a(this.dayOfMonth, (this.dayOfWeek.hashCode() + AbstractC1755i.a(this.hours, AbstractC1755i.a(this.minutes, Integer.hashCode(this.seconds) * 31, 31), 31)) * 31, 31), 31)) * 31, 31);
    }

    public String toString() {
        return "GMTDate(seconds=" + this.seconds + ", minutes=" + this.minutes + ", hours=" + this.hours + ", dayOfWeek=" + this.dayOfWeek + ", dayOfMonth=" + this.dayOfMonth + ", dayOfYear=" + this.dayOfYear + ", month=" + this.month + ", year=" + this.year + ", timestamp=" + this.timestamp + ')';
    }

    public GMTDate(int i7, int i8, int i9, WeekDay weekDay, int i10, int i11, Month month, int i12, long j7) {
        l.f("dayOfWeek", weekDay);
        l.f("month", month);
        this.seconds = i7;
        this.minutes = i8;
        this.hours = i9;
        this.dayOfWeek = weekDay;
        this.dayOfMonth = i10;
        this.dayOfYear = i11;
        this.month = month;
        this.year = i12;
        this.timestamp = j7;
    }

    @Override // java.lang.Comparable
    public int compareTo(GMTDate other) {
        l.f("other", other);
        return l.h(this.timestamp, other.timestamp);
    }

    public final GMTDate copy() {
        return DateJvmKt.GMTDate$default(null, 1, null);
    }
}
