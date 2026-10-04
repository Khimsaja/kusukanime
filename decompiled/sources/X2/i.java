package X2;

import O3.q;
import android.net.Uri;
import d3.C0801m;

/* loaded from: classes.dex */
public final class i implements f {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final q f9809b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9810c;

    public i(O3.i iVar, q qVar, boolean z7) {
        this.a = iVar;
        this.f9809b = qVar;
        this.f9810c = z7;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [O3.i, java.lang.Object] */
    @Override // X2.f
    public final g a(Object obj, C0801m c0801m) {
        Uri uri = (Uri) obj;
        if (kotlin.jvm.internal.l.a(uri.getScheme(), "http") || kotlin.jvm.internal.l.a(uri.getScheme(), "https")) {
            return new l(uri.toString(), c0801m, this.a, this.f9809b, this.f9810c);
        }
        return null;
    }
}
