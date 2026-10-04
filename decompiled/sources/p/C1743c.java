package p;

import O.C0486d;
import O.C0493g0;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1743c {
    public final B0 a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13957b;

    /* renamed from: c, reason: collision with root package name */
    public final C1761m f13958c;

    /* renamed from: d, reason: collision with root package name */
    public final C0493g0 f13959d;

    /* renamed from: e, reason: collision with root package name */
    public final C0493g0 f13960e;

    /* renamed from: f, reason: collision with root package name */
    public final C1730Q f13961f;

    /* renamed from: g, reason: collision with root package name */
    public final C1752g0 f13962g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC1766r f13963h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC1766r f13964i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC1766r f13965j;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC1766r f13966k;

    public C1743c(Object obj, B0 b02, Object obj2) {
        this.a = b02;
        this.f13957b = obj2;
        C1761m c1761m = new C1761m(b02, obj, null, 60);
        this.f13958c = c1761m;
        Boolean bool = Boolean.FALSE;
        O.T t7 = O.T.f7049p;
        this.f13959d = C0486d.K(bool, t7);
        this.f13960e = C0486d.K(obj, t7);
        this.f13961f = new C1730Q();
        this.f13962g = new C1752g0(obj2);
        AbstractC1766r abstractC1766r = c1761m.f14049m;
        boolean z7 = abstractC1766r instanceof C1762n;
        AbstractC1766r abstractC1766r2 = z7 ? AbstractC1745d.f13975e : abstractC1766r instanceof C1763o ? AbstractC1745d.f13976f : abstractC1766r instanceof C1764p ? AbstractC1745d.f13977g : AbstractC1745d.f13978h;
        this.f13963h = abstractC1766r2;
        AbstractC1766r abstractC1766r3 = z7 ? AbstractC1745d.a : abstractC1766r instanceof C1763o ? AbstractC1745d.f13972b : abstractC1766r instanceof C1764p ? AbstractC1745d.f13973c : AbstractC1745d.f13974d;
        this.f13964i = abstractC1766r3;
        this.f13965j = abstractC1766r2;
        this.f13966k = abstractC1766r3;
    }

    public static final Object a(C1743c c1743c, Object obj) {
        AbstractC1766r abstractC1766r = c1743c.f13963h;
        AbstractC1766r abstractC1766r2 = c1743c.f13965j;
        boolean zA = kotlin.jvm.internal.l.a(abstractC1766r2, abstractC1766r);
        AbstractC1766r abstractC1766r3 = c1743c.f13966k;
        if (!zA || !kotlin.jvm.internal.l.a(abstractC1766r3, c1743c.f13964i)) {
            B0 b02 = c1743c.a;
            AbstractC1766r abstractC1766r4 = (AbstractC1766r) b02.a.invoke(obj);
            int iB = abstractC1766r4.b();
            boolean z7 = false;
            for (int i7 = 0; i7 < iB; i7++) {
                if (abstractC1766r4.a(i7) < abstractC1766r2.a(i7) || abstractC1766r4.a(i7) > abstractC1766r3.a(i7)) {
                    abstractC1766r4.e(e3.c.j(abstractC1766r4.a(i7), abstractC1766r2.a(i7), abstractC1766r3.a(i7)), i7);
                    z7 = true;
                }
            }
            if (z7) {
                return b02.f13838b.invoke(abstractC1766r4);
            }
        }
        return obj;
    }

    public static final void b(C1743c c1743c) {
        C1761m c1761m = c1743c.f13958c;
        c1761m.f14049m.d();
        c1761m.f14050n = Long.MIN_VALUE;
        c1743c.f13959d.setValue(Boolean.FALSE);
    }

    public static Object c(C1743c c1743c, Object obj, InterfaceC1760l interfaceC1760l, S3.c cVar, int i7) {
        if ((i7 & 2) != 0) {
            interfaceC1760l = c1743c.f13962g;
        }
        InterfaceC1760l interfaceC1760l2 = interfaceC1760l;
        Object objInvoke = c1743c.a.f13838b.invoke(c1743c.f13958c.f14049m);
        Object objD = c1743c.d();
        B0 b02 = c1743c.a;
        return C1730Q.a(c1743c.f13961f, new C1739a(c1743c, objInvoke, new n0(interfaceC1760l2, b02, objD, obj, (AbstractC1766r) b02.a.invoke(objInvoke)), c1743c.f13958c.f14050n, null), cVar);
    }

    public final Object d() {
        return this.f13958c.f14048l.getValue();
    }

    public final Object e(S3.c cVar, Object obj) {
        Object objA = C1730Q.a(this.f13961f, new C1741b(this, obj, null), cVar);
        return objA == T3.a.f9048k ? objA : O3.C.a;
    }

    public /* synthetic */ C1743c(Object obj, B0 b02, Object obj2, int i7) {
        this(obj, b02, (i7 & 4) != 0 ? null : obj2);
    }
}
