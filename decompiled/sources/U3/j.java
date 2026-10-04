package U3;

import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;

/* loaded from: classes.dex */
public abstract class j extends c implements kotlin.jvm.internal.h {
    private final int arity;

    public j(int i7, S3.c cVar) {
        super(cVar);
        this.arity = i7;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    @Override // U3.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strI = y.a.i(this);
        l.e("renderLambdaToString(...)", strI);
        return strI;
    }
}
