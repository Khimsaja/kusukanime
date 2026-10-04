package c;

/* loaded from: classes.dex */
public final class v implements InterfaceC0741c {

    /* renamed from: k, reason: collision with root package name */
    public final q f11106k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f11107l;

    public v(x xVar, q qVar) {
        kotlin.jvm.internal.l.f("onBackPressedCallback", qVar);
        this.f11107l = xVar;
        this.f11106k = qVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [e4.a, kotlin.jvm.internal.j] */
    @Override // c.InterfaceC0741c
    public final void cancel() {
        x xVar = this.f11107l;
        P3.l lVar = xVar.f11109b;
        q qVar = this.f11106k;
        lVar.remove(qVar);
        if (kotlin.jvm.internal.l.a(xVar.f11110c, qVar)) {
            qVar.a();
            xVar.f11110c = null;
        }
        qVar.f11093b.remove(this);
        ?? r02 = qVar.f11094c;
        if (r02 != 0) {
            r02.invoke();
        }
        qVar.f11094c = null;
    }
}
