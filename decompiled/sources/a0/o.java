package a0;

/* loaded from: classes.dex */
public interface o extends q {
    @Override // a0.q
    default Object a(Object obj, e4.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override // a0.q
    default boolean d(e4.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }
}
