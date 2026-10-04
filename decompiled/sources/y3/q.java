package y3;

import H1.G;
import O.Z;
import androidx.media3.exoplayer.ExoPlayer;
import e4.InterfaceC0821a;
import y1.F;
import y1.J;
import y1.L;

/* loaded from: classes.dex */
public final class q implements J {
    public final /* synthetic */ InterfaceC0821a a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z f18337b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f18338c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f18339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f18340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18341f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Z f18342g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Z f18343h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z f18344i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Z f18345j;

    public q(int i7, long j7, long j8, Z z7, Z z8, Z z9, Z z10, Z z11, ExoPlayer exoPlayer, InterfaceC0821a interfaceC0821a) {
        this.a = interfaceC0821a;
        this.f18337b = z7;
        this.f18338c = exoPlayer;
        this.f18339d = j7;
        this.f18340e = j8;
        this.f18341f = i7;
        this.f18342g = z8;
        this.f18343h = z9;
        this.f18344i = z10;
        this.f18345j = z11;
    }

    @Override // y1.J
    public final void B(F f5) {
        kotlin.jvm.internal.l.f("error", f5);
        Z z7 = this.f18337b;
        if (((Boolean) z7.getValue()).booleanValue()) {
            return;
        }
        z7.setValue(Boolean.TRUE);
        this.a.invoke();
    }

    @Override // y1.J
    public final void w(int i7) {
        L l7 = this.f18338c;
        if (i7 == 2 || i7 == 3) {
            this.f18342g.setValue(Long.valueOf(((G) l7).S0()));
        }
        if (i7 == 4) {
            Z z7 = this.f18343h;
            if (!((Boolean) z7.getValue()).booleanValue()) {
                z7.setValue(Boolean.TRUE);
            }
        }
        Z z8 = this.f18344i;
        if (((Boolean) z8.getValue()).booleanValue() || i7 != 3) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        z8.setValue(bool);
        Z z9 = this.f18345j;
        if (((Boolean) z9.getValue()).booleanValue()) {
            return;
        }
        z9.setValue(bool);
        long j7 = this.f18339d;
        if (j7 > 3000) {
            ((Q4.c) l7).D0(5, j7);
            return;
        }
        long j8 = this.f18340e;
        if (j8 > 0) {
            ((Q4.c) l7).D0(5, j8);
            return;
        }
        int i8 = this.f18341f;
        if (i8 > 0) {
            ((Q4.c) l7).D0(5, i8 * 1000);
        }
    }
}
