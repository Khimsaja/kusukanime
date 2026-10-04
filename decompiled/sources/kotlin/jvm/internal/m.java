package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class m implements h, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final int f12714k;

    public m(int i7) {
        this.f12714k = i7;
    }

    @Override // kotlin.jvm.internal.h
    public final int getArity() {
        return this.f12714k;
    }

    public final String toString() {
        String strJ = y.a.j(this);
        l.e("renderLambdaToString(...)", strJ);
        return strJ;
    }
}
