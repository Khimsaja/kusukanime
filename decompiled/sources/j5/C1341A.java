package j5;

import P3.F;
import R4.U;
import f1.AbstractC0870c;
import u4.AbstractC2115v;
import u4.InterfaceC2102h;
import u4.InterfaceC2118y;
import u4.P;

/* renamed from: j5.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1341A implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12398k;

    /* renamed from: l, reason: collision with root package name */
    public final C1344D f12399l;

    public /* synthetic */ C1341A(C1344D c1344d, int i7) {
        this.f12398k = i7;
        this.f12399l = c1344d;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12398k) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                C1356k c1356k = this.f12399l.a;
                W4.b bVarR = AbstractC0870c.R(c1356k.f12439b, iIntValue);
                boolean z7 = bVarR.f9617c;
                C1354i c1354i = c1356k.a;
                return z7 ? c1354i.b(bVarR) : AbstractC2115v.e(c1354i.f12414b, bVarR);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                C1356k c1356k2 = this.f12399l.a;
                W4.b bVarR2 = AbstractC0870c.R(c1356k2.f12439b, iIntValue2);
                if (!bVarR2.f9617c) {
                    InterfaceC2118y interfaceC2118y = c1356k2.a.f12414b;
                    kotlin.jvm.internal.l.f("<this>", interfaceC2118y);
                    InterfaceC2102h interfaceC2102hE = AbstractC2115v.e(interfaceC2118y, bVarR2);
                    if (interfaceC2102hE instanceof P) {
                        return (P) interfaceC2102hE;
                    }
                }
                return null;
            default:
                U u5 = (U) obj;
                kotlin.jvm.internal.l.f("it", u5);
                return F.L(u5, this.f12399l.a.f12441d);
        }
    }
}
