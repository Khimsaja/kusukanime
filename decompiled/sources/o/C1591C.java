package o;

import p.C1752g0;
import p.q0;

/* renamed from: o.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1591C extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f13468l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1592D f13469m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1591C(C1592D c1592d, int i7) {
        super(1);
        this.f13468l = i7;
        this.f13469m = c1592d;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f13468l) {
            case 0:
                q0 q0Var = (q0) obj;
                EnumC1624v enumC1624v = EnumC1624v.f13538k;
                EnumC1624v enumC1624v2 = EnumC1624v.f13539l;
                boolean zB = q0Var.b(enumC1624v, enumC1624v2);
                C1752g0 c1752g0 = null;
                C1592D c1592d = this.f13469m;
                if (zB) {
                    C1593E c1593e = c1592d.f13470A;
                } else if (q0Var.b(enumC1624v2, EnumC1624v.f13540m)) {
                    C1602N c1602n = c1592d.f13471B.a;
                } else {
                    c1752g0 = AbstractC1628z.f13553d;
                }
                return c1752g0 == null ? AbstractC1628z.f13553d : c1752g0;
            default:
                q0 q0Var2 = (q0) obj;
                EnumC1624v enumC1624v3 = EnumC1624v.f13538k;
                EnumC1624v enumC1624v4 = EnumC1624v.f13539l;
                boolean zB2 = q0Var2.b(enumC1624v3, enumC1624v4);
                C1592D c1592d2 = this.f13469m;
                if (zB2) {
                    c1592d2.f13470A.a.getClass();
                    return AbstractC1628z.f13552c;
                }
                if (!q0Var2.b(enumC1624v4, EnumC1624v.f13540m)) {
                    return AbstractC1628z.f13552c;
                }
                c1592d2.f13471B.a.getClass();
                return AbstractC1628z.f13552c;
        }
    }
}
