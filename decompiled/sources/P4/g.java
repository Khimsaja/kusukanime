package P4;

import A4.AbstractC0011d;
import R4.F;
import X4.C0617n;
import e5.C0833c;
import l5.EnumC1457j;
import l5.InterfaceC1458k;
import z4.C2491c;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class g implements InterfaceC1458k {

    /* renamed from: k, reason: collision with root package name */
    public final C0833c f7798k;

    /* renamed from: l, reason: collision with root package name */
    public final C0833c f7799l;

    /* renamed from: m, reason: collision with root package name */
    public final C2491c f7800m;

    public g(C2491c c2491c, F f5, V4.f fVar, boolean z7, EnumC1457j enumC1457j) {
        kotlin.jvm.internal.l.f("kotlinClass", c2491c);
        kotlin.jvm.internal.l.f("packageProto", f5);
        kotlin.jvm.internal.l.f("nameResolver", fVar);
        C0833c c0833c = new C0833c(C0833c.e(AbstractC0011d.a(c2491c.a)));
        Q4.b bVar = c2491c.f19031b;
        C0833c c0833cC = null;
        String str = ((Q4.a) bVar.f8005c) == Q4.a.f8001s ? (String) bVar.f8010h : null;
        if (str != null && str.length() > 0) {
            c0833cC = C0833c.c(str);
        }
        this.f7798k = c0833c;
        this.f7799l = c0833cC;
        this.f7800m = c2491c;
        C0617n c0617n = U4.j.f9309m;
        kotlin.jvm.internal.l.e("packageModuleName", c0617n);
        Integer num = (Integer) android.support.v4.media.session.b.w(f5, c0617n);
        if (num != null) {
            fVar.a(num.intValue());
        }
    }

    public final W4.b a() {
        W4.c cVar;
        C0833c c0833c = this.f7798k;
        String str = c0833c.a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            cVar = W4.c.f9618c;
            if (cVar == null) {
                C0833c.a(9);
                throw null;
            }
        } else {
            cVar = new W4.c(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        String strD = c0833c.d();
        kotlin.jvm.internal.l.e("getInternalName(...)", strD);
        return new W4.b(cVar, W4.e.e(AbstractC2510o.C0('/', strD, strD)));
    }

    public final String toString() {
        return g.class.getSimpleName() + ": " + this.f7798k;
    }
}
