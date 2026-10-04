package w;

import java.util.List;
import java.util.Map;
import s.EnumC1903a0;
import w0.InterfaceC2174I;

/* loaded from: classes.dex */
public final class l implements InterfaceC2174I {
    public final m a;

    /* renamed from: b, reason: collision with root package name */
    public int f16739b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16740c;

    /* renamed from: d, reason: collision with root package name */
    public float f16741d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16742e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16743f;

    /* renamed from: g, reason: collision with root package name */
    public final M5.c f16744g;

    /* renamed from: h, reason: collision with root package name */
    public final T0.b f16745h;

    /* renamed from: i, reason: collision with root package name */
    public final long f16746i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f16747j;

    /* renamed from: k, reason: collision with root package name */
    public final int f16748k;

    /* renamed from: l, reason: collision with root package name */
    public final int f16749l;

    /* renamed from: m, reason: collision with root package name */
    public final int f16750m;

    /* renamed from: n, reason: collision with root package name */
    public final EnumC1903a0 f16751n;

    /* renamed from: o, reason: collision with root package name */
    public final int f16752o;

    /* renamed from: p, reason: collision with root package name */
    public final int f16753p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2174I f16754q;

    public l(m mVar, int i7, boolean z7, float f5, InterfaceC2174I interfaceC2174I, float f7, boolean z8, M5.c cVar, T0.b bVar, long j7, List list, int i8, int i9, int i10, EnumC1903a0 enumC1903a0, int i11, int i12) {
        this.a = mVar;
        this.f16739b = i7;
        this.f16740c = z7;
        this.f16741d = f5;
        this.f16742e = f7;
        this.f16743f = z8;
        this.f16744g = cVar;
        this.f16745h = bVar;
        this.f16746i = j7;
        this.f16747j = list;
        this.f16748k = i8;
        this.f16749l = i9;
        this.f16750m = i10;
        this.f16751n = enumC1903a0;
        this.f16752o = i11;
        this.f16753p = i12;
        this.f16754q = interfaceC2174I;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final boolean a(int i7, boolean z7) {
        m mVar;
        int i8;
        if (!this.f16743f) {
            ?? r02 = this.f16747j;
            if (!r02.isEmpty() && (mVar = this.a) != null && (i8 = this.f16739b - i7) >= 0 && i8 < mVar.f16767n) {
                m mVar2 = (m) P3.q.r0(r02);
                m mVar3 = (m) P3.q.A0(r02);
                mVar2.getClass();
                mVar3.getClass();
                int i9 = this.f16749l;
                int i10 = this.f16748k;
                if (i7 >= 0 ? Math.min(i10 - mVar2.f16765l, i9 - mVar3.f16765l) > i7 : Math.min((mVar2.f16765l + mVar2.f16767n) - i10, (mVar3.f16765l + mVar3.f16767n) - i9) > (-i7)) {
                    this.f16739b -= i7;
                    int size = r02.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        m mVar4 = (m) r02.get(i11);
                        mVar4.getClass();
                        mVar4.f16765l += i7;
                        int[] iArr = mVar4.f16770q;
                        int length = iArr.length;
                        for (int i12 = 0; i12 < length; i12++) {
                            boolean z8 = mVar4.f16756c;
                            if ((z8 && i12 % 2 == 1) || (!z8 && i12 % 2 == 0)) {
                                iArr[i12] = iArr[i12] + i7;
                            }
                        }
                        if (z7) {
                            int size2 = mVar4.f16755b.size();
                            for (int i13 = 0; i13 < size2; i13++) {
                                mVar4.f16764k.a(i13, mVar4.f16762i);
                            }
                        }
                    }
                    this.f16741d = i7;
                    if (!this.f16740c && i7 > 0) {
                        this.f16740c = true;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // w0.InterfaceC2174I
    public final int e() {
        return this.f16754q.e();
    }

    @Override // w0.InterfaceC2174I
    public final int l() {
        return this.f16754q.l();
    }

    @Override // w0.InterfaceC2174I
    public final Map m() {
        return this.f16754q.m();
    }

    @Override // w0.InterfaceC2174I
    public final void n() {
        this.f16754q.n();
    }

    @Override // w0.InterfaceC2174I
    public final e4.k o() {
        return this.f16754q.o();
    }
}
