package t4;

import e4.InterfaceC0821a;
import java.util.List;
import v4.AbstractC2157e;
import v4.C2159g;

/* renamed from: t4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2060k implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16063k;

    /* renamed from: l, reason: collision with root package name */
    public final o f16064l;

    public /* synthetic */ C2060k(o oVar, int i7) {
        this.f16063k = i7;
        this.f16064l = oVar;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f16063k) {
            case 0:
                List listH = P3.r.H(AbstractC2157e.a(this.f16064l.a.f17339n, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING"));
                return listH.isEmpty() ? C2159g.a : new v4.i(0, listH);
            default:
                return this.f16064l.a.f17339n.e();
        }
    }
}
