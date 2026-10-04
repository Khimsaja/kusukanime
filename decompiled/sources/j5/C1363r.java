package j5;

import R4.J;
import com.kusukanime.data.EpisodeRef;
import e4.InterfaceC0821a;
import java.util.List;

/* renamed from: j5.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1363r implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12460k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f12461l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f12462m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f12463n;

    public C1363r(C1365t c1365t, boolean z7, J j7) {
        this.f12462m = c1365t;
        this.f12461l = z7;
        this.f12463n = j7;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        List listS0;
        switch (this.f12460k) {
            case 0:
                C1365t c1365t = (C1365t) this.f12462m;
                AbstractC1368w abstractC1368wA = c1365t.a(c1365t.a.f12440c);
                if (abstractC1368wA != null) {
                    boolean z7 = this.f12461l;
                    J j7 = (J) this.f12463n;
                    C1356k c1356k = c1365t.a;
                    listS0 = z7 ? P3.q.S0(c1356k.a.f12417e.p(abstractC1368wA, j7)) : P3.q.S0(c1356k.a.f12417e.u(abstractC1368wA, j7));
                } else {
                    listS0 = null;
                }
                return listS0 == null ? P3.y.f7779k : listS0;
            default:
                if (!this.f12461l) {
                    ((e4.k) this.f12462m).invoke(((EpisodeRef) this.f12463n).getSlug());
                }
                return O3.C.a;
        }
    }

    public C1363r(boolean z7, e4.k kVar, EpisodeRef episodeRef) {
        this.f12461l = z7;
        this.f12462m = kVar;
        this.f12463n = episodeRef;
    }
}
