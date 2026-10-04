package j5;

import R4.J;
import e4.InterfaceC0821a;
import l5.C1465r;
import m5.C1519h;
import m5.C1523l;
import n5.AbstractC1586x;

/* renamed from: j5.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1361p implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12452k;

    /* renamed from: l, reason: collision with root package name */
    public final C1365t f12453l;

    /* renamed from: m, reason: collision with root package name */
    public final J f12454m;

    /* renamed from: n, reason: collision with root package name */
    public final C1465r f12455n;

    public /* synthetic */ C1361p(C1365t c1365t, J j7, C1465r c1465r, int i7) {
        this.f12452k = i7;
        this.f12453l = c1365t;
        this.f12454m = j7;
        this.f12455n = c1465r;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f12452k) {
            case 0:
                C1365t c1365t = this.f12453l;
                C1523l c1523l = c1365t.a.a.a;
                C1361p c1361p = new C1361p(c1365t, this.f12454m, this.f12455n, 2);
                c1523l.getClass();
                return new C1519h(c1523l, c1361p);
            case 1:
                C1365t c1365t2 = this.f12453l;
                C1523l c1523l2 = c1365t2.a.a.a;
                C1361p c1361p2 = new C1361p(c1365t2, this.f12454m, this.f12455n, 3);
                c1523l2.getClass();
                return new C1519h(c1523l2, c1361p2);
            case 2:
                C1365t c1365t3 = this.f12453l;
                AbstractC1368w abstractC1368wA = c1365t3.a(c1365t3.a.f12440c);
                kotlin.jvm.internal.l.c(abstractC1368wA);
                InterfaceC1346a interfaceC1346a = c1365t3.a.a.f12417e;
                AbstractC1586x returnType = this.f12455n.getReturnType();
                kotlin.jvm.internal.l.e("getReturnType(...)", returnType);
                return (b5.g) interfaceC1346a.S(abstractC1368wA, this.f12454m, returnType);
            default:
                C1365t c1365t4 = this.f12453l;
                AbstractC1368w abstractC1368wA2 = c1365t4.a(c1365t4.a.f12440c);
                kotlin.jvm.internal.l.c(abstractC1368wA2);
                InterfaceC1346a interfaceC1346a2 = c1365t4.a.a.f12417e;
                AbstractC1586x returnType2 = this.f12455n.getReturnType();
                kotlin.jvm.internal.l.e("getReturnType(...)", returnType2);
                return (b5.g) interfaceC1346a2.L(abstractC1368wA2, this.f12454m, returnType2);
        }
    }
}
