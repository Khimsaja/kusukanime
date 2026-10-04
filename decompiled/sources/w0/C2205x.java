package w0;

import java.util.Map;
import y0.C2371s;
import y0.C2372t;

/* renamed from: w0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2205x implements InterfaceC2174I {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16886b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f16887c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2206y f16888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2169D f16889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e4.k f16890f;

    public C2205x(int i7, int i8, Map map, C2206y c2206y, C2169D c2169d, e4.k kVar) {
        this.a = i7;
        this.f16886b = i8;
        this.f16887c = map;
        this.f16888d = c2206y;
        this.f16889e = c2169d;
        this.f16890f = kVar;
    }

    @Override // w0.InterfaceC2174I
    public final int e() {
        return this.f16886b;
    }

    @Override // w0.InterfaceC2174I
    public final int l() {
        return this.a;
    }

    @Override // w0.InterfaceC2174I
    public final Map m() {
        return this.f16887c;
    }

    @Override // w0.InterfaceC2174I
    public final void n() {
        C2371s c2371s;
        boolean zS = this.f16888d.s();
        e4.k kVar = this.f16890f;
        C2169D c2169d = this.f16889e;
        if (!zS || (c2371s = ((C2372t) c2169d.f16816k.f17660G.f7173c).f17895U) == null) {
            kVar.invoke(((C2372t) c2169d.f16816k.f17660G.f7173c).f17773s);
        } else {
            kVar.invoke(c2371s.f17773s);
        }
    }

    @Override // w0.InterfaceC2174I
    public final e4.k o() {
        return null;
    }
}
