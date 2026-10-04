package z5;

import f4.InterfaceC0881a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: z5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2497b implements Iterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public int f19038k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f19039l;

    /* renamed from: m, reason: collision with root package name */
    public int f19040m;

    /* renamed from: n, reason: collision with root package name */
    public k4.g f19041n;

    /* renamed from: o, reason: collision with root package name */
    public int f19042o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2498c f19043p;

    public C2497b(C2498c c2498c) {
        this.f19043p = c2498c;
        c2498c.getClass();
        int iK = e3.c.k(0, 0, c2498c.a.length());
        this.f19039l = iK;
        this.f19040m = iK;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.f19040m
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f19038k = r1
            r0 = 0
            r7.f19041n = r0
            return
        Lb:
            z5.c r2 = r7.f19043p
            int r3 = r2.f19044b
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.f19042o
            int r6 = r6 + r5
            r7.f19042o = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            k4.g r0 = new k4.g
            int r1 = r7.f19039l
            java.lang.CharSequence r2 = r2.a
            int r2 = z5.AbstractC2510o.b0(r2)
            r0.<init>(r1, r2, r5)
            r7.f19041n = r0
            r7.f19040m = r4
            goto L79
        L34:
            e4.n r0 = r2.f19045c
            java.lang.CharSequence r3 = r2.a
            int r6 = r7.f19040m
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.invoke(r3, r6)
            O3.l r0 = (O3.l) r0
            if (r0 != 0) goto L58
            k4.g r0 = new k4.g
            int r1 = r7.f19039l
            java.lang.CharSequence r2 = r2.a
            int r2 = z5.AbstractC2510o.b0(r2)
            r0.<init>(r1, r2, r5)
            r7.f19041n = r0
            r7.f19040m = r4
            goto L79
        L58:
            java.lang.Object r2 = r0.f7528k
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f7529l
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f19039l
            k4.g r3 = e3.c.L(r3, r2)
            r7.f19041n = r3
            int r2 = r2 + r0
            r7.f19039l = r2
            if (r0 != 0) goto L76
            r1 = r5
        L76:
            int r2 = r2 + r1
            r7.f19040m = r2
        L79:
            r7.f19038k = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.C2497b.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f19038k == -1) {
            a();
        }
        return this.f19038k == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f19038k == -1) {
            a();
        }
        if (this.f19038k == 0) {
            throw new NoSuchElementException();
        }
        k4.g gVar = this.f19041n;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.ranges.IntRange", gVar);
        this.f19041n = null;
        this.f19038k = -1;
        return gVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
