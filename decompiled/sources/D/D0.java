package D;

import O.C0525y;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e5.AbstractC0832b;
import j0.C1296b;
import j0.InterfaceC1298d;
import q.C1837t;
import y0.C2351F;

/* loaded from: classes.dex */
public final class D0 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1010l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O.Z f1011m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D0(int i7, O.Z z7) {
        super(1);
        this.f1010l = i7;
        this.f1011m = z7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        O3.C c2 = O3.C.a;
        O.Z z7 = this.f1011m;
        switch (this.f1010l) {
            case 0:
                ((e4.k) z7.getValue()).invoke(new g0.c(((g0.c) obj).a));
                return c2;
            case 1:
                C2351F c2351f = (C2351F) obj;
                c2351f.b();
                float fX = c2351f.x(((C1837t) z7.getValue()).a);
                C1296b c1296b = c2351f.f17696k;
                float fB = g0.f.b(c1296b.d()) - (fX / 2);
                InterfaceC1298d.F(c2351f, ((C1837t) z7.getValue()).f14628b, AbstractC0832b.e(0.0f, fB), AbstractC0832b.e(g0.f.d(c1296b.d()), fB), fX, 0.0f, 496);
                return c2;
            case 2:
                return (Float) ((e4.k) z7.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
            default:
                Configuration configuration = new Configuration((Configuration) obj);
                C0525y c0525y = AndroidCompositionLocals_androidKt.a;
                z7.setValue(configuration);
                return c2;
        }
    }
}
