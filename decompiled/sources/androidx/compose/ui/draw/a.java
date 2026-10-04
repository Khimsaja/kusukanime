package androidx.compose.ui.draw;

import a0.q;
import e4.k;
import h0.C0990m;
import n0.C1532C;

/* loaded from: classes.dex */
public abstract class a {
    public static final q a(q qVar, k kVar) {
        return qVar.k(new DrawBehindElement(kVar));
    }

    public static final q b(q qVar, k kVar) {
        return qVar.k(new DrawWithCacheElement(kVar));
    }

    public static final q c(q qVar, k kVar) {
        return qVar.k(new DrawWithContentElement(kVar));
    }

    public static q d(q qVar, C1532C c1532c, C0990m c0990m) {
        return qVar.k(new PainterElement(c1532c, c0990m));
    }
}
