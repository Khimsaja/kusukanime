package H2;

import G2.AbstractC0170g;
import G2.C0174k;
import O.Z;
import o.C1593E;
import o.C1594F;
import o.C1613k;

/* loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3603l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f3604m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f3605n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f3606o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z f3607p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public B(i iVar, e4.k kVar, e4.k kVar2, Z z7, int i7) {
        super(1);
        this.f3603l = i7;
        switch (i7) {
            case 1:
                this.f3604m = iVar;
                this.f3605n = (kotlin.jvm.internal.m) kVar;
                this.f3606o = (kotlin.jvm.internal.m) kVar2;
                this.f3607p = z7;
                super(1);
                break;
            default:
                this.f3604m = iVar;
                this.f3605n = (kotlin.jvm.internal.m) kVar;
                this.f3606o = (kotlin.jvm.internal.m) kVar2;
                this.f3607p = z7;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v0, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // e4.k
    public final Object invoke(Object obj) {
        ?? r02 = this.f3605n;
        ?? r12 = this.f3606o;
        Z z7 = this.f3607p;
        i iVar = this.f3604m;
        switch (this.f3603l) {
            case 0:
                C1613k c1613k = (C1613k) obj;
                G2.y yVar = ((C0174k) c1613k.c()).f2703l;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination", yVar);
                h hVar = (h) yVar;
                if (((Boolean) iVar.f3614c.getValue()).booleanValue() || android.support.v4.media.session.b.e(z7)) {
                    int i7 = G2.y.f2756r;
                    for (G2.y yVar2 : AbstractC0170g.b(hVar)) {
                        if (yVar2 instanceof h) {
                            ((h) yVar2).getClass();
                        } else if (yVar2 instanceof f) {
                            ((f) yVar2).getClass();
                        }
                    }
                    return (C1593E) r02.invoke(c1613k);
                }
                int i8 = G2.y.f2756r;
                for (G2.y yVar3 : AbstractC0170g.b(hVar)) {
                    if (yVar3 instanceof h) {
                        ((h) yVar3).getClass();
                    } else if (yVar3 instanceof f) {
                        ((f) yVar3).getClass();
                    }
                }
                return (C1593E) r12.invoke(c1613k);
            default:
                C1613k c1613k2 = (C1613k) obj;
                G2.y yVar4 = ((C0174k) c1613k2.a()).f2703l;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination", yVar4);
                h hVar2 = (h) yVar4;
                if (((Boolean) iVar.f3614c.getValue()).booleanValue() || android.support.v4.media.session.b.e(z7)) {
                    int i9 = G2.y.f2756r;
                    for (G2.y yVar5 : AbstractC0170g.b(hVar2)) {
                        if (yVar5 instanceof h) {
                            ((h) yVar5).getClass();
                        } else if (yVar5 instanceof f) {
                            ((f) yVar5).getClass();
                        }
                    }
                    return (C1594F) r02.invoke(c1613k2);
                }
                int i10 = G2.y.f2756r;
                for (G2.y yVar6 : AbstractC0170g.b(hVar2)) {
                    if (yVar6 instanceof h) {
                        ((h) yVar6).getClass();
                    } else if (yVar6 instanceof f) {
                        ((f) yVar6).getClass();
                    }
                }
                return (C1594F) r12.invoke(c1613k2);
        }
    }
}
