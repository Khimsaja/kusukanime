package x6;

import java.util.ArrayList;
import kotlin.jvm.internal.l;
import w6.y;

/* loaded from: classes.dex */
public final class g {
    public final y a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17535b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17536c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17537d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17538e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17539f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17540g;

    /* renamed from: h, reason: collision with root package name */
    public final long f17541h;

    /* renamed from: i, reason: collision with root package name */
    public final int f17542i;

    /* renamed from: j, reason: collision with root package name */
    public final int f17543j;

    /* renamed from: k, reason: collision with root package name */
    public final Long f17544k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f17545l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f17546m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f17547n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f17548o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f17549p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f17550q;

    public g(y yVar, boolean z7, String str, long j7, long j8, long j9, int i7, long j10, int i8, int i9, Long l7, Long l8, Long l9, Integer num, Integer num2, Integer num3) {
        l.f("canonicalPath", yVar);
        l.f("comment", str);
        this.a = yVar;
        this.f17535b = z7;
        this.f17536c = str;
        this.f17537d = j7;
        this.f17538e = j8;
        this.f17539f = j9;
        this.f17540g = i7;
        this.f17541h = j10;
        this.f17542i = i8;
        this.f17543j = i9;
        this.f17544k = l7;
        this.f17545l = l8;
        this.f17546m = l9;
        this.f17547n = num;
        this.f17548o = num2;
        this.f17549p = num3;
        this.f17550q = new ArrayList();
    }

    public /* synthetic */ g(y yVar, boolean z7, String str, long j7, long j8, long j9, int i7, long j10, int i8, int i9, Long l7, Long l8, Long l9, int i10) {
        this(yVar, z7, (i10 & 4) != 0 ? "" : str, (i10 & 8) != 0 ? -1L : j7, (i10 & 16) != 0 ? -1L : j8, (i10 & 32) != 0 ? -1L : j9, (i10 & 64) != 0 ? -1 : i7, (i10 & 128) != 0 ? -1L : j10, (i10 & 256) != 0 ? -1 : i8, (i10 & 512) != 0 ? -1 : i9, (i10 & 1024) != 0 ? null : l7, (i10 & 2048) != 0 ? null : l8, (i10 & 4096) != 0 ? null : l9, null, null, null);
    }
}
