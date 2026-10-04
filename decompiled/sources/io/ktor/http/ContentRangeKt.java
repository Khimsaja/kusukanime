package io.ktor.http;

import io.ktor.sse.ServerSentEventKt;
import io.ktor.util.date.GMTDateParser;
import k4.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lk4/j;", "range", "", "fullLength", "Lio/ktor/http/RangeUnits;", "unit", "", "contentRangeHeaderValue", "(Lk4/j;Ljava/lang/Long;Lio/ktor/http/RangeUnits;)Ljava/lang/String;", "(Lk4/j;Ljava/lang/Long;Ljava/lang/String;)Ljava/lang/String;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentRangeKt {
    public static final String contentRangeHeaderValue(j jVar, Long l7, RangeUnits rangeUnits) {
        l.f("unit", rangeUnits);
        return contentRangeHeaderValue(jVar, l7, rangeUnits.getUnitToken());
    }

    public static /* synthetic */ String contentRangeHeaderValue$default(j jVar, Long l7, RangeUnits rangeUnits, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            l7 = null;
        }
        if ((i7 & 4) != 0) {
            rangeUnits = RangeUnits.Bytes;
        }
        return contentRangeHeaderValue(jVar, l7, rangeUnits);
    }

    public static final String contentRangeHeaderValue(j jVar, Long l7, String str) {
        l.f("unit", str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(ServerSentEventKt.SPACE);
        if (jVar != null) {
            sb.append(jVar.f12680k);
            sb.append('-');
            sb.append(jVar.f12681l);
        } else {
            sb.append(GMTDateParser.ANY);
        }
        sb.append('/');
        Object obj = l7;
        if (l7 == null) {
            obj = "*";
        }
        sb.append(obj);
        return sb.toString();
    }

    public static /* synthetic */ String contentRangeHeaderValue$default(j jVar, Long l7, String str, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            l7 = null;
        }
        if ((i7 & 4) != 0) {
            str = RangeUnits.Bytes.getUnitToken();
        }
        return contentRangeHeaderValue(jVar, l7, str);
    }
}
