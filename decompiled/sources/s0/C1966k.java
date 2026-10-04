package s0;

import java.util.List;
import y.C2306F;
import y.C2319T;
import y0.n0;
import y0.o0;

/* renamed from: s0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1966k extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f15465l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f15466m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1966k(kotlin.jvm.internal.x xVar, int i7) {
        super(1);
        this.f15465l = i7;
        this.f15466m = xVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f15465l) {
            case 0:
                C1967l c1967l = (C1967l) obj;
                kotlin.jvm.internal.x xVar = this.f15466m;
                Object obj2 = xVar.f12720k;
                if (obj2 == null && c1967l.f15467x) {
                    xVar.f12720k = c1967l;
                } else if (obj2 != null) {
                    c1967l.getClass();
                }
                return Boolean.TRUE;
            default:
                o0 o0Var = (o0) obj;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", o0Var);
                C2306F c2306f = ((C2319T) o0Var).f17607x;
                kotlin.jvm.internal.x xVar2 = this.f15466m;
                List listM = (List) xVar2.f12720k;
                if (listM != null) {
                    listM.add(c2306f);
                } else {
                    listM = P3.r.M(c2306f);
                }
                xVar2.f12720k = listM;
                return n0.f17882l;
        }
    }
}
