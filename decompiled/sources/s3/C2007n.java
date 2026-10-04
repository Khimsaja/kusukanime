package s3;

import O.C0486d;
import O.C0510p;
import androidx.media3.exoplayer.ExoPlayer;
import com.kusukanime.data.AnimeDetail;
import com.kusukanime.data.EpisodeRef;
import e4.InterfaceC0821a;
import java.util.List;

/* renamed from: s3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2007n implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15750k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e4.k f15751l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f15752m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f15753n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f15754o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f15755p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f15756q;

    public /* synthetic */ C2007n(Object obj, Object obj2, Object obj3, e4.k kVar, InterfaceC0821a interfaceC0821a, int i7, int i8) {
        this.f15750k = i8;
        this.f15754o = obj;
        this.f15755p = obj2;
        this.f15756q = obj3;
        this.f15751l = kVar;
        this.f15752m = interfaceC0821a;
        this.f15753n = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15750k) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC1994a.d((AnimeDetail) this.f15754o, (EpisodeRef) this.f15755p, (EpisodeRef) this.f15756q, this.f15751l, this.f15752m, (C0510p) obj, C0486d.V(this.f15753n | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                y3.C.e((ExoPlayer) this.f15754o, (String) this.f15755p, (List) this.f15756q, this.f15751l, this.f15752m, (C0510p) obj, C0486d.V(this.f15753n | 1));
                break;
        }
        return O3.C.a;
    }
}
