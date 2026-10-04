package r0;

import H5.A;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
public final class e {
    public h a;

    /* renamed from: b, reason: collision with root package name */
    public m f14791b = new C1861b(0, this);

    /* renamed from: c, reason: collision with root package name */
    public A f14792c;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, long r10, U3.c r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof r0.c
            if (r0 == 0) goto L14
            r0 = r12
            r0.c r0 = (r0.c) r0
            int r1 = r0.f14787m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f14787m = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            r0.c r0 = new r0.c
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f14785k
            T3.a r0 = T3.a.f9048k
            int r1 = r6.f14787m
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            P3.r.Y(r12)
            goto L51
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            P3.r.Y(r12)
            r0.h r12 = r7.a
            r1 = 0
            if (r12 == 0) goto L44
            boolean r3 = r12.f10414w
            if (r3 == 0) goto L44
            y0.o0 r12 = y0.AbstractC2359f.k(r12)
            r1 = r12
            r0.h r1 = (r0.h) r1
        L44:
            if (r1 == 0) goto L56
            r6.f14787m = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.Y(r2, r4, r6)
            if (r12 != r0) goto L51
            return r0
        L51:
            T0.o r12 = (T0.o) r12
            long r8 = r12.a
            goto L58
        L56:
            r8 = 0
        L58:
            T0.o r10 = new T0.o
            r10.<init>(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.e.a(long, long, U3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r6, U3.c r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof r0.d
            if (r0 == 0) goto L13
            r0 = r8
            r0.d r0 = (r0.d) r0
            int r1 = r0.f14790m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14790m = r1
            goto L18
        L13:
            r0.d r0 = new r0.d
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f14788k
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f14790m
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r8)
            goto L4d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            P3.r.Y(r8)
            r0.h r8 = r5.a
            r2 = 0
            if (r8 == 0) goto L42
            boolean r4 = r8.f10414w
            if (r4 == 0) goto L42
            y0.o0 r8 = y0.AbstractC2359f.k(r8)
            r2 = r8
            r0.h r2 = (r0.h) r2
        L42:
            if (r2 == 0) goto L52
            r0.f14790m = r3
            java.lang.Object r8 = r2.m(r6, r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            T0.o r8 = (T0.o) r8
            long r6 = r8.a
            goto L54
        L52:
            r6 = 0
        L54:
            T0.o r8 = new T0.o
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.e.b(long, U3.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e4.a, kotlin.jvm.internal.m] */
    public final A c() {
        A a = (A) this.f14791b.invoke();
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
