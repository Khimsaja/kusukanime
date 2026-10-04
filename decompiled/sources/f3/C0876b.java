package f3;

import T2.p;
import d3.AbstractC0798j;
import d3.C0793e;
import d3.C0803o;

/* renamed from: f3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0876b implements InterfaceC0880f {
    public final p a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0798j f11433b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11434c;

    public C0876b(p pVar, AbstractC0798j abstractC0798j, int i7) {
        this.a = pVar;
        this.f11433b = abstractC0798j;
        this.f11434c = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // f3.InterfaceC0880f
    public final void a() {
        this.a.getClass();
        AbstractC0798j abstractC0798j = this.f11433b;
        boolean z7 = abstractC0798j instanceof C0803o;
        new W2.a(abstractC0798j.a(), abstractC0798j.b().f11297w, this.f11434c, (z7 && ((C0803o) abstractC0798j).f11322g) ? false : true);
        if (z7) {
            return;
        }
        boolean z8 = abstractC0798j instanceof C0793e;
    }
}
