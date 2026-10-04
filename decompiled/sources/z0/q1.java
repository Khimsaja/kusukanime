package z0;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class q1 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final z0.o1 a(z0.AbstractC2432a r6, O.r r7, W.a r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = z0.AbstractC2470t0.a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L3f
            r0 = 6
            J5.e r0 = P3.F.a(r2, r0, r3)
            O3.q r2 = z0.C2433a0.f18722v
            java.lang.Object r2 = r2.getValue()
            S3.h r2 = (S3.h) r2
            M5.c r2 = H5.D.c(r2)
            z0.s0 r4 = new z0.s0
            r4.<init>(r0, r3)
            r5 = 3
            H5.D.x(r2, r3, r4, r5)
            o.t r2 = new o.t
            r4 = 18
            r2.<init>(r4, r0)
            java.lang.Object r0 = Y.o.f10002b
            monitor-enter(r0)
            java.lang.Object r4 = Y.o.f10008h     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r2 = P3.q.H0(r4, r2)     // Catch: java.lang.Throwable -> L3c
            Y.o.f10008h = r2     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            Y.o.a()
            goto L3f
        L3c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L3f:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L52
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof z0.C2471u
            if (r1 == 0) goto L50
            z0.u r0 = (z0.C2471u) r0
            goto L56
        L50:
            r0 = r3
            goto L56
        L52:
            r6.removeAllViews()
            goto L50
        L56:
            if (r0 != 0) goto L6e
            z0.u r0 = new z0.u
            android.content.Context r1 = r6.getContext()
            S3.h r2 = r7.h()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = z0.q1.a
            r6.addView(r1, r2)
        L6e:
            B2.l r6 = new B2.l
            y0.D r1 = r0.getRoot()
            r6.<init>(r1)
            O.u r1 = new O.u
            r1.<init>(r7, r6)
            android.view.View r6 = r0.getView()
            r2 = 2131165353(0x7f0700a9, float:1.794492E38)
            java.lang.Object r6 = r6.getTag(r2)
            boolean r4 = r6 instanceof z0.o1
            if (r4 == 0) goto L8e
            r3 = r6
            z0.o1 r3 = (z0.o1) r3
        L8e:
            if (r3 != 0) goto L9c
            z0.o1 r3 = new z0.o1
            r3.<init>(r0, r1)
            android.view.View r6 = r0.getView()
            r6.setTag(r2, r3)
        L9c:
            r3.c(r8)
            S3.h r6 = r0.getCoroutineContext()
            S3.h r8 = r7.h()
            boolean r6 = kotlin.jvm.internal.l.a(r6, r8)
            if (r6 != 0) goto Lb4
            S3.h r6 = r7.h()
            r0.setCoroutineContext(r6)
        Lb4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.q1.a(z0.a, O.r, W.a):z0.o1");
    }
}
