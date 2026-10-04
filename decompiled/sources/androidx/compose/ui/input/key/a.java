package androidx.compose.ui.input.key;

import a0.q;
import e4.k;

/* loaded from: classes.dex */
public abstract class a {
    public static final q a(k kVar) {
        return new KeyInputElement(kVar, null);
    }

    public static final q b(q qVar, k kVar) {
        return qVar.k(new KeyInputElement(null, kVar));
    }
}
