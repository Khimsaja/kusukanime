package a5;

import kotlin.jvm.internal.l;
import l4.AbstractC1420H;
import n5.AbstractC1586x;
import n5.Q;
import n5.T;
import n5.b0;
import u4.InterfaceC2102h;
import v4.h;

/* renamed from: a5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0670d extends T {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10451b;

    /* renamed from: c, reason: collision with root package name */
    public final T f10452c;

    public /* synthetic */ C0670d(T t7, int i7) {
        this.f10451b = i7;
        this.f10452c = t7;
    }

    @Override // n5.T
    public boolean a() {
        switch (this.f10451b) {
            case 0:
                return this.f10452c.a();
            default:
                return super.a();
        }
    }

    @Override // n5.T
    public boolean b() {
        switch (this.f10451b) {
            case 0:
                return true;
            default:
                return super.b();
        }
    }

    @Override // n5.T
    public final h c(h hVar) {
        switch (this.f10451b) {
            case 0:
                l.f("annotations", hVar);
                break;
            default:
                l.f("annotations", hVar);
                break;
        }
        return this.f10452c.c(hVar);
    }

    @Override // n5.T
    public final Q d(AbstractC1586x abstractC1586x) {
        switch (this.f10451b) {
            case 0:
                Q qD = this.f10452c.d(abstractC1586x);
                if (qD == null) {
                    return null;
                }
                InterfaceC2102h interfaceC2102hF = abstractC1586x.t0().f();
                return AbstractC1420H.r(qD, interfaceC2102hF instanceof u4.Q ? (u4.Q) interfaceC2102hF : null);
            default:
                return this.f10452c.d(abstractC1586x);
        }
    }

    @Override // n5.T
    public final boolean e() {
        switch (this.f10451b) {
        }
        return this.f10452c.e();
    }

    @Override // n5.T
    public final AbstractC1586x f(AbstractC1586x abstractC1586x, b0 b0Var) {
        switch (this.f10451b) {
            case 0:
                l.f("topLevelType", abstractC1586x);
                l.f("position", b0Var);
                break;
            default:
                l.f("topLevelType", abstractC1586x);
                l.f("position", b0Var);
                break;
        }
        return this.f10452c.f(abstractC1586x, b0Var);
    }
}
