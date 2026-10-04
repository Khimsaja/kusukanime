package s3;

import com.kusukanime.data.EpisodeRef;
import e4.InterfaceC0821a;

/* renamed from: s3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2004k implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15714k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e4.k f15715l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ EpisodeRef f15716m;

    public /* synthetic */ C2004k(e4.k kVar, EpisodeRef episodeRef, int i7) {
        this.f15714k = i7;
        this.f15715l = kVar;
        this.f15716m = episodeRef;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f15714k) {
            case 0:
                this.f15715l.invoke(this.f15716m.getSlug());
                break;
            case 1:
                this.f15715l.invoke(this.f15716m.getSlug());
                break;
            case 2:
                this.f15715l.invoke(this.f15716m.getSlug());
                break;
            case 3:
                this.f15715l.invoke(this.f15716m.getSlug());
                break;
            default:
                this.f15715l.invoke(this.f15716m.getSlug());
                break;
        }
        return O3.C.a;
    }
}
