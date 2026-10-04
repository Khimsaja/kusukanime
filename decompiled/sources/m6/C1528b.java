package m6;

import io.ktor.http.ContentDisposition;
import io.ktor.sse.ServerSentEventKt;
import p.I0;

/* renamed from: m6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1528b {

    /* renamed from: d, reason: collision with root package name */
    public static final w6.l f12996d;

    /* renamed from: e, reason: collision with root package name */
    public static final w6.l f12997e;

    /* renamed from: f, reason: collision with root package name */
    public static final w6.l f12998f;

    /* renamed from: g, reason: collision with root package name */
    public static final w6.l f12999g;

    /* renamed from: h, reason: collision with root package name */
    public static final w6.l f13000h;

    /* renamed from: i, reason: collision with root package name */
    public static final w6.l f13001i;
    public final w6.l a;

    /* renamed from: b, reason: collision with root package name */
    public final w6.l f13002b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13003c;

    static {
        w6.l lVar = w6.l.f17157n;
        f12996d = I0.s(ServerSentEventKt.COLON);
        f12997e = I0.s(":status");
        f12998f = I0.s(":method");
        f12999g = I0.s(":path");
        f13000h = I0.s(":scheme");
        f13001i = I0.s(":authority");
    }

    public C1528b(w6.l lVar, w6.l lVar2) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, lVar);
        kotlin.jvm.internal.l.f("value", lVar2);
        this.a = lVar;
        this.f13002b = lVar2;
        this.f13003c = lVar2.d() + lVar.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1528b)) {
            return false;
        }
        C1528b c1528b = (C1528b) obj;
        return kotlin.jvm.internal.l.a(this.a, c1528b.a) && kotlin.jvm.internal.l.a(this.f13002b, c1528b.f13002b);
    }

    public final int hashCode() {
        return this.f13002b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.r() + ": " + this.f13002b.r();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1528b(String str, String str2) {
        this(I0.s(str), I0.s(str2));
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        kotlin.jvm.internal.l.f("value", str2);
        w6.l lVar = w6.l.f17157n;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1528b(w6.l lVar, String str) {
        this(lVar, I0.s(str));
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, lVar);
        kotlin.jvm.internal.l.f("value", str);
        w6.l lVar2 = w6.l.f17157n;
    }
}
