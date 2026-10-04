package androidx.compose.foundation;

import a0.n;
import a0.p;
import a0.q;
import q.C1816D;
import u.k;
import y0.S;

/* loaded from: classes.dex */
public abstract class c {
    static {
        new S() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            public final boolean equals(Object obj) {
                return this == obj;
            }

            @Override // y0.S
            public final p h() {
                return new C1816D();
            }

            public final int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // y0.S
            public final /* bridge */ /* synthetic */ void m(p pVar) {
            }
        };
    }

    public static final q a(q qVar, boolean z7, k kVar) {
        return qVar.k(z7 ? new FocusableElement(kVar) : n.a);
    }
}
