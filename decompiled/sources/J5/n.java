package J5;

import F2.G;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class n extends M5.q {

    /* renamed from: e, reason: collision with root package name */
    public final e f4339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f4340f;

    public n(long j7, n nVar, e eVar, int i7) {
        super(j7, nVar, i7);
        this.f4339e = eVar;
        this.f4340f = new AtomicReferenceArray(g.f4317b * 2);
    }

    @Override // M5.q
    public final int g() {
        return g.f4317b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        kotlin.jvm.internal.l.c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // M5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r5, S3.h r6) {
        /*
            r4 = this;
            int r6 = J5.g.f4317b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r4.f4340f
            int r1 = r5 * 2
            r6.get(r1)
        L11:
            java.lang.Object r6 = r4.l(r5)
            boolean r1 = r6 instanceof H5.E0
            J5.e r2 = r4.f4339e
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof J5.w
            if (r1 == 0) goto L21
            goto L62
        L21:
            F2.G r1 = J5.g.f4325j
            if (r6 == r1) goto L59
            F2.G r1 = J5.g.f4326k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            F2.G r1 = J5.g.f4322g
            if (r6 == r1) goto L11
            F2.G r1 = J5.g.f4321f
            if (r6 != r1) goto L33
            goto L11
        L33:
            F2.G r5 = J5.g.f4324i
            if (r6 == r5) goto L7c
            F2.G r5 = J5.g.f4319d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            F2.G r5 = J5.g.f4327l
            if (r6 != r5) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L59:
            r4.n(r5, r3)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.l.c(r2)
            return
        L62:
            if (r0 == 0) goto L67
            F2.G r1 = J5.g.f4325j
            goto L69
        L67:
            F2.G r1 = J5.g.f4326k
        L69:
            boolean r6 = r4.k(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.n(r5, r3)
            r6 = r0 ^ 1
            r4.m(r5, r6)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.l.c(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.n.h(int, S3.h):void");
    }

    public final boolean k(int i7, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f4340f;
        int i8 = (i7 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i8, obj, obj2)) {
            if (atomicReferenceArray.get(i8) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object l(int i7) {
        return this.f4340f.get((i7 * 2) + 1);
    }

    public final void m(int i7, boolean z7) {
        if (z7) {
            e eVar = this.f4339e;
            kotlin.jvm.internal.l.c(eVar);
            eVar.A((this.f6600c * g.f4317b) + i7);
        }
        i();
    }

    public final void n(int i7, Object obj) {
        this.f4340f.set(i7 * 2, obj);
    }

    public final void o(int i7, G g4) {
        this.f4340f.set((i7 * 2) + 1, g4);
    }
}
