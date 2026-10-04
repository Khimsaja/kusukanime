package androidx.compose.ui.focus;

import a0.q;
import e4.k;
import f0.C0862o;

/* loaded from: classes.dex */
public abstract class a {
    public static final q a(C0862o c0862o) {
        return new FocusRequesterElement(c0862o);
    }

    public static final q b(q qVar, k kVar) {
        return qVar.k(new FocusChangedElement(kVar));
    }
}
