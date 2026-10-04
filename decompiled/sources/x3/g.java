package x3;

import android.app.DownloadManager;

/* loaded from: classes.dex */
public final class g extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public DownloadManager f17325k;

    /* renamed from: l, reason: collision with root package name */
    public long f17326l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f17327m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f17328n;

    /* renamed from: o, reason: collision with root package name */
    public int f17329o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, U3.c cVar) {
        super(cVar);
        this.f17328n = hVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f17327m = obj;
        this.f17329o |= Integer.MIN_VALUE;
        return h.e(this.f17328n, null, 0L, this);
    }
}
