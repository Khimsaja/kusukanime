package d0;

import X4.y;
import e4.k;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.t;
import s0.C1967l;
import y0.n0;

/* loaded from: classes.dex */
public final class d extends m implements k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11196l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f11197m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(y yVar, e eVar, t tVar) {
        super(1);
        this.f11197m = tVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f11196l) {
            case 0:
                if (!((e) obj).f10414w) {
                    break;
                } else {
                    t tVar = this.f11197m;
                    tVar.f12716k = tVar.f12716k;
                    break;
                }
            default:
                if (!((C1967l) obj).f15467x) {
                    break;
                } else {
                    this.f11197m.f12716k = false;
                    break;
                }
        }
        return n0.f17881k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t tVar) {
        super(1);
        this.f11197m = tVar;
    }
}
