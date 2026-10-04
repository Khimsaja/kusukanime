package F5;

/* loaded from: classes.dex */
public final class s extends q {

    /* renamed from: o, reason: collision with root package name */
    public final i f2552o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(i iVar) {
        super(0);
        kotlin.jvm.internal.l.f("parentIterator", iVar);
        this.f2552o = iVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f2550n;
        this.f2550n = i7 + 2;
        Object[] objArr = this.f2548l;
        return new b(this.f2552o, objArr[i7], objArr[i7 + 1]);
    }
}
