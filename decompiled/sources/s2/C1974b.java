package s2;

import B1.AbstractC0015b;
import B1.K;
import j3.C1330p;
import j3.E;
import j3.G;
import j3.V;
import j3.X;
import java.util.List;

/* renamed from: s2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1974b implements InterfaceC1976d {

    /* renamed from: m, reason: collision with root package name */
    public static final C1330p f15511m = new C1330p(new q2.d(3), V.f12301l);

    /* renamed from: k, reason: collision with root package name */
    public final G f15512k;

    /* renamed from: l, reason: collision with root package name */
    public final long[] f15513l;

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1974b(j3.X r21) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.C1974b.<init>(j3.X):void");
    }

    @Override // s2.InterfaceC1976d
    public final int d(long j7) {
        int iA = K.a(this.f15513l, j7, false);
        if (iA < this.f15512k.size()) {
            return iA;
        }
        return -1;
    }

    @Override // s2.InterfaceC1976d
    public final long e(int i7) {
        AbstractC0015b.c(i7 < this.f15512k.size());
        return this.f15513l[i7];
    }

    @Override // s2.InterfaceC1976d
    public final List i(long j7) {
        int iD = K.d(this.f15513l, j7, false);
        if (iD != -1) {
            return (G) this.f15512k.get(iD);
        }
        E e7 = G.f12277l;
        return X.f12304o;
    }

    @Override // s2.InterfaceC1976d
    public final int m() {
        return this.f15512k.size();
    }
}
