package l5;

import e4.InterfaceC0821a;
import java.util.Collection;
import n5.AbstractC1569f;

/* renamed from: l5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1453f implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12771k;

    /* renamed from: l, reason: collision with root package name */
    public final C1455h f12772l;

    public /* synthetic */ C1453f(C1455h c1455h, int i7) {
        this.f12771k = i7;
        this.f12772l = c1455h;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        C1455h c1455h = this.f12772l;
        switch (this.f12771k) {
            case 0:
                g5.f fVar = g5.f.f11736m;
                g5.o.a.getClass();
                g5.l lVar = g5.l.f11754l;
                C4.c cVar = C4.c.f959k;
                return c1455h.i(fVar, lVar);
            default:
                c1455h.f12775g.getClass();
                C1456i c1456i = c1455h.f12778j;
                kotlin.jvm.internal.l.f("classDescriptor", c1456i);
                Collection collectionG = ((AbstractC1569f) c1456i.v()).g();
                kotlin.jvm.internal.l.e("getSupertypes(...)", collectionG);
                return collectionG;
        }
    }
}
