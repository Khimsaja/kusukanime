package n5;

/* loaded from: classes.dex */
public final class D extends AbstractC1577n {

    /* renamed from: m, reason: collision with root package name */
    public final I f13355m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(B b4, I i7) {
        super(b4);
        kotlin.jvm.internal.l.f("attributes", i7);
        this.f13355m = i7;
    }

    @Override // n5.AbstractC1576m
    public final AbstractC1576m E0(B b4) {
        return new D(b4, this.f13355m);
    }

    @Override // n5.AbstractC1576m, n5.AbstractC1586x
    public final I s0() {
        return this.f13355m;
    }
}
