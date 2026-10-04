package t3;

import P3.q;
import e4.InterfaceC0821a;
import x.C2240n;
import x.v;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16005k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f16006l;

    public /* synthetic */ k(v vVar, int i7) {
        this.f16005k = i7;
        this.f16006l = vVar;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f16005k) {
            case 0:
                C2240n c2240n = (C2240n) q.B0(this.f16006l.g().f17230g);
                if (c2240n != null) {
                    return Integer.valueOf(c2240n.a);
                }
                return null;
            default:
                C2240n c2240n2 = (C2240n) q.B0(this.f16006l.g().f17230g);
                if (c2240n2 != null) {
                    return Integer.valueOf(c2240n2.a);
                }
                return null;
        }
    }
}
