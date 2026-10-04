package d3;

import H5.AbstractC0281w;
import P3.y;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.AbstractC0690q;
import b1.AbstractC0703b;
import f3.InterfaceC0879e;
import f6.C0920r;
import java.util.Arrays;

/* renamed from: d3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0797i {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11276b;

    /* renamed from: c, reason: collision with root package name */
    public final T2.k f11277c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap.Config f11278d;

    /* renamed from: e, reason: collision with root package name */
    public final e3.e f11279e;

    /* renamed from: f, reason: collision with root package name */
    public final y f11280f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0879e f11281g;

    /* renamed from: h, reason: collision with root package name */
    public final C0920r f11282h;

    /* renamed from: i, reason: collision with root package name */
    public final C0804p f11283i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f11284j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f11285k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f11286l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f11287m;

    /* renamed from: n, reason: collision with root package name */
    public final EnumC0790b f11288n;

    /* renamed from: o, reason: collision with root package name */
    public final EnumC0790b f11289o;

    /* renamed from: p, reason: collision with root package name */
    public final EnumC0790b f11290p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC0281w f11291q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC0281w f11292r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC0281w f11293s;

    /* renamed from: t, reason: collision with root package name */
    public final AbstractC0281w f11294t;

    /* renamed from: u, reason: collision with root package name */
    public final AbstractC0690q f11295u;

    /* renamed from: v, reason: collision with root package name */
    public final e3.i f11296v;

    /* renamed from: w, reason: collision with root package name */
    public final e3.g f11297w;

    /* renamed from: x, reason: collision with root package name */
    public final C0802n f11298x;

    /* renamed from: y, reason: collision with root package name */
    public final C0792d f11299y;

    /* renamed from: z, reason: collision with root package name */
    public final C0791c f11300z;

    public C0797i(Context context, Object obj, T2.k kVar, Bitmap.Config config, e3.e eVar, y yVar, InterfaceC0879e interfaceC0879e, C0920r c0920r, C0804p c0804p, boolean z7, boolean z8, boolean z9, boolean z10, EnumC0790b enumC0790b, EnumC0790b enumC0790b2, EnumC0790b enumC0790b3, AbstractC0281w abstractC0281w, AbstractC0281w abstractC0281w2, AbstractC0281w abstractC0281w3, AbstractC0281w abstractC0281w4, AbstractC0690q abstractC0690q, e3.i iVar, e3.g gVar, C0802n c0802n, C0792d c0792d, C0791c c0791c) {
        this.a = context;
        this.f11276b = obj;
        this.f11277c = kVar;
        this.f11278d = config;
        this.f11279e = eVar;
        this.f11280f = yVar;
        this.f11281g = interfaceC0879e;
        this.f11282h = c0920r;
        this.f11283i = c0804p;
        this.f11284j = z7;
        this.f11285k = z8;
        this.f11286l = z9;
        this.f11287m = z10;
        this.f11288n = enumC0790b;
        this.f11289o = enumC0790b2;
        this.f11290p = enumC0790b3;
        this.f11291q = abstractC0281w;
        this.f11292r = abstractC0281w2;
        this.f11293s = abstractC0281w3;
        this.f11294t = abstractC0281w4;
        this.f11295u = abstractC0690q;
        this.f11296v = iVar;
        this.f11297w = gVar;
        this.f11298x = c0802n;
        this.f11299y = c0792d;
        this.f11300z = c0791c;
    }

    public static C0796h a(C0797i c0797i) {
        Context context = c0797i.a;
        c0797i.getClass();
        return new C0796h(c0797i, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0797i)) {
            return false;
        }
        C0797i c0797i = (C0797i) obj;
        return kotlin.jvm.internal.l.a(this.a, c0797i.a) && this.f11276b.equals(c0797i.f11276b) && kotlin.jvm.internal.l.a(this.f11277c, c0797i.f11277c) && this.f11278d == c0797i.f11278d && this.f11279e == c0797i.f11279e && kotlin.jvm.internal.l.a(this.f11280f, c0797i.f11280f) && kotlin.jvm.internal.l.a(this.f11281g, c0797i.f11281g) && kotlin.jvm.internal.l.a(this.f11282h, c0797i.f11282h) && this.f11283i.equals(c0797i.f11283i) && this.f11284j == c0797i.f11284j && this.f11285k == c0797i.f11285k && this.f11286l == c0797i.f11286l && this.f11287m == c0797i.f11287m && this.f11288n == c0797i.f11288n && this.f11289o == c0797i.f11289o && this.f11290p == c0797i.f11290p && kotlin.jvm.internal.l.a(this.f11291q, c0797i.f11291q) && kotlin.jvm.internal.l.a(this.f11292r, c0797i.f11292r) && kotlin.jvm.internal.l.a(this.f11293s, c0797i.f11293s) && kotlin.jvm.internal.l.a(this.f11294t, c0797i.f11294t) && kotlin.jvm.internal.l.a(this.f11295u, c0797i.f11295u) && this.f11296v.equals(c0797i.f11296v) && this.f11297w == c0797i.f11297w && this.f11298x.equals(c0797i.f11298x) && this.f11299y.equals(c0797i.f11299y) && kotlin.jvm.internal.l.a(this.f11300z, c0797i.f11300z);
    }

    public final int hashCode() {
        int iHashCode = (this.f11276b.hashCode() + (this.a.hashCode() * 31)) * 31;
        T2.k kVar = this.f11277c;
        int iHashCode2 = (this.f11279e.hashCode() + ((this.f11278d.hashCode() + ((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 923521)) * 961)) * 29791;
        this.f11280f.getClass();
        return this.f11300z.hashCode() + ((this.f11299y.hashCode() + ((this.f11298x.f11316k.hashCode() + ((this.f11297w.hashCode() + ((this.f11296v.hashCode() + ((this.f11295u.hashCode() + ((this.f11294t.hashCode() + ((this.f11293s.hashCode() + ((this.f11292r.hashCode() + ((this.f11291q.hashCode() + ((this.f11290p.hashCode() + ((this.f11289o.hashCode() + ((this.f11288n.hashCode() + AbstractC0703b.d(AbstractC0703b.d(AbstractC0703b.d(AbstractC0703b.d((this.f11283i.a.hashCode() + ((((this.f11281g.hashCode() + ((1 + iHashCode2) * 31)) * 31) + Arrays.hashCode(this.f11282h.f11596k)) * 31)) * 31, 31, this.f11284j), 31, this.f11285k), 31, this.f11286l), 31, this.f11287m)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * (-1807454463))) * 31);
    }
}
