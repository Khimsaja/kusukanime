package a5;

import P3.r;
import P3.y;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.l;
import n5.AbstractC1586x;
import n5.Q;
import n5.b0;
import o5.C1709i;
import r4.AbstractC1880i;
import u4.InterfaceC2102h;

/* renamed from: a5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0669c implements InterfaceC0668b {
    public final Q a;

    /* renamed from: b, reason: collision with root package name */
    public C1709i f10450b;

    public C0669c(Q q6) {
        l.f("projection", q6);
        this.a = q6;
        q6.a();
        b0 b0Var = b0.f13390m;
    }

    @Override // a5.InterfaceC0668b
    public final Q a() {
        return this.a;
    }

    @Override // n5.M
    public final AbstractC1880i d() {
        AbstractC1880i abstractC1880iD = this.a.b().t0().d();
        l.e("getBuiltIns(...)", abstractC1880iD);
        return abstractC1880iD;
    }

    @Override // n5.M
    public final boolean e() {
        return false;
    }

    @Override // n5.M
    public final /* bridge */ /* synthetic */ InterfaceC2102h f() {
        return null;
    }

    @Override // n5.M
    public final Collection g() {
        Q q6 = this.a;
        AbstractC1586x abstractC1586xB = q6.a() == b0.f13392o ? q6.b() : d().o();
        l.c(abstractC1586xB);
        return r.H(abstractC1586xB);
    }

    @Override // n5.M
    public final List getParameters() {
        return y.f7779k;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.a + ')';
    }
}
