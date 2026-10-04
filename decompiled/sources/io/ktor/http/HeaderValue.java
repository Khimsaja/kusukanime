package io.ktor.http;

import P3.y;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import z5.AbstractC2516u;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/ktor/http/HeaderValue;", "", "", "value", "", "Lio/ktor/http/HeaderValueParam;", "params", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lio/ktor/http/HeaderValue;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/util/List;", "getParams", "", "quality", "D", "getQuality", "()D", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HeaderValue {
    private final List<HeaderValueParam> params;
    private final double quality;
    private final String value;

    public HeaderValue(String str, List<HeaderValueParam> list) {
        Double d4;
        Object next;
        String value;
        l.f("value", str);
        l.f("params", list);
        this.value = str;
        this.params = list;
        Iterator<T> it = list.iterator();
        while (true) {
            d4 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (l.a(((HeaderValueParam) next).getName(), "q")) {
                    break;
                }
            }
        }
        HeaderValueParam headerValueParam = (HeaderValueParam) next;
        double dDoubleValue = 1.0d;
        if (headerValueParam != null && (value = headerValueParam.getValue()) != null) {
            Double dValueOf = AbstractC2516u.G(value) ? Double.valueOf(Double.parseDouble(value)) : null;
            if (dValueOf != null) {
                double dDoubleValue2 = dValueOf.doubleValue();
                if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                    d4 = dValueOf;
                }
                if (d4 != null) {
                    dDoubleValue = d4.doubleValue();
                }
            }
        }
        this.quality = dDoubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeaderValue copy$default(HeaderValue headerValue, String str, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = headerValue.value;
        }
        if ((i7 & 2) != 0) {
            list = headerValue.params;
        }
        return headerValue.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final List<HeaderValueParam> component2() {
        return this.params;
    }

    public final HeaderValue copy(String value, List<HeaderValueParam> params) {
        l.f("value", value);
        l.f("params", params);
        return new HeaderValue(value, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderValue)) {
            return false;
        }
        HeaderValue headerValue = (HeaderValue) other;
        return l.a(this.value, headerValue.value) && l.a(this.params, headerValue.params);
    }

    public final List<HeaderValueParam> getParams() {
        return this.params;
    }

    public final double getQuality() {
        return this.quality;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.params.hashCode() + (this.value.hashCode() * 31);
    }

    public String toString() {
        return "HeaderValue(value=" + this.value + ", params=" + this.params + ')';
    }

    public /* synthetic */ HeaderValue(String str, List list, int i7, f fVar) {
        this(str, (i7 & 2) != 0 ? y.f7779k : list);
    }
}
