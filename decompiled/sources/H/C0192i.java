package H;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import e0.C0811c;
import e4.InterfaceC0821a;
import h0.AbstractC0968M;
import h0.C0985h;
import h0.C0990m;
import h0.C0991n;

/* renamed from: H.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192i extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2982l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f2983m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f2984n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0192i(long j7, InterfaceC0821a interfaceC0821a, boolean z7) {
        super(1);
        this.f2982l = j7;
        this.f2983m = interfaceC0821a;
        this.f2984n = z7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        C0811c c0811c = (C0811c) obj;
        C0985h c0985hL = android.support.v4.media.session.b.l(c0811c, g0.f.d(c0811c.f11335k.d()) / 2.0f);
        int i7 = Build.VERSION.SDK_INT;
        long j7 = this.f2982l;
        return c0811c.b(new C0191h(this.f2983m, this.f2984n, c0985hL, new C0990m(j7, 5, i7 >= 29 ? C0991n.a.a(j7, 5) : new PorterDuffColorFilter(AbstractC0968M.w(j7), AbstractC0968M.z(5)))));
    }
}
