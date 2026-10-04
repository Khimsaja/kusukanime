package Y;

import java.util.Arrays;
import java.util.HashMap;
import m.C1472B;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: o, reason: collision with root package name */
    public final d f9974o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9975p;

    public e(int i7, m mVar, e4.k kVar, e4.k kVar2, d dVar) {
        super(i7, mVar, kVar, kVar2);
        this.f9974o = dVar;
        dVar.k();
    }

    @Override // Y.d, Y.h
    public final void c() {
        if (this.f9981c) {
            return;
        }
        super.c();
        if (this.f9975p) {
            return;
        }
        this.f9975p = true;
        this.f9974o.l();
    }

    @Override // Y.d
    public final s v() {
        d dVar = this.f9974o;
        if (dVar.f9973m || dVar.f9981c) {
            return new i();
        }
        C1472B c1472b = this.f9968h;
        int i7 = this.f9980b;
        HashMap mapC = c1472b != null ? o.c(dVar, this, dVar.e()) : null;
        Object obj = o.f10002b;
        synchronized (obj) {
            try {
                o.d(this);
                if (c1472b == null || c1472b.f12866d == 0) {
                    a();
                } else {
                    s sVarY = y(this.f9974o.d(), mapC, this.f9974o.e());
                    if (!sVarY.equals(j.f9983b)) {
                        return sVarY;
                    }
                    C1472B c1472bW = this.f9974o.w();
                    if (c1472bW != null) {
                        c1472bW.i(c1472b);
                    } else {
                        this.f9974o.A(c1472b);
                        this.f9968h = null;
                    }
                }
                if (this.f9974o.d() < i7) {
                    this.f9974o.u();
                }
                d dVar2 = this.f9974o;
                dVar2.r(dVar2.e().h(i7).a(this.f9970j));
                this.f9974o.z(i7);
                d dVar3 = this.f9974o;
                int i8 = this.f9982d;
                this.f9982d = -1;
                if (i8 >= 0) {
                    int[] iArr = dVar3.f9971k;
                    kotlin.jvm.internal.l.f("<this>", iArr);
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i8;
                    dVar3.f9971k = iArrCopyOf;
                } else {
                    dVar3.getClass();
                }
                d dVar4 = this.f9974o;
                m mVar = this.f9970j;
                dVar4.getClass();
                synchronized (obj) {
                    dVar4.f9970j = dVar4.f9970j.m(mVar);
                    d dVar5 = this.f9974o;
                    int[] iArr2 = this.f9971k;
                    dVar5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = dVar5.f9971k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            kotlin.jvm.internal.l.c(iArrCopyOf2);
                            iArr2 = iArrCopyOf2;
                        }
                        dVar5.f9971k = iArr2;
                    }
                }
                this.f9973m = true;
                if (!this.f9975p) {
                    this.f9975p = true;
                    this.f9974o.l();
                }
                return j.f9983b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
