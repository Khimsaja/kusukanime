package L1;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class a extends G1.g {

    /* renamed from: o, reason: collision with root package name */
    public Bitmap f6003o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ b f6004p;

    public a(b bVar) {
        this.f6004p = bVar;
    }

    @Override // G1.g
    public final void f() {
        this.f6003o = null;
        this.f575l = 0;
        this.f2614m = 0L;
        this.f2615n = false;
    }

    @Override // G1.g
    public final void g() {
        this.f6004p.l(this);
    }
}
