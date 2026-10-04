package S2;

import android.graphics.Bitmap;
import d3.C0789a;
import d3.C0797i;

/* loaded from: classes.dex */
public final class j extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public m f8742k;

    /* renamed from: l, reason: collision with root package name */
    public C0789a f8743l;

    /* renamed from: m, reason: collision with root package name */
    public C0797i f8744m;

    /* renamed from: n, reason: collision with root package name */
    public c f8745n;

    /* renamed from: o, reason: collision with root package name */
    public Bitmap f8746o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f8747p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ m f8748q;

    /* renamed from: r, reason: collision with root package name */
    public int f8749r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, U3.c cVar) {
        super(cVar);
        this.f8748q = mVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f8747p = obj;
        this.f8749r |= Integer.MIN_VALUE;
        return m.a(this.f8748q, null, 0, this);
    }
}
