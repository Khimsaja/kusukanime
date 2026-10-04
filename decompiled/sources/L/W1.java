package L;

import java.util.ArrayList;
import w0.AbstractC2182Q;

/* loaded from: classes.dex */
public final class W1 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5399l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5400m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5401n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5402o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D.P0 f5403p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5404q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5405r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v.m0 f5406s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w0.b0 f5407t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5408u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5409v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Integer f5410w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5411x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Integer f5412y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, D.P0 p02, int i7, int i8, v.m0 m0Var, w0.b0 b0Var, int i9, int i10, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.f5399l = arrayList;
        this.f5400m = arrayList2;
        this.f5401n = arrayList3;
        this.f5402o = arrayList4;
        this.f5403p = p02;
        this.f5404q = i7;
        this.f5405r = i8;
        this.f5406s = m0Var;
        this.f5407t = b0Var;
        this.f5408u = i9;
        this.f5409v = i10;
        this.f5410w = num;
        this.f5411x = arrayList5;
        this.f5412y = num2;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        int i7;
        AbstractC2182Q abstractC2182Q = (AbstractC2182Q) obj;
        ArrayList arrayList = this.f5399l;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC2182Q.d(abstractC2182Q, (w0.S) arrayList.get(i8), 0, 0);
        }
        ArrayList arrayList2 = this.f5400m;
        int size2 = arrayList2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            AbstractC2182Q.d(abstractC2182Q, (w0.S) arrayList2.get(i9), 0, 0);
        }
        ArrayList arrayList3 = this.f5401n;
        int size3 = arrayList3.size();
        int i10 = 0;
        while (true) {
            i7 = this.f5408u;
            if (i10 >= size3) {
                break;
            }
            w0.S s7 = (w0.S) arrayList3.get(i10);
            int i11 = (this.f5404q - this.f5405r) / 2;
            w0.b0 b0Var = this.f5407t;
            AbstractC2182Q.d(abstractC2182Q, s7, this.f5406s.a(b0Var, b0Var.getLayoutDirection()) + i11, i7 - this.f5409v);
            i10++;
        }
        ArrayList arrayList4 = this.f5402o;
        int size4 = arrayList4.size();
        for (int i12 = 0; i12 < size4; i12++) {
            w0.S s8 = (w0.S) arrayList4.get(i12);
            Integer num = this.f5410w;
            AbstractC2182Q.d(abstractC2182Q, s8, 0, i7 - (num != null ? num.intValue() : 0));
        }
        D.P0 p02 = this.f5403p;
        if (p02 != null) {
            ArrayList arrayList5 = this.f5411x;
            int size5 = arrayList5.size();
            for (int i13 = 0; i13 < size5; i13++) {
                w0.S s9 = (w0.S) arrayList5.get(i13);
                Integer num2 = this.f5412y;
                kotlin.jvm.internal.l.c(num2);
                AbstractC2182Q.d(abstractC2182Q, s9, p02.a, i7 - num2.intValue());
            }
        }
        return O3.C.a;
    }
}
