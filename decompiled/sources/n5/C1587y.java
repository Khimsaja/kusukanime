package n5;

import java.util.List;
import o5.C1706f;

/* renamed from: n5.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1587y implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13421k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final M f13422l;

    public C1587y(g5.o oVar, List list, I i7, M m7, boolean z7) {
        this.f13422l = m7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        C1706f c1706f = (C1706f) obj;
        switch (this.f13421k) {
            case 0:
                kotlin.jvm.internal.l.f("refiner", c1706f);
                this.f13422l.f();
                break;
            default:
                kotlin.jvm.internal.l.f("kotlinTypeRefiner", c1706f);
                this.f13422l.f();
                break;
        }
        return null;
    }

    public C1587y(List list, I i7, M m7, boolean z7) {
        this.f13422l = m7;
    }
}
