package w;

import P3.F;
import java.util.List;
import w0.AbstractC2182Q;
import w0.S;
import y.InterfaceC2344y;

/* loaded from: classes.dex */
public final class m implements InterfaceC2344y {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16755b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16756c;

    /* renamed from: d, reason: collision with root package name */
    public final a0.c f16757d;

    /* renamed from: e, reason: collision with root package name */
    public final a0.h f16758e;

    /* renamed from: f, reason: collision with root package name */
    public final T0.k f16759f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16760g;

    /* renamed from: h, reason: collision with root package name */
    public final long f16761h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f16762i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f16763j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f16764k;

    /* renamed from: l, reason: collision with root package name */
    public int f16765l;

    /* renamed from: m, reason: collision with root package name */
    public final int f16766m;

    /* renamed from: n, reason: collision with root package name */
    public final int f16767n;

    /* renamed from: o, reason: collision with root package name */
    public final int f16768o;

    /* renamed from: p, reason: collision with root package name */
    public int f16769p = Integer.MIN_VALUE;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f16770q;

    public m(int i7, List list, boolean z7, a0.c cVar, a0.h hVar, T0.k kVar, int i8, int i9, int i10, long j7, Object obj, Object obj2, androidx.compose.foundation.lazy.layout.a aVar, long j8) {
        this.a = i7;
        this.f16755b = list;
        this.f16756c = z7;
        this.f16757d = cVar;
        this.f16758e = hVar;
        this.f16759f = kVar;
        this.f16760g = i10;
        this.f16761h = j7;
        this.f16762i = obj;
        this.f16763j = obj2;
        this.f16764k = aVar;
        int size = list.size();
        int i11 = 0;
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            S s7 = (S) list.get(i12);
            boolean z8 = this.f16756c;
            i11 += z8 ? s7.f16841l : s7.f16840k;
            iMax = Math.max(iMax, !z8 ? s7.f16841l : s7.f16840k);
        }
        this.f16766m = i11;
        int i13 = i11 + this.f16760g;
        this.f16767n = i13 >= 0 ? i13 : 0;
        this.f16768o = iMax;
        this.f16770q = new int[this.f16755b.size() * 2];
    }

    @Override // y.InterfaceC2344y
    public final int a() {
        return this.f16755b.size();
    }

    @Override // y.InterfaceC2344y
    public final int b() {
        return this.f16767n;
    }

    @Override // y.InterfaceC2344y
    public final long c(int i7) {
        int i8 = i7 * 2;
        int[] iArr = this.f16770q;
        return F.b(iArr[i8], iArr[i8 + 1]);
    }

    @Override // y.InterfaceC2344y
    public final int d() {
        return 1;
    }

    @Override // y.InterfaceC2344y
    public final Object e(int i7) {
        return ((S) this.f16755b.get(i7)).h();
    }

    @Override // y.InterfaceC2344y
    public final int f() {
        return 0;
    }

    public final void g(AbstractC2182Q abstractC2182Q) {
        if (this.f16769p == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        List list = this.f16755b;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            S s7 = (S) list.get(i7);
            boolean z7 = this.f16756c;
            if (z7) {
                int i8 = s7.f16841l;
            } else {
                int i9 = s7.f16840k;
            }
            long jC = c(i7);
            this.f16764k.a(i7, this.f16762i);
            long jC2 = T0.h.c(jC, this.f16761h);
            if (z7) {
                AbstractC2182Q.j(abstractC2182Q, s7, jC2);
            } else {
                AbstractC2182Q.h(abstractC2182Q, s7, jC2);
            }
        }
    }

    @Override // y.InterfaceC2344y
    public final Object getKey() {
        return this.f16762i;
    }

    public final void h(int i7, int i8, int i9) {
        int i10;
        this.f16765l = i7;
        boolean z7 = this.f16756c;
        this.f16769p = z7 ? i9 : i8;
        List list = this.f16755b;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            S s7 = (S) list.get(i11);
            int i12 = i11 * 2;
            int[] iArr = this.f16770q;
            if (z7) {
                a0.c cVar = this.f16757d;
                if (cVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
                }
                iArr[i12] = cVar.a(s7.f16840k, i8, this.f16759f);
                iArr[i12 + 1] = i7;
                i10 = s7.f16841l;
            } else {
                iArr[i12] = i7;
                int i13 = i12 + 1;
                a0.h hVar = this.f16758e;
                if (hVar == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false");
                }
                iArr[i13] = hVar.a(s7.f16841l, i9);
                i10 = s7.f16840k;
            }
            i7 += i10;
        }
    }
}
