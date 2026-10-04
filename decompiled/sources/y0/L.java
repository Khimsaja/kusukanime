package y0;

import java.util.Map;
import w0.InterfaceC2174I;

/* loaded from: classes.dex */
public final class L implements InterfaceC2174I {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f17766c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e4.k f17767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N f17768e;

    public L(int i7, int i8, Map map, e4.k kVar, N n7) {
        this.a = i7;
        this.f17765b = i8;
        this.f17766c = map;
        this.f17767d = kVar;
        this.f17768e = n7;
    }

    @Override // w0.InterfaceC2174I
    public final int e() {
        return this.f17765b;
    }

    @Override // w0.InterfaceC2174I
    public final int l() {
        return this.a;
    }

    @Override // w0.InterfaceC2174I
    public final Map m() {
        return this.f17766c;
    }

    @Override // w0.InterfaceC2174I
    public final void n() {
        this.f17767d.invoke(this.f17768e.f17773s);
    }

    @Override // w0.InterfaceC2174I
    public final e4.k o() {
        return null;
    }
}
