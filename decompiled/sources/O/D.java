package O;

import m.AbstractC1473C;
import m.C1501v;

/* loaded from: classes.dex */
public final class D extends Y.x {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f6961h = new Object();

    /* renamed from: c, reason: collision with root package name */
    public int f6962c;

    /* renamed from: d, reason: collision with root package name */
    public int f6963d;

    /* renamed from: e, reason: collision with root package name */
    public C1501v f6964e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6965f;

    /* renamed from: g, reason: collision with root package name */
    public int f6966g;

    public D() {
        C1501v c1501v = AbstractC1473C.a;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>", c1501v);
        this.f6964e = c1501v;
        this.f6965f = f6961h;
    }

    @Override // Y.x
    public final void a(Y.x xVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>", xVar);
        D d4 = (D) xVar;
        this.f6964e = d4.f6964e;
        this.f6965f = d4.f6965f;
        this.f6966g = d4.f6966g;
    }

    @Override // Y.x
    public final Y.x b() {
        return new D();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(O.E r7, Y.h r8) {
        /*
            r6 = this;
            java.lang.Object r0 = Y.o.f10002b
            monitor-enter(r0)
            int r1 = r6.f6962c     // Catch: java.lang.Throwable -> L18
            int r2 = r8.d()     // Catch: java.lang.Throwable -> L18
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L1a
            int r1 = r6.f6963d     // Catch: java.lang.Throwable -> L18
            int r2 = r8.h()     // Catch: java.lang.Throwable -> L18
            if (r1 == r2) goto L16
            goto L1a
        L16:
            r1 = r4
            goto L1b
        L18:
            r7 = move-exception
            goto L45
        L1a:
            r1 = r3
        L1b:
            monitor-exit(r0)
            java.lang.Object r2 = r6.f6965f
            java.lang.Object r5 = O.D.f6961h
            if (r2 == r5) goto L2d
            if (r1 == 0) goto L2e
            int r2 = r6.f6966g
            int r7 = r6.d(r7, r8)
            if (r2 != r7) goto L2d
            goto L2e
        L2d:
            r3 = r4
        L2e:
            if (r3 == 0) goto L44
            if (r1 == 0) goto L44
            monitor-enter(r0)
            int r7 = r8.d()     // Catch: java.lang.Throwable -> L41
            r6.f6962c = r7     // Catch: java.lang.Throwable -> L41
            int r7 = r8.h()     // Catch: java.lang.Throwable -> L41
            r6.f6963d = r7     // Catch: java.lang.Throwable -> L41
            monitor-exit(r0)
            return r3
        L41:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L44:
            return r3
        L45:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: O.D.c(O.E, Y.h):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(O.E r21, Y.h r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.D.d(O.E, Y.h):int");
    }
}
