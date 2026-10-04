package M;

import D.C0042b;
import L.EnumC0394l2;
import O.C0485c0;
import O.C0486d;
import O.C0493g0;
import java.util.Collection;
import java.util.Iterator;
import p.A0;

/* renamed from: M.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0460s {
    public final C0042b a;

    /* renamed from: b, reason: collision with root package name */
    public final B.e f6332b;

    /* renamed from: c, reason: collision with root package name */
    public final A0 f6333c;

    /* renamed from: d, reason: collision with root package name */
    public final e4.k f6334d;

    /* renamed from: e, reason: collision with root package name */
    public final A f6335e = new A();

    /* renamed from: f, reason: collision with root package name */
    public final L2.e f6336f = new L2.e(this);

    /* renamed from: g, reason: collision with root package name */
    public final C0493g0 f6337g;

    /* renamed from: h, reason: collision with root package name */
    public final O.E f6338h;

    /* renamed from: i, reason: collision with root package name */
    public final O.E f6339i;

    /* renamed from: j, reason: collision with root package name */
    public final C0485c0 f6340j;

    /* renamed from: k, reason: collision with root package name */
    public final C0485c0 f6341k;

    /* renamed from: l, reason: collision with root package name */
    public final C0493g0 f6342l;

    /* renamed from: m, reason: collision with root package name */
    public final C0493g0 f6343m;

    /* renamed from: n, reason: collision with root package name */
    public final C0458p f6344n;

    public C0460s(EnumC0394l2 enumC0394l2, C0042b c0042b, B.e eVar, A0 a02, e4.k kVar) {
        this.a = c0042b;
        this.f6332b = eVar;
        this.f6333c = a02;
        this.f6334d = kVar;
        O.T t7 = O.T.f7049p;
        this.f6337g = C0486d.K(enumC0394l2, t7);
        this.f6338h = C0486d.D(new C0452j(this, 4));
        this.f6339i = C0486d.D(new C0452j(this, 2));
        this.f6340j = C0486d.I(Float.NaN);
        C0486d.C(t7, new C0452j(this, 3));
        this.f6341k = C0486d.I(0.0f);
        this.f6342l = C0486d.K(null, t7);
        this.f6343m = C0486d.K(new B(P3.z.f7780k), t7);
        this.f6344n = new C0458p(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r7, q.X r8, M.C0446d r9, U3.c r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof M.C0455m
            if (r0 == 0) goto L13
            r0 = r10
            M.m r0 = (M.C0455m) r0
            int r1 = r0.f6320n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6320n = r1
            goto L18
        L13:
            M.m r0 = new M.m
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f6318l
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f6320n
            r3 = 0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 != r5) goto L2f
            M.s r7 = r0.f6317k
            P3.r.Y(r10)     // Catch: java.lang.Throwable -> L2c
            goto L61
        L2c:
            r8 = move-exception
            goto La3
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            P3.r.Y(r10)
            M.B r10 = r6.d()
            java.lang.Object r10 = r10.a
            boolean r10 = r10.containsKey(r7)
            if (r10 == 0) goto Ldd
            M.A r10 = r6.f6335e     // Catch: java.lang.Throwable -> La1
            M.o r2 = new M.o     // Catch: java.lang.Throwable -> La1
            r2.<init>(r6, r7, r9, r3)     // Catch: java.lang.Throwable -> La1
            r0.f6317k = r6     // Catch: java.lang.Throwable -> La1
            r0.f6320n = r5     // Catch: java.lang.Throwable -> La1
            r10.getClass()     // Catch: java.lang.Throwable -> L9d
            M.z r7 = new M.z     // Catch: java.lang.Throwable -> L9d
            r7.<init>(r8, r10, r2, r3)     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r7 = H5.D.j(r7, r0)     // Catch: java.lang.Throwable -> L9d
            if (r7 != r1) goto L60
            return r1
        L60:
            r7 = r6
        L61:
            r7.h(r3)
            M.B r8 = r7.d()
            O.c0 r9 = r7.f6340j
            float r10 = r9.f()
            java.lang.Object r8 = r8.a(r10)
            if (r8 == 0) goto Le0
            float r9 = r9.f()
            M.B r10 = r7.d()
            float r10 = r10.d(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 > 0) goto Le0
            e4.k r9 = r7.f6334d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Le0
            r7.g(r8)
            goto Le0
        L9b:
            r8 = r7
            goto L9f
        L9d:
            r7 = move-exception
            goto L9b
        L9f:
            r7 = r6
            goto La3
        La1:
            r8 = move-exception
            goto L9f
        La3:
            r7.h(r3)
            M.B r9 = r7.d()
            O.c0 r10 = r7.f6340j
            float r0 = r10.f()
            java.lang.Object r9 = r9.a(r0)
            if (r9 == 0) goto Ldc
            float r10 = r10.f()
            M.B r0 = r7.d()
            float r0 = r0.d(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 > 0) goto Ldc
            e4.k r10 = r7.f6334d
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Ldc
            r7.g(r9)
        Ldc:
            throw r8
        Ldd:
            r6.g(r7)
        Le0:
            O3.C r7 = O3.C.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: M.C0460s.a(java.lang.Object, q.X, M.d, U3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(q.X r7, M.C0459q r8, U3.c r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof M.C0451i
            if (r0 == 0) goto L13
            r0 = r9
            M.i r0 = (M.C0451i) r0
            int r1 = r0.f6307n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6307n = r1
            goto L18
        L13:
            M.i r0 = new M.i
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f6305l
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f6307n
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            M.s r7 = r0.f6304k
            P3.r.Y(r9)     // Catch: java.lang.Throwable -> L2b
            goto L54
        L2b:
            r8 = move-exception
            goto L95
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            P3.r.Y(r9)
            M.A r9 = r6.f6335e     // Catch: java.lang.Throwable -> L93
            M.l r2 = new M.l     // Catch: java.lang.Throwable -> L93
            r5 = 0
            r2.<init>(r8, r6, r5)     // Catch: java.lang.Throwable -> L93
            r0.f6304k = r6     // Catch: java.lang.Throwable -> L93
            r0.f6307n = r4     // Catch: java.lang.Throwable -> L93
            r9.getClass()     // Catch: java.lang.Throwable -> L8f
            M.z r8 = new M.z     // Catch: java.lang.Throwable -> L8f
            r8.<init>(r7, r9, r2, r5)     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r7 = H5.D.j(r8, r0)     // Catch: java.lang.Throwable -> L8f
            if (r7 != r1) goto L53
            return r1
        L53:
            r7 = r6
        L54:
            M.B r8 = r7.d()
            O.c0 r9 = r7.f6340j
            float r0 = r9.f()
            java.lang.Object r8 = r8.a(r0)
            if (r8 == 0) goto L8a
            float r9 = r9.f()
            M.B r0 = r7.d()
            float r0 = r0.d(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L8a
            e4.k r9 = r7.f6334d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8a
            r7.g(r8)
        L8a:
            O3.C r7 = O3.C.a
            return r7
        L8d:
            r8 = r7
            goto L91
        L8f:
            r7 = move-exception
            goto L8d
        L91:
            r7 = r6
            goto L95
        L93:
            r8 = move-exception
            goto L91
        L95:
            M.B r9 = r7.d()
            O.c0 r0 = r7.f6340j
            float r1 = r0.f()
            java.lang.Object r9 = r9.a(r1)
            if (r9 == 0) goto Lcb
            float r0 = r0.f()
            M.B r1 = r7.d()
            float r1 = r1.d(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Lcb
            e4.k r0 = r7.f6334d
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lcb
            r7.g(r9)
        Lcb:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: M.C0460s.b(q.X, M.q, U3.c):java.lang.Object");
    }

    public final Object c(float f5, float f7, Object obj) {
        B bD = d();
        float fD = bD.d(obj);
        float fFloatValue = ((Number) this.f6332b.invoke()).floatValue();
        if (fD != f5 && !Float.isNaN(fD)) {
            C0042b c0042b = this.a;
            if (fD < f5) {
                if (f7 >= fFloatValue) {
                    Object objB = bD.b(f5, true);
                    kotlin.jvm.internal.l.c(objB);
                    return objB;
                }
                Object objB2 = bD.b(f5, true);
                kotlin.jvm.internal.l.c(objB2);
                if (f5 >= Math.abs(Math.abs(((Number) c0042b.invoke(Float.valueOf(Math.abs(bD.d(objB2) - fD)))).floatValue()) + fD)) {
                    return objB2;
                }
            } else {
                if (f7 <= (-fFloatValue)) {
                    Object objB3 = bD.b(f5, false);
                    kotlin.jvm.internal.l.c(objB3);
                    return objB3;
                }
                Object objB4 = bD.b(f5, false);
                kotlin.jvm.internal.l.c(objB4);
                float fAbs = Math.abs(fD - Math.abs(((Number) c0042b.invoke(Float.valueOf(Math.abs(fD - bD.d(objB4))))).floatValue()));
                if (f5 >= 0.0f ? f5 <= fAbs : Math.abs(f5) >= fAbs) {
                    return objB4;
                }
            }
        }
        return obj;
    }

    public final B d() {
        return (B) this.f6343m.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final float e(float f5) {
        Float fValueOf;
        C0485c0 c0485c0 = this.f6340j;
        float f7 = (Float.isNaN(c0485c0.f()) ? 0.0f : c0485c0.f()) + f5;
        float fC = d().c();
        Collection collectionValues = d().a.values();
        kotlin.jvm.internal.l.f("<this>", collectionValues);
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return e3.c.j(f7, fC, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    public final float f() {
        C0485c0 c0485c0 = this.f6340j;
        if (Float.isNaN(c0485c0.f())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c0485c0.f();
    }

    public final void g(Object obj) {
        this.f6337g.setValue(obj);
    }

    public final void h(Object obj) {
        this.f6342l.setValue(obj);
    }
}
