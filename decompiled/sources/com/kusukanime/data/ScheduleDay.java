package com.kusukanime.data;

import G3.k;
import P3.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/kusukanime/data/ScheduleDay;", "", "day", "", "items", "", "Lcom/kusukanime/data/ScheduleItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getDay", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@k(generateAdapter = true)
/* loaded from: classes.dex */
public final /* data */ class ScheduleDay {
    public static final int $stable = 8;
    private final String day;
    private final List<ScheduleItem> items;

    public ScheduleDay(String str, List<ScheduleItem> list) {
        l.f("day", str);
        l.f("items", list);
        this.day = str;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScheduleDay copy$default(ScheduleDay scheduleDay, String str, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = scheduleDay.day;
        }
        if ((i7 & 2) != 0) {
            list = scheduleDay.items;
        }
        return scheduleDay.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    public final List<ScheduleItem> component2() {
        return this.items;
    }

    public final ScheduleDay copy(String day, List<ScheduleItem> items) {
        l.f("day", day);
        l.f("items", items);
        return new ScheduleDay(day, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleDay)) {
            return false;
        }
        ScheduleDay scheduleDay = (ScheduleDay) other;
        return l.a(this.day, scheduleDay.day) && l.a(this.items, scheduleDay.items);
    }

    public final String getDay() {
        return this.day;
    }

    public final List<ScheduleItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode() + (this.day.hashCode() * 31);
    }

    public String toString() {
        return "ScheduleDay(day=" + this.day + ", items=" + this.items + ")";
    }

    public /* synthetic */ ScheduleDay(String str, List list, int i7, f fVar) {
        this(str, (i7 & 2) != 0 ? y.f7779k : list);
    }
}
