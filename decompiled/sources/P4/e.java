package P4;

import j5.C1354i;
import j5.C1360o;
import java.util.Set;
import l4.AbstractC1420H;
import l5.EnumC1457j;
import z4.C2491c;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f7791b = AbstractC1420H.K(Q4.a.f7997o);

    /* renamed from: c, reason: collision with root package name */
    public static final Set f7792c = P3.m.v0(new Q4.a[]{Q4.a.f7998p, Q4.a.f8001s});

    /* renamed from: d, reason: collision with root package name */
    public static final T4.f f7793d;

    /* renamed from: e, reason: collision with root package name */
    public static final T4.f f7794e;
    public C1354i a;

    static {
        new T4.f(new int[]{1, 1, 2}, false);
        f7793d = new T4.f(new int[]{1, 1, 11}, false);
        f7794e = new T4.f(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l5.C1464q a(u4.InterfaceC2088D r11, z4.C2491c r12) {
        /*
            r10 = this;
            java.lang.String r1 = "Could not read data from "
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.l.f(r0, r11)
            java.lang.String r0 = "kotlinClass"
            kotlin.jvm.internal.l.f(r0, r12)
            Q4.b r0 = r12.f19031b
            java.lang.Object r3 = r0.f8007e
            java.lang.String[] r3 = (java.lang.String[]) r3
            if (r3 != 0) goto L18
            java.lang.Object r3 = r0.f8008f
            java.lang.String[] r3 = (java.lang.String[]) r3
        L18:
            r5 = 0
            if (r3 == 0) goto L28
            java.lang.Object r6 = r0.f8005c
            Q4.a r6 = (Q4.a) r6
            java.util.Set r7 = P4.e.f7792c
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L28
            goto L29
        L28:
            r3 = r5
        L29:
            if (r3 != 0) goto L2c
            goto L6c
        L2c:
            java.lang.Object r6 = r0.f8006d
            r9 = r6
            T4.f r9 = (T4.f) r9
            java.lang.Object r0 = r0.f8009g
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 != 0) goto L38
            goto L6c
        L38:
            O3.l r0 = V4.g.h(r3, r0)     // Catch: java.lang.Throwable -> L3d X4.r -> L3f
            goto L6a
        L3d:
            r0 = move-exception
            goto L56
        L3f:
            r0 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = r12.a()     // Catch: java.lang.Throwable -> L3d
            r6.append(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L3d
            r3.<init>(r1, r0)     // Catch: java.lang.Throwable -> L3d
            throw r3     // Catch: java.lang.Throwable -> L3d
        L56:
            j5.i r1 = r10.c()
            j5.j r1 = r1.f12415c
            r1.getClass()
            T4.f r1 = r10.e()
            boolean r1 = r9.b(r1)
            if (r1 != 0) goto Lb2
            r0 = r5
        L6a:
            if (r0 != 0) goto L6d
        L6c:
            return r5
        L6d:
            java.lang.Object r1 = r0.f7528k
            r6 = r1
            V4.f r6 = (V4.f) r6
            java.lang.Object r0 = r0.f7529l
            r3 = r0
            R4.F r3 = (R4.F) r3
            r5 = r3
            P4.g r3 = new P4.g
            r10.d(r12)
            boolean r7 = r10.f(r12)
            l5.j r8 = r10.b(r12)
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r4 = r6
            l5.q r1 = new l5.q
            j5.i r7 = r10.c()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "scope for "
            r0.<init>(r6)
            r0.append(r3)
            java.lang.String r6 = " in "
            r0.append(r6)
            r0.append(r11)
            java.lang.String r8 = r0.toString()
            r6 = r9
            P4.d r9 = P4.d.f7790k
            r2 = r6
            r6 = r3
            r3 = r5
            r5 = r2
            r2 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        Lb2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.e.a(u4.D, z4.c):l5.q");
    }

    public final EnumC1457j b(C2491c c2491c) {
        c().f12415c.getClass();
        int i7 = c2491c.f19031b.f8004b;
        return ((i7 & 16) == 0 || (i7 & 32) != 0) ? EnumC1457j.f12797k : EnumC1457j.f12798l;
    }

    public final C1354i c() {
        C1354i c1354i = this.a;
        if (c1354i != null) {
            return c1354i;
        }
        kotlin.jvm.internal.l.l("components");
        throw null;
    }

    public final C1360o d(C2491c c2491c) {
        c().f12415c.getClass();
        if (((T4.f) c2491c.f19031b.f8006d).b(e())) {
            return null;
        }
        T4.f fVar = (T4.f) c2491c.f19031b.f8006d;
        T4.f fVar2 = T4.f.f9107g;
        T4.f fVarE = e();
        T4.f fVarE2 = e();
        fVarE2.getClass();
        T4.f fVar3 = fVar.f9109f ? fVar2 : T4.f.f9108h;
        fVar3.getClass();
        int i7 = fVarE2.f9062b;
        int i8 = fVar3.f9062b;
        if (i8 > i7 || (i8 >= i7 && fVar3.f9063c > fVarE2.f9063c)) {
            fVarE2 = fVar3;
        }
        return new C1360o(fVar, fVar2, fVarE, fVarE2, c2491c.a());
    }

    public final T4.f e() {
        c().f12415c.getClass();
        return T4.f.f9107g;
    }

    public final boolean f(C2491c c2491c) {
        c().f12415c.getClass();
        c().f12415c.getClass();
        Q4.b bVar = c2491c.f19031b;
        return ((bVar.f8004b & 2) != 0) && ((T4.f) bVar.f8006d).equals(f7793d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j5.C1349d g(z4.C2491c r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Could not read data from "
            Q4.b r1 = r7.f19031b
            java.lang.Object r2 = r1.f8007e
            java.lang.String[] r2 = (java.lang.String[]) r2
            if (r2 != 0) goto Le
            java.lang.Object r2 = r1.f8008f
            java.lang.String[] r2 = (java.lang.String[]) r2
        Le:
            r3 = 0
            if (r2 == 0) goto L1e
            java.lang.Object r4 = r1.f8005c
            Q4.a r4 = (Q4.a) r4
            java.util.Set r5 = P4.e.f7791b
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L1e
            goto L1f
        L1e:
            r2 = r3
        L1f:
            if (r2 != 0) goto L22
            goto L61
        L22:
            java.lang.Object r4 = r1.f8006d
            T4.f r4 = (T4.f) r4
            java.lang.Object r1 = r1.f8009g
            java.lang.String[] r1 = (java.lang.String[]) r1
            if (r1 != 0) goto L2d
            goto L61
        L2d:
            O3.l r0 = V4.g.f(r2, r1)     // Catch: java.lang.Throwable -> L32 X4.r -> L34
            goto L5f
        L32:
            r0 = move-exception
            goto L4b
        L34:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r7.a()     // Catch: java.lang.Throwable -> L32
            r5.append(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L32
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L4b:
            j5.i r1 = r6.c()
            j5.j r1 = r1.f12415c
            r1.getClass()
            T4.f r1 = r6.e()
            boolean r1 = r4.b(r1)
            if (r1 != 0) goto L85
            r0 = r3
        L5f:
            if (r0 != 0) goto L62
        L61:
            return r3
        L62:
            java.lang.Object r1 = r0.f7528k
            V4.f r1 = (V4.f) r1
            java.lang.Object r0 = r0.f7529l
            R4.k r0 = (R4.C0580k) r0
            P4.n r2 = new P4.n
            r6.d(r7)
            l5.w r3 = new l5.w
            boolean r5 = r6.f(r7)
            r3.<init>(r5)
            l5.j r5 = r6.b(r7)
            r2.<init>(r7, r3, r5)
            j5.d r7 = new j5.d
            r7.<init>(r1, r0, r4, r2)
            return r7
        L85:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.e.g(z4.c):j5.d");
    }
}
