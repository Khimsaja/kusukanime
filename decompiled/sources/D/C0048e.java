package D;

import H.C0208z;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import e0.C0811c;
import h0.AbstractC0968M;
import h0.C0985h;
import h0.C0990m;
import h0.C0991n;

/* renamed from: D.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048e extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1138l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f1139m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0048e(long j7, int i7) {
        super(1);
        this.f1138l = i7;
        this.f1139m = j7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f1138l) {
            case 0:
                C0811c c0811c = (C0811c) obj;
                float fD = g0.f.d(c0811c.f11335k.d()) / 2.0f;
                C0985h c0985hL = android.support.v4.media.session.b.l(c0811c, fD);
                int i7 = Build.VERSION.SDK_INT;
                long j7 = this.f1139m;
                return c0811c.b(new C0046d(fD, c0985hL, new C0990m(j7, 5, i7 >= 29 ? C0991n.a.a(j7, 5) : new PorterDuffColorFilter(AbstractC0968M.w(j7), AbstractC0968M.z(5)))));
            default:
                ((F0.i) obj).j(H.A.f2870c, new C0208z(V.f1103k, this.f1139m, 2, true));
                return O3.C.a;
        }
    }
}
