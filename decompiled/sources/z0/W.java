package z0;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class W implements H5.A {

    /* renamed from: k, reason: collision with root package name */
    public final View f18705k;

    /* renamed from: l, reason: collision with root package name */
    public final N0.x f18706l;

    /* renamed from: m, reason: collision with root package name */
    public final H5.A f18707m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReference f18708n = new AtomicReference(null);

    public W(View view, N0.x xVar, H5.A a) {
        this.f18705k = view;
        this.f18706l = xVar;
        this.f18707m = a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(F.C r6, U3.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof z0.T
            if (r0 == 0) goto L13
            r0 = r7
            z0.T r0 = (z0.T) r0
            int r1 = r0.f18678m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18678m = r1
            goto L18
        L13:
            z0.T r0 = new z0.T
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f18676k
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f18678m
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            P3.r.Y(r7)
            goto L4e
        L2f:
            P3.r.Y(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.f18708n
            z0.U r2 = new z0.U
            r4 = 0
            r2.<init>(r4, r6, r5)
            z0.V r6 = new z0.V
            r4 = 0
            r6.<init>(r5, r4)
            r0.f18678m = r3
            a0.t r3 = new a0.t
            r3.<init>(r2, r7, r6, r4)
            java.lang.Object r6 = H5.D.j(r3, r0)
            if (r6 != r1) goto L4e
            return
        L4e:
            D6.r r6 = new D6.r
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.W.a(F.C, U3.c):void");
    }

    @Override // H5.A
    public final S3.h getCoroutineContext() {
        return this.f18707m.getCoroutineContext();
    }
}
