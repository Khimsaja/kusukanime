package a0;

/* loaded from: classes.dex */
public interface q {
    Object a(Object obj, e4.n nVar);

    boolean d(e4.k kVar);

    default q k(q qVar) {
        return qVar == n.a ? this : new k(this, qVar);
    }
}
